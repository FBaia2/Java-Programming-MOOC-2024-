import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println("Smallest: " + MainProgram.smallest(array));
        int[] numbers = { 6, 5, 8, 7, 11 };
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        int[] numbers1 = { -1, 6, 9, 8, 12 };
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] numbers) {
        int small = 1000000;
        for (int i : numbers) {
            if (i < small) {
                small = i;
            }

        }
        return small;
    }

    public static int indexOfSmallest(int[] numbers) {
        int smallestNumber = Integer.MAX_VALUE;
        int smallestIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = Integer.MAX_VALUE;
        int smallestIndexfrom = -1;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestNumber) {
                smallestNumber = table[i];
                smallestIndexfrom = i;
            }
        }
        return smallestIndexfrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int indexholder = 0;
        indexholder = array[index1];
        array[index1] = array[index2];
        array[index2] = indexholder;

        // write your code here
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int smallestNumber = Integer.MAX_VALUE;
            int smallestIndex = -1;
            for (int i = j; i < array.length; i++) {
                if (array[i] < smallestNumber) {
                    smallestNumber = array[i];
                    smallestIndex = i;
                }
            }
            // Swap the smallest number found with the number at the current position
            int temp = array[j];
            array[j] = array[smallestIndex];
            array[smallestIndex] = temp;

            // Print the array after each swap
            System.out.println(Arrays.toString(array));
        }
    }
}