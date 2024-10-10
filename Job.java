import java.time.LocalDate;
import java.time.Duration;

public abstract class Job {
    // PROPERTIES
    private String companyName;
    private String position;
    private LocalDate startDate;
    private LocalDate endDate;

    // GETTER METHODS
    public String getCompanyName() {
        return companyName;
    }
    public String getPosition() {
        return position;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    // SETTER METHODS
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // CONSTRUCTOR
    public Job(String companyName, String position, LocalDate startDate, LocalDate endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void displayJobDetails();
    public long calculatingJobDuration() {
        return (Duration.between(startDate, endDate)).toDays();
    }
    public void assessJobSatisfaction() {
        // Prints a satisfaction rating system depending on how long the tenure at the company was.
        if (calculatingJobDuration() < 365) {
            System.out.println("Job satisfaction was poor.");
        } else if (calculatingJobDuration() > 3650) {
            System.out.println("Job satisfaction was high.");
        } else {
            System.out.println("Job satisfaction was middling.");
        }
    }
}