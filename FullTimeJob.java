import java.time.LocalDate;

public class FullTimeJob extends Job {
    // PROPERTIES
    private double totalIncome;
    private int promotionCount;

    // CONSTRUCTOR
    public FullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double totalIncome, int promotionCount) {
        super(companyName, position, startDate, endDate);
        this.totalIncome = totalIncome;
        this.promotionCount = promotionCount;
    }

    // METHODS
    public void displayJobDetails() {
        // Displays the job in a brief position.
        System.out.println(super.getPosition() + " at " + super.getCompanyName() + "; full-time position from " + super.getStartDate() + " to " + super.getEndDate());
    }

    public boolean comparePositions() {
        // Compares this position to a set of positions that may be sought after by the company. Returns true for a match. This
        // method is useful to see if that employee has a job that would fit the company's needs well. Other categories have been 
        // omitted for clarity for this assignment.
        // Quality Assurance job set
        if (((super.getPosition()).equals("QA")) || ((super.getPosition()).equals("Quality Assurance"))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isKeyPosition() {
        // Measures whether the job was significant in that employee's resume by assessing promotion count and income.
        if ((promotionCount >= 2) && (totalIncome > 99999.9)) {
            return true;
        } else {
            return false;
        }
    }
}
