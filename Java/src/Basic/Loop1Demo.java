import java.util.Scanner;

public class Loop1Demo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int sum = 0;
        int m,n;

        System.out.println("Enter the initial Number : ");
        m = input.nextInt();

        System.out.println("Enter Final Number : ");
        n = input.nextInt();

        for (int i =m; i<=n; i++){
             if(i%2==0){
                 sum = sum +i;
                 System.out.println("  "+i);
             }

        }
        System.out.println("Sum is : " +sum);
    }

}
