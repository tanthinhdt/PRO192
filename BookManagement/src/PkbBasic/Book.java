
package PkbBasic;

import PkgValid.Validation;

public class Book {
    // FIELDS
    private String code;
    private String title;
    
    //METHODS
    // Constructors
    public Book(String code, String title) {
        this.code = code;
        this.title = title;
    }
    
    public Book() {
        this.code = null;
        this.title = null;
    }
    
    // Getters
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
    
    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    // Logical
    public void inputBook() {
        boolean flag;
        
        do {
            try {
                flag = false;
                code = Validation.inputString("       Book code: ", "B+[0-9]");
                title = Validation.inputString("       Book title: ", "^[a-zA-Z].+$");
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
    
    public void outputBook() {
        System.out.println(code + " " + title);
    }
    
    public void updateBook() {
        boolean flag;
        
        do {
            try {
                flag = false;
                String temp = Validation.inputString("Book code: ", "(B+[0-9])|\s");
                if (!temp.isEmpty()) code = temp;
                temp = Validation.inputString("Book title: ", "^(([a-zA-Z].+)|\s)$");
                if (!temp.isEmpty()) title = temp;
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
}
