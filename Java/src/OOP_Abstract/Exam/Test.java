package OOP_Abstract.Exam;

public class Test {
    public static void main(String[] args) {

        Shape shape;
        shape = new Rectangle(10,20);
        shape.areas();

        shape = new Triangle(1.29,20);
        shape.areas();

        shape = new Circle(90.2);
        shape.areas();


    }

}
