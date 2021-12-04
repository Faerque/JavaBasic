package OOP;

public class Student {

    String name,gender;
    int phone;

    // Default Constructor
    Student(){
        System.out.println("This is Default Constructor! ");
    }

    // Parametrized Constructor
    Student(String n, String g, int ph){
        name = n;
        gender =g;
        phone = ph;
    }

//    void setInformation(String n, String g, int ph){
//        name = n;
//        gender = g;
//        phone = ph;
//    }

    void displayInfo(){

        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);

    }

}
