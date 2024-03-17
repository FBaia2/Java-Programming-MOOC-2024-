
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("From where?");
                int num1 = Integer.valueOf(scanner.nextLine());
                System.out.println("To where? ");
                int num2 = Integer.valueOf(scanner.nextLine());
                for (int line : numbers) {
                    int index = numbers.indexOf(line);
                    if (index <= num2 && index >= num1) {
                        System.out.println(line);
                    }
                }
                break;
            }

            numbers.add(number);
        }

    }
}
