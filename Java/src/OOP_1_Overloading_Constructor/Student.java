package OOP_1_Overloading_Constructor;

public class Student {

    String name, gender;
    int phone, id;

    Student(){
        System.out.println("Default Constructor");
    }

    Student(String n, String g){
       name = n;
       gender = g;
    }

    Student(int ph, int i){
        phone = ph;
        id = i;
    }

    void output1(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);

    }
    void output2(){
        System.out.println("Phone : "+phone);
        System.out.println("Id : "+id);
    }
    void output3(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("Id : "+id);
    }

}
