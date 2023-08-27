package illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        triangleCheck();
    }
    public static void triangleCheck() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập canh a: ");
            int a = scanner.nextInt();
            System.out.println("Hãy nhập canh b: ");
            int b = scanner.nextInt();
            System.out.println("Hãy nhập canh c: ");
            int c = scanner.nextInt();
            if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException();
            }
        }catch (IllegalTriangleException e) {
            System.out.println("3 cạnh đã nhập không phải 3 cạnh của tam giác");;
        }
    }
}
