package find_ascending_tring;

import java.util.LinkedList;
import java.util.Scanner;

public class FindAscendingString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();
        LinkedList<Character> result = findAscendingString(string);
        for (Character element: result) {
            System.out.print(element);
        }
    }
    public static LinkedList<Character> findAscendingString(String string) {
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        return max;
    }
}
