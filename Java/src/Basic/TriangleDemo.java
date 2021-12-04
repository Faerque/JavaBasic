import java.util.Scanner;

public class TriangleDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base : ");
        base = input.nextDouble();

        System.out.print("Enter Height : ");
        height = input.nextDouble();

        double area = 0.5* base* height;

        System.out.println("Area of Triangle is : "+area);



    }

}
