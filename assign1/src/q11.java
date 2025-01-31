class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(1, 1, 1970);
    }

    public Date(int day) {
        this(day, 1, 1970);
    }

    public Date(int day, int month) {
        this(day, month, 1970);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        validateDate();
    }

    private void validateDate() {
        if (month < 1)
            month = 1;
        if (month > 12)
            month = 12;

        int maxDays = getDaysInMonth(month, year);
        if (day < 1)
            day = 1;
        if (day > maxDays)
            day = maxDays;
    }

    private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public Date getPreviousDay() {
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;

        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }
            prevDay = getDaysInMonth(prevMonth, prevYear);
        }

        return new Date(prevDay, prevMonth, prevYear);
    }

    public Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        int maxDays = getDaysInMonth(month, year);
        if (nextDay > maxDays) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        return new Date(nextDay, nextMonth, nextYear);
    }

    public void printDay() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}

public class q11 {
    public static void main(String[] args) {

        Date date = new Date(01, 05, 1994);

        System.out.print("Current date: ");
        date.printDay();

        Date prevDay = date.getPreviousDay();
        System.out.print("Previous day: ");
        prevDay.printDay();

        Date nextDay = date.getNextDay();
        System.out.print("Next day: ");
        nextDay.printDay();
    }
}
