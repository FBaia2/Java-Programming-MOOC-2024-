
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int counter = 0;
        int wins = 0;
        int losses = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                if (team.equals(parts[0])) {
                    counter++;
                    if ((Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(parts[1])) {
                    counter++;
                    if ((Integer.valueOf(parts[3]) > Integer.valueOf(parts[2]))) {
                        wins++;
                    } else {
                        losses++;
                    }

                }

                // parts[0], Integer.parseInt(parts[2]));

            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
