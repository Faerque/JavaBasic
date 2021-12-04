package ProblemSolving01;

public class Box {

    double height,width,depth; // Instance Variable

    Box(double height, double width, double depth){
       this.height = height;
       this.width = width;
       this.depth = depth;
    }

    void displayVol(){
        double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }

}
