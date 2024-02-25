package Controller;

import java.util.Scanner;

import UI.Authorize;

public class Controller {
    Scanner scan;
    
    public void start() {
        scan = new Scanner(System.in);
        Authorize.getMessage();
        int pick = Integer.parseInt(scan.nextLine());
        switch (pick) {
            case 1:
                // System.out.println("Вы пользователь");
                UserController user = new UserController();
                user.controller();
                break;
            
            case 2:
                System.out.println("Вы админ");
                break;
            default:
                break;
        }
    }
}
