package String;

public class StringDemo_2 {
    public static void main(String[] args) {

        String firstName = "Omar";
        String lastName = "Faruk";

        String fullName = firstName +" "+ lastName;
        System.out.println("Full Name "+fullName);

        System.out.println();
        String upperName = fullName.toUpperCase();
        System.out.println("Upper Name "+upperName);

        System.out.println();
        String lowerName = fullName.toLowerCase();
        System.out.println("Upper Name "+lowerName);

        System.out.println();
        boolean first = firstName.startsWith("Om");
        System.out.println("First = "+first);

        boolean last = lastName.endsWith("K");
        System.out.println("Last = "+last);

        System.out.println();
        String[] names = {"Omar","Lumar", "Kumar","Umar"};
        for(String x : names){
            System.out.println(x);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }

}
