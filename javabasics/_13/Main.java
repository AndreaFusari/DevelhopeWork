package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * Then print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        //Write your code here
        numbers.add(37);
        numbers.add(4);
        numbers.add(32);
        numbers.add(67);
        numbers.add(12);
        numbers.add(6);
        numbers.add(16);
        numbers.add(88);
        System.out.println(numbers.get(0));
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to each other
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        ArrayList <String> menuItems = new ArrayList<>();
        ArrayList <Double> menuPrices = new ArrayList<>();

        menuItems.add("Pizza Margherita");
        menuPrices.add(5.50);

        menuItems.add("Insalata Caprese");
        menuPrices.add(8.00);

        menuItems.add("Spaghetti alla Carbonara");
        menuPrices.add(6.99);

        System.out.println(menuItems.get(0)+" "+ menuPrices.get(0)+" $");
        System.out.println(menuItems.get(1)+" "+ menuPrices.get(1)+" $");
        System.out.println(menuItems.get(2)+" "+ menuPrices.get(2)+" $");

    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        //Write your code here
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        int totalSum = items[0]+items[1]+items[2]+items[3]+items[4]+items[5]+items[6]+items[7]+items[8]+items[9];
        System.out.println(totalSum);
    }
}
