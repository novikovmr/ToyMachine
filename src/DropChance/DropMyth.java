package DropChance;

import Toys.Toy;

public class DropMyth extends DropChance{

    public DropMyth(Toy toy) {
        super(toy);
    }

    @Override
    public void setChance() {
        toy.setChance(5);
    }
    
}
