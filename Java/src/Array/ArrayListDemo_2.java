import java.util.ArrayList;

public class ArrayListDemo_2 {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        ArrayList<Integer> number4 = new ArrayList<>();

        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("Number_1 = "+number1);

        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println("Number_2 = "+number2);

        number3.addAll(number1);
        System.out.println("Number_3 "+number3);

       boolean result = number1.equals(number2);
        System.out.println("Number1 == Number2 : "+result);


        result = number1.equals(number3);
        System.out.println("Number1 == Number3 : "+result);


    }

}
