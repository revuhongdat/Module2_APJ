import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        double usd;
        double vnd;
        System.out.println("Input money in USD :");
        Scanner input = new Scanner(System.in);
        usd = input.nextDouble();
        vnd = usd * 23000;
        System.out.println("Money in VND is : " + vnd);
    }
}
