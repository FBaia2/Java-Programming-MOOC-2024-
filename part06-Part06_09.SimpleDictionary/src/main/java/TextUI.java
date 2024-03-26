import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (word.equals("add")) {

                System.out.println("Word: ");
                String word1 = scanner.nextLine();

                System.out.println("Translation: ");
                String word2 = scanner.nextLine();
                dictionary.add(word1, word2);

            } else if (word.equals("search")) {
                System.out.println("To be translated: ");
                String word3 = scanner.nextLine();
                if (this.dictionary.translate(word3) == null) {
                    System.out.println("Word " + word3 + " was not found");
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(word3));
                }

            }

        }

    }

}
