package oop;

public class WrapperDemo {

    public static void main(String[] args) {

        //  Autoboxing
        // Primitive to Object

        int x = 30 ;
        Integer y = Integer.valueOf(x);
        System.out.println("Y = "+y);

        Integer z = x; // Integer.valueOf(x); // Autoboxing
        System.out.println("Z = "+z);

        // Object  to Primitive

//        Double d = new Double(60.43);
//        System.out.println("D = "+d);
//
//        double e = d.doubleValue();
//        System.out.println("e = "+e);

    }

}
