import java.util.Scanner;

public class CalculateColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows :");
        int rows = input.nextInt();
        System.out.print("Enter the columns :");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the element arr" + i + j + " :");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.printf("%-10s\n", "Array :");
        for (int[] arri : arr) {
            for (int arrj : arri) {
                System.out.printf("%5d", arrj);
            }
            System.out.println();
        }
        System.out.print("Enter columns you want to sum :");
        int number = input.nextInt();
        int sum = 0;
        for (int[] arri : arr) {
            sum += arri[number];
        }
        System.out.println("Sum at column " + number + " is : " + sum);
    }
}
