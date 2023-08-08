import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the length of array ( length <= 20 ) :");
            size = input.nextInt();
        } while (size > 20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + i + " of array :");
            array[i] = input.nextInt();
        }
        float max = array[0];
        int index = 1;
        System.out.printf("%-10s","Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d",array[i]);
            if (array[i] > max) {
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
