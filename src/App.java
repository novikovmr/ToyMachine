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
        DropCommon toy1Common = new DropCommon(toy1);
        toy1Common.setChance();
        DropRare toy2Rare = new DropRare(toy2);
        toy2Rare.setChance();
        // System.out.println(toy1.getChance());
        // System.out.println(toy2.getChance());

        Machine machine1 = new Machine(3);

        machine1.addToy(toy1);
        machine1.addToy(toy2);
        machine1.printToys();

        
    }
}
