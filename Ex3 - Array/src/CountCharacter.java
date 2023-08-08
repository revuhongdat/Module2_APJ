import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = input.nextLine();
        System.out.print("Enter the character : ");
        char c = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                count += 1;
            }
        }
        System.out.println("Character " + c + " appears " + count + " times in String");
    }
}
