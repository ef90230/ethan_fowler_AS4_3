import java.time.LocalDate;

public class PartTimeJob extends Job {
    // PROPERTIES
    private double hourlyRate;

    // CONSTRUCTOR
    public PartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyRate) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
    }

    // METHODS
    public void displayJobDetails() {
        // Displays the job in a brief description.
        System.out.println(super.getPosition() + " at " + super.getCompanyName() + "; part-time position from " + super.getStartDate() + " to " + super.getEndDate());
    }

    public double calculateIncome() {
        // Returns the hourly rate multiplied by the result of CalculatingJobDuration to find total income, assuming 8-hour shifts.
        return hourlyRate * calculatingJobDuration() * 8;
    }
    public boolean isDuplicate(PartTimeJob otherJob) {
        // Compares the name and position of this job to another PartTimeJob object. Returns true for an exact match. This method would be useful
        // in tagging similar positions and condensing them as they appear in the final HR app, especially if the employee returns to some job
        // on a seasonal basis.
        if (((super.getCompanyName()).equals(otherJob.getCompanyName())) && ((super.getPosition()).equals(otherJob.getPosition()))) {
            return true;
        } else {
            return false;
        }
    }
}
