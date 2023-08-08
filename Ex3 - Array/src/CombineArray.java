import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArr1;
        int sizeArr2;
        do {
            System.out.println("Enter the length of array1 ( length <= 20 ) :");
            sizeArr1 = input.nextInt();
        } while (sizeArr1 > 20);
        int[] arr1 = new int[sizeArr1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element " + i + " of array1 :");
            arr1[i] = input.nextInt();
        }
        do {
            System.out.println("Enter the length of array2 ( length <= 20 ) :");
            sizeArr2 = input.nextInt();
        } while (sizeArr2 > 20);
        int[] arr2 = new int[sizeArr2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the element " + i + " of array2 :");
            arr2[i] = input.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.printf("\n%-20s","Array1 : ");
        for (int i : arr1) {
            System.out.printf("%-5d", i);
        }
        System.out.printf("\n%-20s","Array2 : ");
        for (int i : arr2) {
            System.out.printf("%-5d", i);
        }
        System.out.printf("\n%-20s","Array3 : ");
        for (int i : arr3) {
            System.out.printf("%-5d", i);
        }
    }
}
