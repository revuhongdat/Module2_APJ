import java.util.Scanner;
public class DelElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,6,7,8,5,9,3,2};
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        int index = -1;
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check) {
            for (int j = index; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = 0;
            System.out.printf("%-10s", "newArray :");
            for (int k : arr) {
                System.out.printf("%5d", k);
            }
        } else {
            System.out.println(number + " is not found!");
        }
    }
}
