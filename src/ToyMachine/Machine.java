package ToyMachine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Toys.Toy;


public class Machine {
    Toy toy;
    Toy gift;
    int sizeMachine;
    int index;
    ArrayList<Toy> toyList = new ArrayList<Toy>();
    ArrayList<Toy> prizeList = new ArrayList<Toy>();
    File prizeFile;
    /**
     * 
     * @param sizeMachine - Кол-во мест для игрушек в автомате
     */
    public Machine(int sizeMachine) {
        this.sizeMachine = sizeMachine;
    }
    
    /**
     * Метод для добавления игрушек в массив.
     * @param toy - Экзмепляр класса игрушки
     * 
     */
    public void addToy(Toy toy) {
        if(toyList.size() < sizeMachine) {
            toyList.add(toy);
        }
        else{
            //Реализовать ИСКЛЮЧЕНИЕ - "НЕТ МЕСТА" 
        }
        
    }

    /**
     * Метод для выведения списка игрушек на экран
     */
    public void printToys() {
        for(int i = 0; i < toyList.size(); i++) {
            System.out.printf("id: %d, name: %s, type: %s;\n", toyList.get(i).getId(), toyList.get(i).getToyName(), toyList.get(i).getType());
        }
    }

    /**
     * Метод для выигрыша приза 
     * @param gift Экзмепляр класса Toy, обработанный методом prizeToy() 
     * @param randomize Экземплятор класса для рандомной выдачи игрушки
     * @param prizeToy() Метод, который выдет рандомную игрушку.
     */
    public void prize() {
        Randomize randomize = new Randomize(toyList);
        gift = randomize.prizeToy();
        prizeList.add(gift);
        index = toyList.indexOf(gift);
        System.out.println("Вы выиграли приз!\n" + gift);
        System.out.println(randomize.res);
        System.out.println(index);
        
    }

    /**
     * Метод для удаления выигранной игрушки из общего списка
     */
    public void deleteToy() {
        toyList.remove(index);
    }

    /**
     * Метод для отображения выигранных игрушек
     */
    public void winToys(){
        for(int i = 0; i < prizeList.size(); i++) {
            System.out.println(prizeList.get(i));
        }
    }

    public void logPrize() {
        try {
            prizeFile = new File("Prize_List.txt");
            if(prizeFile.createNewFile()) {
                System.out.println("Файл создан!");
            }
            else {
                System.out.println("Файл уже создан");
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(prizeFile);
            for (int i = 0; i < prizeList.size(); i++)
            {
                writer.write(prizeList.get(i).toString() + "\n");
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
        }
    }
}
