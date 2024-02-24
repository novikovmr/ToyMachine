package DropChance;
import Toys.Toy;

public abstract class DropChance {
    Toy toy;

    public DropChance(Toy toy) {
        this.toy = toy;
    }
    abstract public void setChance(); 
}
