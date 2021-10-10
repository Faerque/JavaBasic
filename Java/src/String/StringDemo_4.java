package String;

public class StringDemo_4 {

    public static void main(String[] args) {

        String S1 = " The is our World";
        System.out.println(S1);

        String S2 = S1.replace('i','j');
        System.out.println(S2);

       String[] S3 = S1.split(" ");
        for (String x :
                S3) {
            System.out.println(x);
        }
    }

}
