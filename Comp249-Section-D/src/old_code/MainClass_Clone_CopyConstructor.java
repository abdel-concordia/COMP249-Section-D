package old_code;

public class MainClass_Clone_CopyConstructor {

    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1);

        A b1 = new B();
        System.out.println(b1);

        A a2 = new A(b1); // Copy constructor (static/early binding)
        A a3 = b1.clone();  // clone is a method (dynamic/late binding)

        System.out.println(a2);
        System.out.println(a3);

        A b3 = (B) b1;

    }

}

class A {

    int number1;

    public A() {
        System.out.println("Default constructor of A");
    }

    public A(A a) {
        System.out.println("Copy constructor of A.");
    }

    @Override
    public String toString() {
        return "This is an object of class A.";
    }

    @Override
    public A clone() {
        System.out.println("Clone from A.");
        return new A(this);
    }

}

class B extends A {

    int number2;

    public B() {
        System.out.println("Default constructor of B.");
    }

    public B(B b) {
        System.out.println("Copy constructor of B.");
    }

    @Override
    public String toString() {
        return "This is an object of class B.";
    }

    @Override
    public B clone() {
        System.out.println("Clone from B");
        return new B(this);
    }
}
