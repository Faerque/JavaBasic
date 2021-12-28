package OOP_Abstract;

public class Selim  extends SimUser{

    @Override
    void usedForCall() {
        System.out.println("Spent only 15 minutes for in call");
    }

    @Override
    void usedForMassage() {
        System.out.println("Send average 0.5 massage a day");
    }

    @Override
    void usedForInternet() {
        System.out.println("Use 1.5GB Internet in a day");
    }

}
