package String;

public class StringDemo_3 {

    public static void main(String[] args) {

        String country = "Bangladesh is for everyone";

        String S3 = country.trim();
        System.out.println(S3);

        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);
        System.out.println(value);

        int position = country.indexOf('n');
        System.out.println(position);

        position = country.lastIndexOf('y');
        System.out.println(position);


    }

}
