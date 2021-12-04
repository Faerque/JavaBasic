package SuperKeyword;

public class Car extends Vehicle{
    // Color, attribute and weight()

    int gear;

    Car(String c, double w, int g){
        super(c,w);
        gear = g;
    }

    void attribute(){
        super.attribute();
        System.out.println("Gear : "+gear);
    }


}
