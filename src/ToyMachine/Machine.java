package ToyMachine;

import java.util.ArrayList;

import Toys.Toy;

public class Machine {
    Toy toy;
    // ArrayList toyList;
    int sizeMachine;
    ArrayList<Toy> toyList = new ArrayList<Toy>();
    public Machine(int sizeMachine) {
        this.sizeMachine = sizeMachine;
    }
    
    public void addToy(Toy toy) {
        if(toyList.size() < sizeMachine) {
            toyList.add(toy);
        }
        else{
            //Реализовать ИСКЛЮЧЕНИЕ - "НЕТ МЕСТА" 
        }
        
    }

    public void printToys() {
        for(int i = 0; i < toyList.size(); i++) {
            System.out.printf("id: %d, name: %s, type: %s;\n", toyList.get(i).getId(), toyList.get(i).getToyName(), toyList.get(i).getType());
        }
    }
}
