package OOP_Method_Overriding;

public class Teacher extends Person {

    // name, age displayInformation
    String qualification;

    void information(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Qualification"+qualification);
    }

}
