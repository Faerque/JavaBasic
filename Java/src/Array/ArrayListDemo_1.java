import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = "+number.size());

        // Adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(3,40);

        System.out.println("ArrayList Contains : "+number);

//        System.out.println(number);
//        for (int x :
//                number) {
//            System.out.println(" "+x);
//        }
//
//        Iterator itr = number.iterator();
//        while (itr.hasNext()){
//            System.out.print(" "+itr.next());
//        }

//        for (int i :
//                number) {
//            System.out.println(i+" ");
//        }
//
//        System.out.println(number);
//        System.out.println();
//        System.out.println("Size = "+number.size());

        // Removing elements
//        number.remove(2);
//        System.out.println(number);
//
//        number.clear();
//        System.out.println("After Clear ArrayList contains : "+number);
//
//        boolean check = number.isEmpty();
//        System.out.println("ArrayList empty : "+check);
//
//        boolean contain = number.contains(30);
//        System.out.println("30 is in the list : "+contain);
//
//        int pos = number.indexOf(40);
//        System.out.println("The index of 40 is : "+pos);

        // Set Method
        number.set(1, 50); // Replace
        System.out.println("ArrayList : "+number);

       int x =  number.get(0);
        System.out.println("index 0 : "+x);
    }

}
