
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a number:");
        if (num == 0) {
            break;
        } else {
            sum += num;
            counter += 1;
            
        }
          

    }System.out.println((double)sum/counter);
    
}
}