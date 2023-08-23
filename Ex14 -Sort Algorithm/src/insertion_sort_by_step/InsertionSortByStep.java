package insertion_sort_by_step;

import java.util.Scanner;

public class InsertionSortByStep {
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
            System.out.printf("%-5d", element);
        }
        System.out.println();
        insertionSort(array);
        System.out.println("Your array after InsertionSort: ");
        for (int element : array) {
            System.out.printf("%-5d", element);
        }
    }
    public static void insertionSort(int[] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.printf("Swap element %2d with %2d\n", array[pos],array[pos-1]);
                array[pos] = array[pos-1];
                for (int element : array) {
                    System.out.printf("%-5d", element);
                }
                System.out.println();
                pos--;
            }
            array[pos] = x;
        }
    }
}
