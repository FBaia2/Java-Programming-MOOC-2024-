
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers: ");
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + counter);
                System.out.println("Average: " + ((double)sum/counter));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;

            } else {
                sum += num;
                counter +=1;
                if (num % 2 == 0) {
                    even += 1;

                } else {
                    odd +=1;
                }
            }
        }

    }
}
