import Controller.Controller;
import DropChance.DropCommon;
import DropChance.DropLegend;
import DropChance.DropRare;
import ToyMachine.Machine;
import Toys.Tecnical;
import Toys.TeddyBear;
import Toys.Toy;
import Toys.Transport;

public class App {
    public static void main(String[] args) throws Exception {
        Toy toy1 = new TeddyBear(1, "Mishka", "Мягкая игрушка");
        Toy toy2 = new Transport(2, "Nissan", "Техника");
        Toy toy3 = new TeddyBear(3, "Mishka Big", "Мягкая игрушка");
        Toy toy4 = new Tecnical(4, "Iphone", "Смартфон");
        Toy toy5 = new TeddyBear(5, "Bunny", "Мягкая игрушка");
        DropCommon toy1Common = new DropCommon(toy1);
        toy1Common.setChance();
        DropRare toy2Rare = new DropRare(toy2);
        toy2Rare.setChance();
        DropCommon toy3Common = new DropCommon(toy3);
        toy3Common.setChance();
        DropLegend toy4Legend = new DropLegend(toy4);
        toy4Legend.setChance();
        DropCommon toy5Common = new DropCommon(toy5);
        toy5Common.setChance();


        // System.out.println(toy1.getChance());
        // System.out.println(toy2.getChance());

        Machine machine1 = new Machine(5);

        machine1.addToy(toy1);
        machine1.addToy(toy2);
        machine1.addToy(toy3);
        machine1.addToy(toy4);
        machine1.addToy(toy5);
        // machine1.printToys();
        // machine1.prize();

        Controller ctr = new Controller(machine1);
        ctr.start();
        
    }
}
