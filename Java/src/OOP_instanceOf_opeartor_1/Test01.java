package OOP_instanceOf_opeartor_1;

public class Test01 {
    public static void main(String[] args) {

        Animal a = new Animal();
        Person p = new Person();
        Teacher t = new Teacher();

        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Person);
        System.out.println(t instanceof Animal);
        System.out.println(p instanceof Teacher);

    }
}
