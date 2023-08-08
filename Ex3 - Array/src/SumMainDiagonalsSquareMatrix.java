import java.util.Scanner;

public class SumMainDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of matrix :");
        int length = input.nextInt();
        int[][] arr = new int[length][length];
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
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i] + arr[i][arr.length-1-i];
        }
        System.out.println("Sum main diagonals of a square matrix is : " + sum);
    }
}
