package FinalKeyword;

public class Univeristy {
    final String UNIVERSITY_NAME="Edu";
    static final String SEMESTER; // Static Blank final variable
    final int FEES; // Blank final variable

    static{
        SEMESTER = "5th";
    }
    Univeristy(){
        FEES = 2990;
    }


    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(FEES);
        System.out.println(SEMESTER);
    }
}
