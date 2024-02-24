package DropChance;

import Toys.Toy;

public class DropLegend extends DropChance{

    public DropLegend(Toy toy) {
        super(toy);
    }

    @Override
    public void setChance() {
        toy.setChance(2);
    }
    
}
