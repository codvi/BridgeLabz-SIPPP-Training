import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 6, 19); // You can also take input from Scanner

        LocalDate result = inputDate.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2)
                                    .minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("Modified Date: " + result);
    }
}
