package OOP_9_Inheritance;

public class Teacher extends Person {
    // name, age, display

    String Qualification;

    void display2(){
        display();
        System.out.println("Qualification : "+Qualification);
    }
}
