package DropChance;
import Toys.Toy;

public class DropRare extends DropChance{
    public DropRare(Toy toy) {
        super(toy);
    }
    
    public void setChance(){
        toy.setChance(20);
    }
}
