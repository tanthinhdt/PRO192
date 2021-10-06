
package PkgView;

import PkbBasic.Book;
import PkgValid.Validation;

public class AnimeBook extends Book {
    // FIELDS
    private String pbl;
    
    // METHODS
    // Constructors
    public AnimeBook(String pbl, String code, String title) {
        super(code, title);
        this.pbl = pbl;
    }

    public AnimeBook() {
        this.pbl = null;
    }
    
    // Getters
    public String getPbl() {
        return pbl;
    }
    
    // Setters
    public void setPbl(String pbl) {
        this.pbl = pbl;
    }
    
    // Logical
    public void inputAnime() {
        boolean flag;
        inputBook();
        
        do {
            try {
                flag = false;
                pbl = Validation.inputString("       Publisher: ", "^[a-zA-Z]+$");
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
    
    public void outputAnime() {
        System.out.println(getCode() + " " + getTitle() + " " + pbl);
    }
    
    public void updateAnime() {
        boolean flag;
        updateBook();
        
        do {
            try {
                flag = false;
                String temp = Validation.inputString("Publisher: ", "(^[a-zA-Z].+$)|.]");
                if (!temp.isEmpty()) pbl = temp;
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);     
    }
}
