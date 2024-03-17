
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Search for?");
                int num = Integer.valueOf(scanner.nextLine());
                if (list.indexOf(num) != -1) {
                    for (int i = 0; i < list.size() -1; i++) {
                        counter++;
                        if (list.get(counter) == num) {
                            System.out.println(num + " is at index " + counter);

                        }

                    }

                }

                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
    }
}
