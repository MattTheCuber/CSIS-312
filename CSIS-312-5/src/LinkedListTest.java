import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("Matthew Vine – Assignment #5\n");

        // Create random generator
        Random rand = new Random();
        // Initialize the linked list
        LinkedList<Integer> list = new LinkedList<>();

        // 25 times
        for (int i = 0; i < 25; i++) {
            // Add a random number up to 100 to the list
            list.add(rand.nextInt(100));
        }

        // Print the list
        System.out.print("Unsorted list: ");
        System.out.println(list);

        // Create a comparator to sort the list
        Comparator<Integer> order = Integer::compare;
        // Sort the list using this comparator
        list.sort(order);
        // Print the list
        System.out.print("Sorted list: ");
        System.out.println(list);

        // Print the sum of the list
        System.out.printf("\nThe sum of the list is %d\n", sum(list));
        // Print the average of the list
        System.out.printf("The average of the list is %.2f\n", average(list));
    }

    /**
     * Calculates the sum of a LinkedList
     * @param list the LinkedList
     * @return the sum of the LinkedList
     */
    public static int sum(LinkedList<Integer> list) {
        // Initialize the sum
        int sum = 0;
        // For each item, add it to the sum
        for (int i: list) sum += i;
        // Return the sum
        return sum;
    }
    /**
     * Calculates the average of a LinkedList
     * @param list the LinkedList
     * @return the average of the LinkedList
     */
    public static double average(LinkedList<Integer> list) {
        // Initialize the length and sum
        double length = 0;
        double sum = 0;
        // For each item in the list
        for (int i: list) {
            // Increase the length
            length++;
            // Add it to the sum
            sum += i;
        }
        // Return the sum divided by the length (the average)
        return sum / length;
    }
}
