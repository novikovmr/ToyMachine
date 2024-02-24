package Toys;
public abstract class Toy {
    private int id;
    private String toyName;
    private String type;
    private int chance;


    public Toy(int id, String toyName, String type) {
        this.id = id;  
        this.toyName = toyName;
        this.type = type;
    }
    
    public int getId(){
        return id;
    };

    public String getToyName(){
        return toyName;
    }

    public int getChance(){
        return chance;
    }

    public String getType(){
        return type;
    }

    public void setChance(int value) {
        this.chance = value;
    }

    @Override
    public String toString() {
        
        return "id: " + this.getId() + ", name: " + this.getToyName() + ", type: " + this.getType() + ";\n";
    }
}

