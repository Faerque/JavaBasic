package StaticVariable;

public class Student {

   static int count = 0; // non static variable;

   Student(){
       count++;
   }

   void output(){
       System.out.println("Total Student = "+count);
   }

}
