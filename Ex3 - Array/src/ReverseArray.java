import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the length of array ( length <= 20 ) :");
            size = input.nextInt();
        } while (size > 20);
        int array[] = new int[size];
        int arraynew[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + i + " of array :");
            array[i] = input.nextInt();
            arraynew[arraynew.length-i-1] = array[i];
        }
        System.out.printf("%-20s","Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d", array[i]);
        }
        System.out.printf("\n%-20s","NewArray : ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d", arraynew[i]);
        }
    }
}
