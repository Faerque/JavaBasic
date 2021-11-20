package Mehtod_Overloading;

public class Method_Overloading {

    void add(int a, int b){
        System.out.println("Sum is: "+a+b);
    }

    void add(double a, double b){
        System.out.println("Decimal value is: "+a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(){
        System.out.println("No Parameter here");
    }

}
