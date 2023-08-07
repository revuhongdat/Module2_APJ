import java.util.Scanner;
public class BankInterestCalculator {
    public static void main(String[] args) {
        float money,interest,totalMoney;
        int month;
        System.out.println("Enter the money :");
        Scanner input = new Scanner(System.in);
        money = input.nextFloat();
        System.out.println("Enter the interest :");
        interest = input.nextFloat();
        System.out.println("Enter the Month :");
        month = input.nextInt();
        totalMoney = (float) (money * Math.pow(1+(interest / 1200),month));
        System.out.println("Total money after " + month + " month is : " + totalMoney);
    }
}
