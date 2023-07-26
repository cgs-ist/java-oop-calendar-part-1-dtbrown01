import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Month> months;
    private List<Day> days;
    private Year currentYear;

    public Calendar(int currentYear) {
        this.currentYear = new Year(currentYear);
        this.months = new ArrayList<>();
        this.days = new ArrayList<>();
        initializeMonths();
        initializeDays();
    }

    private void initializeMonths() {
        // Add months to the list (you can have 12 months in a standard calendar)
        months.add(new Month("January", 31));
        months.add(new Month("February", 28)); // Leap year handling is not included in this example
        months.add(new Month("March", 31));
        months.add(new Month("April", 30));
        months.add(new Month("May", 31));
        months.add(new Month("June", 30));
        months.add(new Month("July", 31));
        months.add(new Month("August", 31));
        months.add(new Month("September", 30));
        months.add(new Month("October", 31));
        months.add(new Month("November", 30));
        months.add(new Month("December", 31));
    }

    private void initializeDays() {
        // Create days for the current year
        for (int monthIndex = 0; monthIndex < months.size(); monthIndex++) {
            Month month = months.get(monthIndex);
            for (int dayOfMonth = 1; dayOfMonth <= month.getNumberOfDays(); dayOfMonth++) {
                days.add(new Day(dayOfMonth, monthIndex + 1, currentYear.getYear()));
            }
        }
    }

    // Add methods to access and manipulate the calendar as needed
}

