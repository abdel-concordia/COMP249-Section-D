package comp249_section_d;

public class Fish extends Animal {

    public Fish(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("I swim");
    }

    @Override
    public String toString() {
        return "This is a " + this.getColor() + " fish.";
    }

    public void f() {
        System.out.println("this is f from Fish");
    }
}
