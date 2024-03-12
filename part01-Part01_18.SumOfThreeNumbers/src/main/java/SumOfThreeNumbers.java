
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int sum1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sum2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int sum3 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (sum1 + sum2 + sum3));

        // Write your program here

    }
}
