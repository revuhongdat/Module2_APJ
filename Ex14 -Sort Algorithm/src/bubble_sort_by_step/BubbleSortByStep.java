package bubble_sort_by_step;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " elements in your array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your input array: ");
        for (int element : array) {
            System.out.printf("%5d", element);
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Your array after sort: ");
        for (int element : array) {
            System.out.printf("%5d", element);
        }
    }
    public static void bubbleSort(int[] array) {
        boolean checkContinue = true;
        for (int i = 0; i < array.length && checkContinue; i++) {
            checkContinue = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    System.out.println("Swap " + array[j] + " with " + array[j - 1]);
                    System.out.println("Array after " + i + " times sort: ");
                    checkContinue = true;
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    for (int element : array) {
                        System.out.printf("%5d", element);
                    }
                    System.out.println();
                }
            }
        }
        if (!checkContinue){
            System.out.println("Sort done!!!");
        }
    }
}
