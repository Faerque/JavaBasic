package Array;

import java.util.ArrayList;

public class MixedDatatype {
    public static void main(String[] args) {

        ArrayList<Object> my_list = new ArrayList<>();
        my_list.add("Apple");
        my_list.add(25);
        my_list.add("Komola");
        my_list.add(78.69);
        my_list.add("playboy");

        System.out.println("The array : "+ my_list);
        my_list.set(1,"25");
        my_list.set(2,"KOMOLA");
        my_list.set(3,78);
        my_list.set(4, "Playboy");
        System.out.println("The Array Output : "+my_list);


    }
}
