public class MathDemo {

    public static void main(String[] args) {

        int x = 20;
        int y = -10;

        System.out.println(Math.min(x,y));

        int absolute = Math.abs(y);
        System.out.println(absolute);

        double power = Math.pow(x,y);
        System.out.println("x to the power y = "+power);

        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 = "+round);

        double pi = Math.PI;
        System.out.println(pi);
    }

}
