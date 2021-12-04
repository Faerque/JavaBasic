import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;
        System.out.print("Enter Radius : ");

        radius = input.nextDouble();

        double area = 3.1416*radius*radius;
        System.out.println("Area of Circle : "+area);



    }

}
