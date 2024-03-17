
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int best = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("The greatest number: " + best);
                break;
            }

            list.add(input);
            if (input > best) {
                best = input;
            }
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
    }
}
