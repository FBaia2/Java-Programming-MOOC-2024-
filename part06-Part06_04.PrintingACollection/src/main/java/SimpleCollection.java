
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    @Override
    public String toString() {

        String printOutput = "The collection "+name+" is empty. ";


        if (elements.isEmpty()) {
            return printOutput;
        }


        // we form a string from the people on the list
        String letas = "";

        for (String a : elements) {
            letas = letas + a + "\n";
        }

        return "The collection "+name+" has "+elements.size()+
        " element:" + "\n" + letas;
    }
    
}
