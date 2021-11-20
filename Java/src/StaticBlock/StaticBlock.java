package StaticBlock;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 202001512;
        name= "Md Omar Faruk";
    }

    static void output(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }

}
