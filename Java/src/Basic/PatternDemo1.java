import java.util.Scanner;

public class PatternDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter line Number : ");
        int n = input.nextInt();

        for (int row =1; row <=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("&");
            }
            System.out.println();
        }

    }
}
