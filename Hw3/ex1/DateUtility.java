package oop.Hw3.ex1;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateUtility {
    public static String[]strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDays = daysInMonths[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        return day >= 1 && day <= maxDays;
    }
    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int century = year / 100;
        int yearOfCentury = year % 100;

        int dayOfWeek = (day + (13 * (month + 1)) / 5 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century);
        dayOfWeek = dayOfWeek % 7;

        // Adjust to make 0 = Saturday, 1 = Sunday, 2 = Monday, ..., 6 = Friday
        return (dayOfWeek + 6) % 7;
    }
    public static String toString(int year, int month, int day) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfWeek = getDayOfWeek(year, month, day);
        return daysOfWeek[dayOfWeek] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2011)); // false
        System.out.println(isLeapYear(2012)); // true

        System.out.println(isValidDate(2012, 2, 29)); // true
        System.out.println(isValidDate(2011, 2, 29)); // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24)); // 6 (Sat)
        System.out.println(getDayOfWeek(2000, 1, 1)); // 6 (Sat)
        System.out.println(getDayOfWeek(2054, 6, 19)); // 5 (Fri)
        System.out.println(getDayOfWeek(2012, 2, 17)); // 5 (Fri)

        System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012
    }
}
