package String;

public class StringDemo_5 {

    public static void main(String[] args) {

        String S1 = "Omfar";
        StringBuffer sb = new StringBuffer(S1);
        System.out.println(sb);

        sb.append(" Faruk");
        sb.append(24);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,5);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);
    }

}
