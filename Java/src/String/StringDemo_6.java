package String;

public class StringDemo_6 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Omar");
        System.out.println("Str = "+str);
        str.append(" Faruk");
        str.append(23);
        System.out.println("\n");
        System.out.println();
        str.append(12.5);
        System.out.println("str = "+str);

        str.reverse();
        System.out.println(str);

        str.delete(2,5);
        System.out.println(str);
    }

}
