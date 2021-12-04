package NumberSystemConversion;

public class NumberSystemConversion {
    public static void main(String[] args) {

        // Converting Decimal into Binary, Octal and Hexadecimal Number

        // Binary
        int decimal = 16;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary = "+binary);
        System.out.println();

        // Octal
        int decimal1 = 14;
        String octal = Integer.toOctalString(decimal1);
        System.out.println("Decimal to Octal = "+octal);
        System.out.println();

        // Hexadecimal
        int decimal2 = 166;
        String hexadecimal = Integer.toHexString(decimal2);
        System.out.println("Decimal to Hexadecimal = "+hexadecimal);

        System.out.println();
        // Converting Binary,Octal,Hexadecimal number into Decimal

        // Binary
        String bin = "1010";
        Integer dec = Integer.parseInt(bin,2);
        System.out.println("Binary to Decimal = "+dec);

        // Octal
        String oc = "456";
        Integer dec1 = Integer.parseInt(oc,8);
        System.out.println("Octal to Decimal = "+dec1);

        // Hexadecimal
        String hexa = "F";
        Integer dec2 = Integer.parseInt(hexa,16);
        System.out.println("Hexadecimal to Decimal = "+dec2);

    }
}
