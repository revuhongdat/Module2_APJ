import java.util.Scanner;
public class FindMaxMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int rows = input.nextInt();
        System.out.println("Enter the columns :");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element arr" + i + j + " :");
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
        int max = arr[0][0];
        int imax = 0;
        int jmax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arr[imax][jmax]) {
                    max = arr[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("Max of array is : " + max + " at " + imax + jmax);
        int min = arr[0][0];
        int imin = 0;
        int jmin = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < arr[imin][jmin]) {
                    min = arr[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.println("Min of array is : " + min + " at " + imin + jmin);
    }
}
