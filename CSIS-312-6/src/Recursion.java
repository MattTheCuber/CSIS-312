import java.util.Random;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Matthew Vine – Assignment #6\n");

        // Initialize array of random numbers
        int[] array = fillArray(new int[100], 100);
        // Print the array
        printArray(array, 0);
    }

    /**
     * Fills an array with random numbers
     * @param array integer array
     * @return the array filled with random numbers
     */
    public static int[] fillArray(int[] array, int bound) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    /**
     * Recursive function to print an array of integers
     * @param array integer array
     * @param index which element to print
     */
    public static void printArray(int[] array, int index) {
        // Print the element added a space if it is not the first element
        System.out.printf("%s%s", array[index], index == array.length - 1 ? "" : " ");
        // If the next index is not out of bounds
        if (index != array.length - 1) {
            // Recursively print the array increasing the index
            printArray(array, index + 1);
        }
    }
}
