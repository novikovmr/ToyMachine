package Controller;

import java.util.Scanner;

import ToyMachine.Machine;
import UI.Authorize;

public class Controller {
    Scanner scan;
    private Machine machine;
    public Controller (Machine machine){
        this.machine = machine;
    }
    
    public void start() {
        scan = new Scanner(System.in);
        Authorize.getMessage();
        int pick = Integer.parseInt(scan.nextLine());
        switch (pick) {
            case 1:
                // System.out.println("Вы пользователь");
                UserController user = new UserController(machine);
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
