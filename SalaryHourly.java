package JavaETC;

public class SalaryHourly {
    public static void main(String[] args) {
        double salaryYearly = 105000;
        double weekInYear = 52;
        double hourInWeek = 40;

        double hourlyRate = (salaryYearly / weekInYear) / hourInWeek;
        System.out.println(hourlyRate);
    }
}
