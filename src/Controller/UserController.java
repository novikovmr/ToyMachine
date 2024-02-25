package Controller;

import java.util.Scanner;

import ToyMachine.Machine;
import UI.UserUI;

public class UserController {
    
    private Machine machine;

    public UserController(Machine machine) {
        this.machine = machine;
    }

    public void controller() {
        boolean flag = true;
        

        while (flag) {
            Scanner scan = new Scanner(System.in);
            UserUI.getMessage();
            int pick = Integer.parseInt(scan.nextLine());
            switch (pick) {
                case 1:
                    System.out.println("\n~~~~~Список доступных игрушек~~~~~\n");
                    machine.printToys();
                    break;
                case 2:
                    System.out.println("\n~~~~~Система редкости~~~~~\n");
                    UserUI.aboutDropChance();
                    break;
                case 3:
                    System.out.println("Выигранные игрушки");
                    machine.winToys();
                    break;
                case 4:
                    System.out.println("Испытываем судьбу");
                    machine.prize();
                    machine.deleteToy();
                    break;
                case 5:
                    machine.logPrize();
                default:
                    System.out.println("Программа завершена");
                    flag = false;
                    break;
            }
        }
    }
}
