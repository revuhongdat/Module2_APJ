import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        System.out.println("Input the month :");
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " has 31 days!" );
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month " + month + " has 30 days!" );
                break;
            case 2:
                System.out.println("Month 2 has 28 or 29 days!" );
        }
    }
}
