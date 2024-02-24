package ToyMachine;

import java.util.ArrayList;

import Toys.Toy;


public class Machine {
    Toy toy;
    int sizeMachine;
    ArrayList<Toy> toyList = new ArrayList<Toy>();
    /**
     * 
     * @param sizeMachine - Кол-во мест для игрушек
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
        Toy gift = randomize.prizeToy();
        // System.out.printf("Вы выиграли приз!\nname: %s, type: %s\n", gift.getToyName(), gift.getType());
        System.out.println("Вы выиграли приз!\n" + gift);
        System.out.println(randomize.res);
    }
}
