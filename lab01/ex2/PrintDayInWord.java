package oop.lab01.ex2;

public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Using nested-if:");
        usingNestedIf(0);
        usingNestedIf(1);
        usingNestedIf(2);
        usingNestedIf(3);
        usingNestedIf(4);
        usingNestedIf(6);
        usingNestedIf(7);
        System.out.println("Using switch - case -  dafault:");
        usingSwitchCase(0);
        usingSwitchCase(1);
        usingSwitchCase(2);
        usingSwitchCase(3);
        usingSwitchCase(4);
        usingSwitchCase(5);
        usingSwitchCase(6);
        usingSwitchCase(7);
    }

    public static void usingNestedIf(int dayNumber) {
        System.out.println("The dayNumber is " + dayNumber);
        if (dayNumber == 0) {
            System.out.println("Sunday");
        } else if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Not a valid day");
        }
    }

    public static void usingSwitchCase(int dayNumber) {
        System.out.println("The dayNumber is " + dayNumber);
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
