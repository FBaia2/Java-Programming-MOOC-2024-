import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            String titleString = scanner.nextLine();
            if (titleString.isEmpty()) {
                System.out.println("What information will be printed? ");
                String inf = scanner.nextLine();
                for (int i = 0; i < books.size(); i++) {
                    if (inf.equals("everything")) {
                        System.out.println(books.get(i).toString());
                    } else if (inf.equals("name")){
                        System.out.println(books.get(i).getTitle());

                    }
                        
                }
                
                
                break;
            }
            System.out.println("Pages: ");
            Integer pagesInteger = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            Integer pubInteger = Integer.valueOf(scanner.nextLine());
            books.add(new Book(titleString, pagesInteger, pubInteger));
        }

    }
}
