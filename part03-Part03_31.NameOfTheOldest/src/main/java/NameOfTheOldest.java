import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();
        int oldestAge = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Name of the oldest: " + oldestName);
                break;
            }
            String[] pieces = input.split(",");
            if (pieces.length > 1) {
                String name = pieces[0];
                int age = Integer.parseInt(pieces[1]);
                names.add(name);
                ages.add(age);
                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = name;
                }
            }
        }
    }
}
