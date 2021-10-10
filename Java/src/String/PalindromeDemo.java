package String;

public class PalindromeDemo {

    public static void main(String[] args) {

        String S1 = "Madam";
        StringBuffer sb = new StringBuffer(S1);

        String S2 = sb.reverse().toString();

        if (S1.equals(S2)){
            System.out.println("Palindrome");
        }


    }

}
