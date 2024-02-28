package Controller;

import java.util.Scanner;

import ToyMachine.Machine;
import UI.AdminUi;
import UI.UserUI;

public class AdminController {
    boolean flag;
    Machine machine;
    

    public AdminController(Machine machine) {
        this.machine = machine;
    }

    public void controller(){
        flag = true;
        while(flag) {
            Scanner scan = new Scanner(System.in);
            AdminUi.getMessage();
            int pick = Integer.parseInt(scan.nextLine());
            switch (pick) {
                case 1:
                    System.out.println("\n~~~~~Список доступных игрушек~~~~~\n");
                    machine.printToys();
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 2:
                    System.out.println("\n~~~~~Добавление игрушки~~~~~\n");
                    //Метод добавления
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 3:
                    System.out.println("\n~~~~~Удаление игрушки~~~~~\n");
                    //Метод удаления
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 4:
                    System.out.println("\n~~~~~Изменить редкость~~~~~\n");
                    //Метод изменения редкости
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 5:
                    System.out.println("Завершение работы");
                    flag = false;
                    break;
                default:
                    System.out.println("Программа завершена");
                    flag = false;
                    break;
            }
        }
    }
    public void continuePrompt(String message) {
        System.out.println(message);
        Scanner scan2 = new Scanner(System.in);
        String pick2 = scan2.nextLine();
        if (pick2.equals("Y")) {
            flag = true;
        }
        else {
            flag = false;
        }
    }
}
