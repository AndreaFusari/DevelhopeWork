package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;
        // Write your code for 1a here
        for (Integer IntToSum : itemsA) {
            sumForA = sumForA + IntToSum;
        }
        System.out.println(sumForA);

    //-----------------------------------------------------------------------------------------------------
        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;
        // Write your code for 1b here
        for (int intToSum : itemsB) {
            sumForB = sumForB + intToSum;
        }
        System.out.println(sumForB);

    //-----------------------------------------------------------------------------------------------------
        System.out.println("\nExercise 1c:");

        int sumForC = 0;
        // Write your code for 1c here, refer back to the lesson to check the for i syntax
        for (int i = 0; i < itemsA.size(); i++) {
            sumForC = sumForC + itemsA.get(i);
        }
        System.out.println(sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
        for (Integer item : items) {
               minNumber = Math.min(minNumber,item);
               maxNumber = Math.max(maxNumber,item);
                }
        System.out.println("\nUsing for loop + Math.min e Math.max:");
        System.out.println( "The smallest number is " + minNumber+" and the largest number is " + maxNumber);

        for (Integer item : items) {
            if (item<minNumber){
                minNumber=item;
            }
            if (item>maxNumber){
                maxNumber=item;
            }
        }
        System.out.println("\nUsing for loop + if statement:");
        System.out.println( "The smallest number is " + minNumber+" and the largest number is " + maxNumber+"\n");
            }



    /**
     * 3: Edit the for i loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < (names.size()-2); // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the for i loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     */
    private static void exercise4() {
        for (
                int timesTableCurrentValue = 8; // <---- Edit this line
                timesTableCurrentValue <= 80; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 8 // <---- Edit this line
        )
            System.out.println(timesTableCurrentValue);

   // BONUS 4 Cambiando solo la variabile timesTableCurrentValue possiamo cambiare tutta la tabellina

        int timesTableCurrentValue = 8;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(timesTableCurrentValue + " * " + i + " = " + timesTableCurrentValue*i);
        }
        }


    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop is inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here
            for (int timesTableSecondNumber = 1; timesTableSecondNumber <= 10; timesTableSecondNumber++)
            System.out.println(timesTableNumber + "*" + timesTableSecondNumber+"=" + timesTableNumber * timesTableSecondNumber);
        }
    }
}
