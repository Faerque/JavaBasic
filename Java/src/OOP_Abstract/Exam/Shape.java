package OOP_Abstract.Exam;

// Write an inheritance hierarchy for classes Rectangle, Circle, Triangle. Create an object abstract class named Shape as super-class of the hierarchy.Write an application that instantiates object of your classes and output of their areas.

public abstract class Shape {

    double dim1, dim2;
    Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void areas();
}
