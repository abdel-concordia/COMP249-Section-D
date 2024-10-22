package comp249_section_d;

public class Course {

    private String code;
    private String title;
    private double creditPoints;

    public Course(String code, String title, double creditPoints) throws ValidCreditPointsException {
        this.code = code;
        this.title = title;
        if (creditPoints < 0 || creditPoints > 5) {
            //found an error
            throw new ValidCreditPointsException("Wrong credit points");
        }
        this.creditPoints = creditPoints;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(double creditPoints) {
        this.creditPoints = creditPoints;
    }

}
