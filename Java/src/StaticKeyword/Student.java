package StaticKeyword;

public class Student {

    String name;
    int id;
    static String UniversityName="EDU";

    Student(String n, int i){
        name = n;
        id = i;
    }

    void showOutput(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("University :"+UniversityName);
    }

}
