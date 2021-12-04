public class ArrayDemo3 {

    public static void main(String[] args) {

        String[] names = {"Anis","Kanis","Banis","Tanis","Fanis"};
        int[] num = {10, 20,30,40,60};
        int sum = 0;

        for (int x: num){
            sum = sum + x;
        }
        System.out.println(sum);

        System.out.println(names.length);
        for(String x : names){
            System.out.println(x);
        }



    }

}
