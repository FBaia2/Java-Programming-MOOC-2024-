
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        double divi = (double) num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + plus);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + divi);

        // Write your program here

    }
}
