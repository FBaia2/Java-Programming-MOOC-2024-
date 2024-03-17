
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int worst = 1000000;
        int counter = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                if (list.indexOf(worst) != -1) {
                    System.out.println("Smallest number: " + worst);
                    for (int i = 0; i < list.size() - 1; i++) {
                        counter++;
                        if (list.get(counter) == worst) {
                            System.out.println("Found at index " + counter);

                        }

                    }

                }

                break;
            }

            list.add(input);
            if (input < worst) {
                worst = input;
            }
        }

    }
}
