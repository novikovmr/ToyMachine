package Controller;

import java.util.Scanner;

import ToyMachine.Machine;
import UI.UserUI;

public class UserController {
    
    private Machine machine;

    boolean flag;
    public UserController(Machine machine) {
        this.machine = machine;
    }

    public void controller() {
        flag = true;
        while (flag) {
            Scanner scan = new Scanner(System.in);
            UserUI.getMessage();
            int pick = Integer.parseInt(scan.nextLine());
            switch (pick) {
                case 1:
                    System.out.println("\n~~~~~Список доступных игрушек~~~~~\n");
                    machine.printToys();
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 2:
                    System.out.println("\n~~~~~Система редкости~~~~~\n");
                    UserUI.aboutDropChance();
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 3:
                    System.out.println("Выигранные игрушки");
                    machine.winToys();
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 4:
                    System.out.println("Испытываем судьбу");
                    machine.prize();
                    machine.deleteToy();
                    continuePrompt("Вернуться в главное меню? (Y)");
                    break;
                case 5:
                    machine.logPrize();
                    continuePrompt("Вернуться в главное меню? (Y)");
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
