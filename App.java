import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate dob = LocalDate.of(1981, 03, 24);
        Employee e1 = new Employee("Todd", "Burns", dob, "Manager", "MKT", "Remote", "Full-time", "5553218765", 32.50);
        e1.addFullTimeJob("Tech Solutions", "Developer", LocalDate.of(2020, 8, 16), LocalDate.of(2021, 3, 16), 17500.0, 1);
        e1.addPartTimeJob("NewLine Programming", "Programmer", LocalDate.of(2023, 5, 11), LocalDate.of(2023, 7, 9), 13.50);
        e1.addContractJob("QuickPlay", "Quality Assurance", LocalDate.of(2024, 1, 3), LocalDate.of(2024, 2, 13), 1000, true, LocalDate.of(2024, 2, 13));
        for (int i = 0; i < 3; i++) {
            e1.getJob(i).displayJobDetails();
            System.out.println("Job " + i + " was undertaken for " + e1.getJob(i).calculatingJobDuration() + " days.");
            e1.getJob(i).assessJobSatisfaction();
        }
    }
}
