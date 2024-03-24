public class Item {
    private String name;
    private int wheight;


    public Item(String name, int wheight) {
        this.name = name;
        this.wheight = wheight;

    }
    public String getName(){
        return name;
    }

    public int getWeight(){
        return wheight;
    }
    public String toString(){
        return ""+name+" ("+wheight+" kg)";

    }
    
}
