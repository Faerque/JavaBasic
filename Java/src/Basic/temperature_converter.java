import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius, farn;

        System.out.print("Input Celsius : ");
        celsius = input.nextDouble();

        System.out.print("Input Fahrenheit : ");
        farn = input.nextDouble();

        double fahrenheit = 1.8*celsius+32;
        double cel = (0.5555)*(farn-32);

        System.out.println("Fahrenheit is : "+fahrenheit);
        System.out.println("Celsius is : "+cel);

    }
}
