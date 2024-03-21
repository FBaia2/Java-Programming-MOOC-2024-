import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String nameString = scanner.nextLine();
            if (nameString.isEmpty()) {
                System.out.println("Program's maximum duration? ");
                Integer maxD = Integer.valueOf(scanner.nextLine());
                for(int i = 0; i < programs.size(); i++) {
                    if (programs.get(i).getDuration() <= maxD) {
                        System.out.println(programs.get(i).toString());

                    }
                }
                break;
            }
            System.out.println("Duration: ");
            Integer durationInt = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(nameString, durationInt));
        }

    }
}
