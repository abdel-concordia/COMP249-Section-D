package comp249_section_d;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name); // Call to shape constructor
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius: " + this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
