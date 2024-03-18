
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String best = "";
        double avgBirth = 0.0;
        int yearSum = 0;
        String longName = "";
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("Longest name: " + longName);
                System.out.println("Longest name: " + avgBirth);
                break;
            }
            String[] pieces = input.split(",");
            names.add(pieces[0]);
            years.add(Integer.parseInt(pieces[1]));
            yearSum += (Integer.parseInt(pieces[1]));
            avgBirth = (double) yearSum / years.size();
            for (String i : names) {
                if (i.length() > best.length()) {
                    best = i;
                    longName = best;

                }
            }

        }

    }
}
