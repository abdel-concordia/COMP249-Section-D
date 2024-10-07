package comp249_section_d;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "This is a " + this.name;
    }

    public abstract double getPerimeter();
}
