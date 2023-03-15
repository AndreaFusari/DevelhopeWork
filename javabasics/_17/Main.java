package javabasics._17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!
         long myBankBalanceEuroLong = myBankBalanceEuro;
         myBankBalanceEuroLong += questionableFundsEuro;

        System.out.println(myBankBalanceEuroLong);
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --> byte
     *    2b: The age of a baby in months --> byte
     *    2c: Money in a hedge fund in euros --> long
     *    2d: Price of a good in euros on amazon.com --> short
     *    2e: The exact weight of an apple measured by scientific equipment --> float
     *    2f: The number of kilometers from any 2 places in the world --> int
     */

    /**
     * 3: Use the LOCAL DATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate currentDate = LocalDate.now();
        System.out.println("The current date is " + currentDate);

        int currentDayOfMonth = currentDate.getDayOfMonth();
        System.out.println("The current day is "+ currentDayOfMonth);

        DayOfWeek currentDateOfWeek = currentDate.getDayOfWeek();
        System.out.println("The current day of week is "+ currentDateOfWeek);

        String currentDateOfWeekString = String.valueOf(currentDate.getDayOfWeek());
        System.out.println("(String) The current day of week is "+ currentDateOfWeekString);

        int currentDayOfYear = currentDate.getDayOfYear();
        System.out.println("The current day of year is " + currentDayOfYear);

        String currentMonth = String.valueOf(currentDate.getMonth());
        System.out.println("The current month is "+ currentMonth);

        int currentMonthValue= currentDate.getMonthValue();
        System.out.println("The current month value is "+ currentMonthValue);

        LocalDate myBirthday = LocalDate.of(1992, Month.JULY,14);
        System.out.println("My Birthday is "+ myBirthday);

        boolean isCurrentDateBeforeMyB_Day = currentDate.isBefore(myBirthday);
        System.out.println("isCurrentDateBeforeMyB_Day? " + isCurrentDateBeforeMyB_Day);

        boolean isCurrentDateAfterMyB_Day = currentDate.isAfter(myBirthday);
        System.out.println("isCurrentDateAfterMyB_Day? " + isCurrentDateAfterMyB_Day);

        Period periodPast = Period.between(currentDate,myBirthday);
        int myAge = Math.abs(periodPast.getYears());
        System.out.println("My age is " + myAge);
    }
}
