import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int sumOfWeights;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>(); 
    }

    public void addItem(Item item) {
        if (sumOfWeights + item.getWeight() <= maxWeight) {
            this.items.add(item);
            sumOfWeights += item.getWeight(); 
        }
    }

    public void printItems() {
        for(Item i : items) {
            System.out.println(i);
        }

    }
    public int totalWeight() {
        return sumOfWeights;

    }


    public Item heaviestItem() {
        
        if (this.items.isEmpty()) {
            return null;
        }
    
        
        Item returnObject = this.items.get(0);
    
        
        for (Item prs: this.items) {
            
    
            if (returnObject.getWeight() < prs.getWeight()) {
                
                returnObject = prs;
            }
        }
    
        
        return returnObject;
    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (0 kg)";

        } else if (items.size() == 1) {

            return "" + items.size() + " item (" + sumOfWeights + " kg)";

        }
        return "" + items.size() + " items (" + sumOfWeights + " kg)";
    }
}
