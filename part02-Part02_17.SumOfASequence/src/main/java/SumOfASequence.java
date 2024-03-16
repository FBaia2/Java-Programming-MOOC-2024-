
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int sum = 0;
        int num = Integer.valueOf(scanner.nextLine());
        for(int i = 1;i <= num; i++) {

            sum += i;
            

        }System.out.println("The sum is " + sum);
        

    }
}
