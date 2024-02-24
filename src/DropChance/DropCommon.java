package DropChance;
import Toys.Toy;

public class DropCommon extends DropChance{

    public DropCommon(Toy toy) {
        super(toy);
    }
    
    public void setChance(){
        toy.setChance(90);
    }

    
}
