package old_code;

public class Student extends Person {

    private String ID;
    private double gpa;

    public Student(String name, int age, Address address, String ID, double gpa) {
        super(name, age, address); // to construct part from the parent

        // COnstruct the extras added by the derived class
        this.ID = ID;
        this.gpa = gpa;

    }

    @Override
    public boolean equals(Object otherObject) {

        if (otherObject == null) {
            return false;
        }
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        Student otherStudent = (Student) otherObject;

        // Two students are equal if they have the same name
        if ((this.name.equals(otherStudent.name)) && (this.getAge() == otherStudent.getAge())) {
            return true;
        } else {
            return false;
        }
    }

    public double getGPA() {
        return this.gpa;
    }

    @Override
    public String toString() {
        super.toString();
        return "Student with name: " + this.name + " and ID: " + this.ID;
    }

    @Override
    public void f() {
        System.out.println("This is method f in Student.");
    }

}
