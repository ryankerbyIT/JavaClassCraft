/**
 * Month Class
 * This class represents a month using an integer field named monthNumber.
 * It provides multiple constructors, methods to set and get the month number,
 * a method to get the month name, comparison methods, and a toString method.
 */
public class Month {
    private int monthNumber;

    // No-arg constructor that sets monthNumber to 1
    public Month() {
        monthNumber = 1;
    }

    // Constructor that accepts the number of the month as an argument
    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    // Constructor that accepts the name of the month as an argument
    public Month(String monthName) {
        switch (monthName.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 1;
        }
    }

    // Setter for monthNumber
    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }

    // Getter for monthNumber
    public int getMonthNumber() {
        return monthNumber;
    }

    // Method to get the name of the month
    public String getMonthName() {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[monthNumber - 1];
    }

    // toString method that returns the name of the month
    @Override
    public String toString() {
        return getMonthName();
    }

    // Equals method to compare two Month objects
    public boolean equals(Month otherMonth) {
        return this.monthNumber == otherMonth.monthNumber;
    }

    // greaterThan method to compare two Month objects
    public boolean greaterThan(Month otherMonth) {
        return this.monthNumber > otherMonth.monthNumber;
    }

    // lessThan method to compare two Month objects
    public boolean lessThan(Month otherMonth) {
        return this.monthNumber < otherMonth.monthNumber;
    }

    public static void main(String[] args) {
        // Example usage
        Month month1 = new Month(3);
        Month month2 = new Month("February");

        // Display the months
        System.out.println("Month 1: " + month1.toString());
        System.out.println("Month 2: " + month2.toString());

        // Compare the months
        if (month1.greaterThan(month2)) {
            System.out.println(month1.getMonthName() + " is later in the year than " + month2.getMonthName());
        } else if (month1.lessThan(month2)) {
            System.out.println(month1.getMonthName() + " is earlier in the year than " + month2.getMonthName());
        } else {
            System.out.println("Both months are the same.");
        }
    }
}

/**
 * This program demonstrates the use of the Month class.
 * It creates Month objects using different constructors, displays their names,
 * and compares them to check which month comes later in the year.
 */
