import java.util.Scanner;

public class DrawMenu2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the width :");
                    int width = input.nextInt();
                    System.out.println("Enter the height :");
                    int height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("Enter the length :");
                    int length = input.nextInt();
                    System.out.println("Menu Print the square triangle :");
                    System.out.println("1. top-left");
                    System.out.println("2. top-right");
                    System.out.println("3. bottom-left");
                    System.out.println("4. bottom-right");
                    System.out.println("Enter your choice: ");
                    int choiceCase2 = input.nextInt();
                    switch (choiceCase2) {
                        case 1 -> {
                            for (int i = 1; i <= length; i++) {
                                for (int j = 1; j <= length - i + 1; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                        case 2 -> {
                            for (int i = 1; i <= length; i++) {
                                for (int j = 1; j <= i-1; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= length - i + 1; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                        case 3 -> {
                            for (int i = 1; i <= length; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                        case 4 -> {
                            for (int i = 1; i <= length; i++) {
                                for (int j = 1; j <= length-i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Enter the length :");
                    int length = input.nextInt();
                    for (int i = 1; i <= length; i++) {
                        for (int j = 1; j <=length - i ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i -1 ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
