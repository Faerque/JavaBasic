package RandomDemo;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(10)+1 ;  // 0 to 9
        System.out.println("Random Number = "+randomNumber);

        // Using Math Variable
        int randomNumber1 = (int) (Math.random()*10);
        System.out.println("Random Number = "+randomNumber1);

    }

}
