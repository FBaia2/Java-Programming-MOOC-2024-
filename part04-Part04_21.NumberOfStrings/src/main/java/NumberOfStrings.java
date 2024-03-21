
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
while (true) {
    String line = scanner.nextLine();

    if (line.equals("end")) {
        System.out.println(counter);
        break;
    }
    counter += 1;
    // add the read line to a list for later
    // handling or handle the line immediately

}

    }
}
