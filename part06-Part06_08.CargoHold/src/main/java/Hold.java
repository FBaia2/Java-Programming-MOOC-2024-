import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> cases;
    private int maxWeight;
    private int sumOfWeights;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (sumOfWeights + suitcase.totalWeight() <= maxWeight) {
            this.cases.add(suitcase);
            sumOfWeights += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase s : cases) {
            for (Item i : s.getItems()) {
                System.out.println(i);
            }
        }
    }
    

    @Override
    public String toString() {
        if (cases.isEmpty()) {
            return "no suitcases (0 kg)";
        } else {
            return cases.size() + (cases.size() == 1 ? " suitcase " : " suitcases ") + "(" + sumOfWeights + " kg)";
        }
    }
}


