
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Integer oddSum = 0;
        Integer evenSum = 0;

        Scanner sc = new Scanner(System.in);

        Statistics statistics = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int num = Integer.valueOf(sc.nextLine());
            if (num == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evenSum);
                System.out.println("Sum of odd numbers: " + oddSum);
                break;
            }
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            statistics.addNumber(num);

        }

    }
}
