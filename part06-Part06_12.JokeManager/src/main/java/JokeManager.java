import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> manager;

    public JokeManager() {
        this.manager = new ArrayList<>();

    }

    public void addJoke(String joke) {
        this.manager.add(joke);

    }

    public String drawJoke() {
        String thiss = "";
        if (manager == null || manager.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(manager.size());
            thiss = manager.get(index);
            return thiss;
        }
    }

    public void printJokes() {
        for (String jokes : manager) {
            System.out.println(jokes);

        }

    }
}
