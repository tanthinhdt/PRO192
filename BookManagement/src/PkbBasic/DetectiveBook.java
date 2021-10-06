
package PkbBasic;

import PkgValid.Validation;

public class DetectiveBook extends Book {
    // FIELDS
    private int price;
    private int pblYear;
    
    // METHODS
    // Constructors
    public DetectiveBook(int price, int pblYear, String code, String title) {
        super(code, title);
        this.price = price;
        this.pblYear = pblYear;
    }
    
    public DetectiveBook() {
        this.price = 0;
        this.pblYear = 0;
    }
    
    // Getters
    public int getPrice() {
        return price;
    }

    public int getPblYear() {
        return pblYear;
    }

    
    // Setters
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPblYear(int pblYear) {
        this.pblYear = pblYear;
    }
    
    // Logical
    public void inputDetective() {
        boolean flag;
        inputBook();
        
        do {
            try {
                flag = false;
                price = Validation.inputNNegNumber("       Price: ");
                pblYear = Validation.inputYear("       Year of publication: ", 2000);
            }
            
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
    
    public void outputDetective() {
        System.out.println(getCode() + " " + getTitle() + " " + price + "VND in " + pblYear);
    } 
    
    public void updateDetective() {
        boolean flag;
        updateBook();
        
        do {
            try {
                flag = false;
                String temp = Validation.inputString("Price: ", "[0-9]+|\s");
                if (!temp.isEmpty()) price = Validation.inputNNegNumber(Integer.parseInt(temp));
                temp = Validation.inputString("Year of publication: ", "[0-9]+|\s");                
                if (!temp.isEmpty()) pblYear = Validation.inputYear(Integer.parseInt(temp), 2000);
            }
            
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
}
