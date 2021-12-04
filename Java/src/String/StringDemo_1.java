package String;

public class StringDemo_1 {

    public static void main(String[] args) {

        String S1 = "Omar Faruk";
        String S2 = new String("Omar Faruk");

        char[] S3 = {'o','m','a','r'};

        System.out.println("S1 = "+S1);
        System.out.println("S2 = "+S2);
        System.out.println(S3);

        int len = S1.length();
        System.out.println("Length of S1 = "+len);

        if (S1.contains(S2)) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        boolean con = S1.contains("Ami");
        System.out.println(con);

        boolean b = S1.isEmpty();
        System.out.println("b = "+b);
    }

}
