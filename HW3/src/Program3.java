package program3;

import java.io.File;
import java.util.Scanner;
import java.time.*;

public class Program3 {

    public static void main(String[] args) throws Exception {
        
        // pass the path to the file as a parameter
        Scanner inputFile = new Scanner(new File("dates.txt"));
        /* */
        // variables;
        int month = 0;
        int day = 0;
        int year = 0;

        // under try and finally read files
        try {
            while (inputFile.hasNext()) {
                // delimeter to remove dashes & potential whitespaces
                inputFile.useDelimiter("-|\\n");

                String monthString = inputFile.next();
                String dayString = inputFile.next();
                String yearString = inputFile.next();

                // remove the carriage return 'cr' from the string yearString("2000cr")
                yearString = yearString.replaceAll("\\s+", "");

                // getting date
                month = Integer.parseInt(monthString);
                day = Integer.parseInt(dayString);
                year = Integer.parseInt(yearString);

                // create an object of LocalDate of given date
                LocalDate givendate = LocalDate.of(year, month, day);

                // Add today's dates
                LocalDate todaydate = LocalDate.now();

                // Calculate age
                Period age = Period.between(givendate, todaydate);

                // Print out to console
                System.out.println("Age of this member is : " + age.getYears() + "years, " + age.getMonths()
                        + " months, " + age.getDays() + " days.");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            inputFile.close();
        }
    }
}
