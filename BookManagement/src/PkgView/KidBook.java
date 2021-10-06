
package PkgView;

import PkbBasic.DetectiveBook;
import PkgValid.Validation;

public class KidBook extends DetectiveBook {
    // FIELDS
    private int age;
    private String gender;
    
    // METHODS
    // Constructors
    public KidBook(int age, String gender, int price, int pblYear, String code, String title) {
        super(price, pblYear, code, title);
        this.age = age;
        this.gender = gender;
    }

    public KidBook() {
        this.age = 0;
        this.gender = null;
    }
    
    // Getters
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Logical
    public void inputKid() {
        boolean flag;
        inputDetective();
        
        do {
            try {
                flag = false;
                age = Validation.inputNNegNumber("Age: ");
                gender = Validation.inputString("Gender: ", "([fF][eE][mM][aA][lL][eE])|([mM][aA][lL][eE])");
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);
    }
    
    public void outputKid() {
        System.out.println(getCode() + " " + getTitle() + " " + age + "years old " + gender);
    }
    
    public void updateKid() {
        boolean flag;
        updateDetective();
        
        do {
            try {
                flag = false;
                age = Validation.inputNNegNumber("Age: ");
                String temp = Validation.inputString("Gender: ", "([fF][eE][mM][aA][lL][eE])|([mM][aA][lL][eE])|\s");
                if (!temp.isEmpty()) gender = temp;
            }
            catch (Exception e) {
                System.out.println("Invalid information");
                flag = true;
            }
        } while (flag);        
    }
}
