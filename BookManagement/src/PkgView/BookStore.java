
package PkgView;

import PkbBasic.DetectiveBook;
import PkgValid.Validation;
import PkbBasic.Book;

public class BookStore {
    public static Book subMenu() {
        int choice;
        Book book = null;
        
        do {
            choice = 0;
            
            // Menu
            System.out.println("\n    1. Create a Detective book");
            System.out.println("    2. Create a Anime book");
            System.out.println("    3. Create a Kid book");
            System.out.println("    4. Back to main menu");
            
            // Fetch choice
            try {
                choice = Validation.inputNNegNumber("       Please accept a choice: ");
            }
            catch (Exception e) {
                System.out.println("Invalid choice");
                continue;
            }
            
            // Do request
            switch (choice) {
                case 1:
                    book = new DetectiveBook();
                    ((DetectiveBook) book).inputDetective();
                    break;
                case 2:
                    book = new AnimeBook();
                    ((AnimeBook) book).inputAnime();
                    break;
                case 3:
                    book = new KidBook();
                    ((KidBook) book).inputKid();
                    break;
            }
        } while (choice < 4);
        
        return book;
    }
    
    public static void main(String[] args) {
        int choice;
        Book book = null;
               
        // Main menu
        do {
            choice = 0;
            
            // Menu
            System.out.println("\n1. Create a new book");
            System.out.println("2. Display the book");
            System.out.println("3. Update the book");
            System.out.println("4. Exit");
            
            // Fetch choice
            try {
                choice = Validation.inputNNegNumber("Please accept a choice: ");
            }
            catch (Exception e) {
                System.out.println("Invalid choice");
                continue;
            }
            
            // Do request
            switch (choice) {
                case 1:
                    Book temp = subMenu();
                    if (temp != null) book = temp;
                    break;
                case 2:
                    if (book == null) System.out.println("Book not found");
                    else
                        if (book instanceof DetectiveBook)
                            ((DetectiveBook) book).outputDetective();
                        else if (book instanceof AnimeBook)
                            ((AnimeBook) book).outputAnime();
                        else
                            ((KidBook) book).outputKid();
                    break;
                case 3:
                    if (book == null) System.out.println("Book not found");
                    else
                        if (book instanceof DetectiveBook)
                            ((DetectiveBook) book).updateDetective();
                        else if (book instanceof AnimeBook)
                            ((AnimeBook) book).updateAnime();
                        else
                            ((KidBook) book).updateKid();
                    break;
                default:
                    System.out.println("See you again!");
            }
        } while (choice < 4);
    }
}
