package old_code;

import old_code.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name); // Call to shape constructor
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle otherRectangle) {
        super(otherRectangle.name); // name: String (immutable)
        this.length = otherRectangle.length; // length: double
        this.width = otherRectangle.width; // width: double
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return super.toString() + " with length: " + this.length + " and width: " + this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
