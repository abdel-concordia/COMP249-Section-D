package comp249_section_d;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name); // Call to Shape constructor
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    @Override
    public String toString() {
        return super.toString() + " with sides: " + this.side1 + ", " + this.side2 + ", " + this.side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
