import java.util.Scanner;       //import lớp scanner vào thì ở dưới mới dùng được
public class RectangleArea {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);     //Khai báo obj mới
        System.out.println("Input width :");        //Hiện ra màn hình thông báo nhập width
        width = input.nextFloat();      //Nhập giá trị width từ bàn phím và ghi vào biến width
        System.out.println("Input height :");
        height = input.nextFloat();
        float area = width * height;
        System.out.println("Area of the rectangle is :" + area);
    }
}
