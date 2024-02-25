import Controller.Controller;
import DropChance.DropCommon;
import DropChance.DropRare;
import ToyMachine.Machine;
import Toys.TeddyBear;
import Toys.Toy;
import Toys.Transport;

public class App {
    public static void main(String[] args) throws Exception {
        Toy toy1 = new TeddyBear(1, "Mishka", "Мягкая игрушка");
        Toy toy2 = new Transport(2, "Nissan", "Техника");
        Toy toy3 = new TeddyBear(3, "Mishka Big", "Мягкая игрушка");
        DropCommon toy1Common = new DropCommon(toy1);
        toy1Common.setChance();
        DropRare toy2Rare = new DropRare(toy2);
        toy2Rare.setChance();
        DropCommon toy3Common = new DropCommon(toy3);
        toy3Common.setChance();
        // System.out.println(toy1.getChance());
        // System.out.println(toy2.getChance());

        Machine machine1 = new Machine(3);

        machine1.addToy(toy1);
        machine1.addToy(toy2);
        machine1.addToy(toy3);
        // machine1.printToys();
        // machine1.prize();

        Controller ctr = new Controller();
        ctr.start();
        
    }
}
