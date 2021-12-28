package OOP_Abstract.Exam;

public class Triangle extends Shape{

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    void areas() {
        double result = .5*dim1 * dim2;
        System.out.println("Triangle area : "+result);
    }
}
