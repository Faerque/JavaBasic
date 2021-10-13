package OOP;

import java.rmi.StubNotFoundException;

public class Test_01 {

    public static void main(String[] args) {

//        Student std1 = new Student();
//        std1.setInformation("Omar Faruk","male",345);
//        std1.displayInfo();

        System.out.println();
//        Student std2 = new Student();
//        std2.setInformation("Fumar Oaruk","male",435);
//        std2.displayInfo();


        // Using Parametrized Constructor
        Student std3 = new Student("Jimmmy Rahman","Male",234);
        std3.displayInfo();

        Student std4 = new Student();
        if (std4.name == null) {
            System.out.println("No Value");
        }else{
            std4.displayInfo();
        }



    }

}
