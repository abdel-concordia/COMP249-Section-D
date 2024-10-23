package comp249_section_d;

public class ValidCreditPointsException extends Exception {

    private double minCP;
    private double maxCP;

    public ValidCreditPointsException(String message) {
        super(message);
        this.minCP = 0;
        this.maxCP = 6;
    }

    public double getMinCP() {
        return minCP;
    }

    public void setMinCP(double minCP) {
        this.minCP = minCP;
    }

    public double getMaxCP() {
        return maxCP;
    }

    public void setMaxCP(double maxCP) {
        this.maxCP = maxCP;
    }

    @Override
    public String getMessage() {
        return "Valid credit points are betweeen : " + this.minCP + " and : " + this.maxCP;
    }
}
