
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String part1 = parts[0];
            int part2 = 0;
            if (parts.length > 1) {
                part2 = Integer.parseInt(parts[1]);
            } else {
                continue;
            }
            if (part1.equals("quit")) {
                break;
            } else if (part1.equals("add")) {
                if (part2 < 0) {
                    continue;
                }
                if ((first + part2) > 100) {
                    first = 100;
                } else {
                    first += part2;
                }

            } else if (part1.equals("move")) {
                if (part2 <= 0) {
                    continue;
                }
                if (part2 > first) {
                    part2 = first;
                    first = 0;
                    if ((second + part2) > 100) {
                        second = 100;
                    } else {
                        second += part2;
                    }
                } else if (part2 <= first && part2 > 0) {
                    first -= part2;
                    if ((second + part2) > 100) {
                        second = 100;
                    } else {
                        second += part2;
                    }

                }
            } else if (part1.equals("remove")) {

                if ((second - part2) < 0) {
                    second = 0;

                } else {
                    second -= part2;
                }

            }

        }
    }
}