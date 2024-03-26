import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            if (word.equals("stop")) {
                break;

            } else if (word.equals("add")) {
                System.out.println("To add: ");
                String word1 = scanner.nextLine();
                this.list.add(word1);

            } else if (word.equals("remove")) {
                System.out.println("Which one is removed? ");
                String word3 = scanner.nextLine();
                this.list.remove(Integer.valueOf(word3));

            } else if (word.equals("list")) {
                this.list.print();
            }

        }

    }

}
