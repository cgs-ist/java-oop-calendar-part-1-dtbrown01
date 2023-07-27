package lib;

public class Month {
    private String name;
    private int numberOfDays;

    Month(String name, int numberOfDays) {
        this.name = name;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
