package lib;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private Year currentYear;
    private List<Month> months = new ArrayList<Month>();
    private List<Day> days = new ArrayList<Day>();

    public Calendar(int currentYear) {
        Year newYear = new Year(currentYear);
        this.currentYear = newYear;

        initialiseMonths();
        initialiseDays();
    }

    public Year getCurrentYear() {
        return currentYear;
    }

    public List<Month> getMonths() {
        return months;
    }

    public List<Day> getDays() {
        return days;
    }

    public void initialiseMonths() {
        months.clear();

        months.add(0, new Month("January", 31));

        if (currentYear.getYear() % 4 == 0 && (currentYear.getYear() % 100 != 0 || currentYear.getYear() % 400 == 0)) {
            months.add(1, new Month("February", 29));
        } else {
            months.add(1, new Month("February", 28));
        }

        months.add(2, new Month("March", 31));
        months.add(3, new Month("April", 30));
        months.add(4, new Month("May", 31));
        months.add(5, new Month("June", 30));
        months.add(6, new Month("July", 31));
        months.add(7, new Month("August", 31));
        months.add(8, new Month("September", 30));
        months.add(9, new Month("October", 31));
        months.add(10, new Month("November", 30));
        months.add(11, new Month("December", 31));
    }

    public void initialiseDays() {
        for (int monthIndex = 0; monthIndex < months.size(); monthIndex++) {
            Month month = months.get(monthIndex);
            for (int dayIndex = 0; dayIndex < month.getNumberOfDays(); dayIndex++) {
                Day newDay = new Day(dayIndex + 1, monthIndex + 1, currentYear.getYear());

                days.add(newDay);
            }

        }
    }
}
