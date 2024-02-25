package Controller;

import java.util.Scanner;

import UI.UserUI;

public class UserController {
    public void controller() {
        boolean flag = true;
        

        while (flag) {
            Scanner scan = new Scanner(System.in);
            UserUI.getMessage();
            int pick = Integer.parseInt(scan.nextLine());
            switch (pick) {
                
                case 1:
                    System.out.println("Список доступных игрушек");
                    
                    break;
                case 2:
                    System.out.println("Система редкости");
                    break;
                case 3:
                    System.out.println("Выигранные игрушки");
                    break;
                case 4:
                    System.out.println("Испытываем судьбу");
                    break;
                default:
                    System.out.println("Программа завершена");
                    flag = false;
                    break;
            }
        }
    }
}
