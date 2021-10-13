package OOP_1_Overloading_Constructor;

public class Test_01 {

    public static void main(String[] args) {

        Student std1 = new Student();
        if (std1.name == null) {
            System.out.println("There is no Value Settled! Its just a default constructor ");
        }
        System.out.println();
        Student std2 = new Student("Omar Faruk","Male");
        if (std2.id == 0) {
            std2.output1();
        }else{
            std2.output2();
        }
        System.out.println();
        Student std3 = new Student(345,56);
        if (std3.name == null) {
            std3.output2();
        }

    }

}
