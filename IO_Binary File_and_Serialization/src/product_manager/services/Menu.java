package product_manager.services;

import java.util.Scanner;

public class Menu {
    public void start() {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm sản phẩm theo tên");
            System.out.println("4.Xuất file thông tin sản phẩm");
            System.out.println("5.Đọc file thông tin sản phẩm");
            System.out.println("0.Thoát");
            System.out.print("Nhập lựa chọn của bạn:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.displayProductList();
                    break;
                case 3:
                    productManager.findProductByName();
                    break;
                case 4:
                    productManager.writeDataToFile();
                    break;
                case 5:
                    productManager.readDataFromFile();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
