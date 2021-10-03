import java.util.Scanner;

public class Series1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, equ=1;

        System.out.println("Enter the last Number : ");

        n = input.nextInt();

        for (int i = 1; i<=n;  i++){

            equ = equ * i;

        }
        System.out.println();
        System.out.println(equ);

    }

}
