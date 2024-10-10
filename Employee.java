import java.time.LocalDate;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String jobTitle;
    private String department;
    private String workLocation;
    private String employmentStatus;
    private String email;
    private String phoneNumber;
    private double hourlyRate;
    private String note;
    private boolean isDeleted;
    private Job[] jobList = new Job[100];
    private int i = 0;

    // GETTER METHODS
    public int getEmployeeID() {
        return employeeID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getDepartment() {
        return department;
    }
    public String getWorkLocation() {
        return workLocation;
    }
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public String getNote() {
        return note;
    }
    public boolean getIsDeleted() {
        return isDeleted;
    }
    public Job getJob(int i) {
        return jobList[i];
    }

    // SETTER METHODS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    // OTHER METHODS
    public void addFullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double totalIncome, int promotionCount) {
        FullTimeJob f = new FullTimeJob(companyName, position, startDate, endDate, totalIncome, promotionCount);
        jobList[i] = f;
        i++;
    }
    public void addPartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyRate) {
        PartTimeJob p = new PartTimeJob(companyName, position, startDate, endDate, hourlyRate);
        jobList[i] = p;
        i++;
    }
    public void addContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, int contractValue, boolean wasComplete, LocalDate goalDate) {
        ContractJob c = new ContractJob(companyName, position, startDate, endDate, contractValue, wasComplete, goalDate);
        jobList[i] = c;
        i++;
    }

    //CONSTRUCTORS
    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.dateOfBirth = LocalDate.of(2000, 01, 01);
        this.jobTitle = "Quality Assurance";
        this.department = "DEV";
        this.workLocation = "MSU";
        this.employmentStatus = "Intern";
        this.email = ""; // Default is supposed to be empty
        this.phoneNumber = ""; // Default is supposed to be empty
        this.hourlyRate = 7.25;
        this.note = ""; // Default is supposed to be empty
        this.isDeleted = false;
        this.jobList = null;

    }
    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String jobTitle, String department, String workLocation, String employmentStatus, String phoneNumber, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
        this.department = department;
        this.workLocation = workLocation;
        this.employmentStatus = employmentStatus;
        this.email = firstName + lastName + "@devmail.corp";
        this.phoneNumber = phoneNumber;
        this.hourlyRate = hourlyRate;
        this.note = "";
        this.isDeleted = false;
        this.jobList = null;
    }
}
