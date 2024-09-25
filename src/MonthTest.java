/**
 * This class demonstrates the use of an enumeration to represent the months
 * of the year and iterates over all values of the enumeration to check if
 * the month name ends with 'Y' or not.
 */
public class MonthTest {

    /**
     * Enumeration representing the twelve months of the year.
     */
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    /**
     * Main method to iterate through all the months and print whether
     * the month name ends with 'Y' or doesn't end with 'Y'.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Iterate over each month
        for (Month month : Month.values()) {
            // Get the name of the month
            String monthName = month.name();
            // Check if the month ends with 'Y' (case-sensitive)
            if (monthName.endsWith("Y")) {
                System.out.println(monthName + " ends with y");
            } else {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }
}
