import java.time.LocalDate;

public class ContractJob extends Job {
    // PROPERTIES
    private int contractValue;
    private boolean wasComplete;
    private LocalDate goalDate;

    // CONSTRUCTOR
    public ContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, int contractValue, boolean wasComplete, LocalDate goalDate) {
        super(companyName, position, startDate, endDate);
        this.contractValue = contractValue;
        this.wasComplete = wasComplete;
        this.goalDate = goalDate;
    }

    // METHODS
    public void displayJobDetails() {
        // Displays the job in a brief description.
        System.out.println(super.getPosition() + " at " + super.getCompanyName() + "; contracted position from " + super.getStartDate() + " to " + super.getEndDate());
    }

    public String calculatingTimeliness() {
        // Returns On Time, Early, Late, or Left before contract completed depending on completion status and goalDate and endDate.
        if (wasComplete == false) {
            return "Left before contract completed";
        } else if (goalDate.isAfter(super.getEndDate())) {
            return "Early";
        } else if (goalDate.isBefore(super.getEndDate())) {
            return "Late";
        } else {
            return "On time";
        }
    }
    public void compareContracts(ContractJob otherContract) {
        // Displays the key differences between contracts, including timeliness and contract value.
        int valueDifference = contractValue - otherContract.contractValue;
        if (valueDifference == 0) {
            System.out.println("These two contracts were equal in payout.");
        } else if (valueDifference > 0) {
            System.out.println("The contract for " + super.getCompanyName() + " was more lucrative.");
        } else if (valueDifference < 0) {
            System.out.println("The contract for " + otherContract.getCompanyName() + " was more lucrative.");
        }
    }
}
