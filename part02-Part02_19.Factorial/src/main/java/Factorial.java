
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int best = 0;
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = num;
        for(int i = num; i >= 1; i--) {
            if (i == num) {
                continue;
            }
            sum *= i;
            
        }System.out.println("Factorial: "+ sum);

    }
}
