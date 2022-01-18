package Anonymouss_Class;

public class Test {

    public static void main(String[] args) {

       Person p = new Person(){
           @Override
           void output() {
               System.out.println("Test Class");
           }
       };

       p.output();

    }

}
