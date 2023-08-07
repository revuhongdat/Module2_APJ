import java.util.Scanner;
public class SayHello {
    public static void main(String[] args) {
        String name;
        System.out.println("Input your name :");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
