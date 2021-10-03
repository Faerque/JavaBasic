import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(30);
        number.add(-40);
        number.add(0);
        number.add(2);

        System.out.println("Before Sorting : "+number);

        Collections.sort(number);
        System.out.println("After Sorting in ascending order : "+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Sorting in descending order  : "+number);


    }

}
