package comp249_section_d;

public class Bird extends Animal {

    private double wingSpan;

    public Bird(String color, double wingSpan) {
        super(color);
        this.wingSpan = wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return this.wingSpan;
    }

    @Override
    public void move() {
        System.out.println("I fly");
    }

    @Override
    public String toString() {
        return "This is a " + this.getColor() + " bird with wing span of " + this.wingSpan;
    }

    public void f() {
        System.out.println("this is f from Bird");
    }
}
