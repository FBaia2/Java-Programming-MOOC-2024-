
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
        int num = Integer.valueOf(scanner.nextLine());
        if (num == 0 && counter == 0) {
            System.out.println("Cannot calculate the average");
            break;
        } else if (num > 0) {
            sum += num;
            counter += 1;
        } else if (num < 0) {
            continue;
        } else if (num == 0 && counter != 0) {
            System.out.println((double)sum/counter);
            break;
        }
        
            

    }
}
}