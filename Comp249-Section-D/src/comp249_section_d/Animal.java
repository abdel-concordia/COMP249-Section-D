package comp249_section_d;

public class Animal {

    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "This is a " + this.color + " animal.";
    }

    public void move() {
        System.out.println("I dont know how to move.");
    }

    public void f() {
        System.out.println("this is f from Animal");
    }

    public void g() {
        f();
    }
}
