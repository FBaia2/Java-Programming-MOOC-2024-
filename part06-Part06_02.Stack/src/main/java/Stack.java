import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public ArrayList<String> values() {
            return stacks;
        }

    


    public boolean isEmpty() {
        if (stacks.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
    public void add(String value) {
        stacks.add(value);
    }

    public String take() {
        String these = stacks.get(stacks.size()-1);
        stacks.remove(stacks.size()-1);
        return these;
    }




}
