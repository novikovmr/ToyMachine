package ToyMachine;

import java.util.ArrayList;
import java.util.Random;

import Toys.Toy;

public class Randomize {
    ArrayList<Toy> toyList;
    ArrayList<Toy> toyListCommon = new ArrayList<Toy>();
    ArrayList<Toy> toyListRare = new ArrayList<Toy>();
    ArrayList<Toy> toyListMyth = new ArrayList<Toy>();
    ArrayList<Toy> toyListLegend = new ArrayList<Toy>();


    Random rand;
    int res;

    public Randomize(ArrayList<Toy> toyList) {
        this.toyList = toyList;
    }
    
    public Toy prizeToy(){

        rand = new Random();
        Random rand1 = new Random();
        res = rand.nextInt(100) + 1;

        //Нужно добавить исключения, на случай, если в аппарате нет игрушек какой-то рарности
        for(int i = 0; i < toyList.size(); i++) {
            if(toyList.get(i).getChance() == 70) {
                toyListCommon.add(toyList.get(i));
            }
            else if(toyList.get(i).getChance() == 20) {
                toyListRare.add(toyList.get(i));
            }
            else if(toyList.get(i).getChance() == 5) {
                toyListMyth.add(toyList.get(i));
            }
            else {
                toyListLegend.add(toyList.get(i));
            }
        }
        if (res > 0 && res <= 70) {
            
            int chance = rand1.nextInt(toyListCommon.size());
            return toyListCommon.get(chance);
        }
        else if (res > 70 && res <= 90) {
            int chance = rand1.nextInt(toyListRare.size());
            return toyListRare.get(chance);
        }
        else if (res > 90 && res <= 95) {
            int chance = rand1.nextInt(toyListMyth.size());
            return toyListMyth.get(chance);
        }
        else {
            int chance = rand1.nextInt(toyListLegend.size());
            return toyListLegend.get(chance); 
        }

    }

}
