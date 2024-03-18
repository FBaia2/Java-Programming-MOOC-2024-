import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int best = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Age of the oldest: " + best);
                break;
            }
            String[] pieces = input.split(",");
            if (pieces.length > 1) {
                nums.add(Integer.parseInt(pieces[1]));
                for (int i : nums) {
                    if (i > best) {
                        best = i;
                    }
                }
            }
        }
    }
}
