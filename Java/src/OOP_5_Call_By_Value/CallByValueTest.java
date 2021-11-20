package OOP_5_Call_By_Value;

public class CallByValueTest {

    public static void main(String[] args) {

        CallByValue ob = new CallByValue();
        int x = 110;

        System.out.println("x before call : "+x);

        ob.change(x);
        System.out.println("x after call "+x);
    }

}
