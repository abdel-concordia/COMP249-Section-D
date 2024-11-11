package old_code;

public class Student2 implements Comparable {

    private double gpa;

    public Student2(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object otherObject) {

        Student2 otherStudent = (Student2) otherObject;

        if (this.gpa < otherStudent.gpa) {
            return -1;
        } else if (this.gpa > otherStudent.gpa) {
            return 1;
        } else {
            return 0;
        }
    }

}
