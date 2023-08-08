import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,6,7,8,5,9,3,2};
        int[] newArray = new int[arr.length+1];
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Enter the index : ");
        int index = input.nextInt();
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = number;
        for (int i = index; i < arr.length; i++) {
            newArray[i+1] = arr[i];
        }
        System.out.printf("%-10s", "newArray is : ");
        for (int j : newArray) {
            System.out.printf("%-5d", j);
        }
    }
}
