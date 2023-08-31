package product_manager.services;

import product_manager.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private final ArrayList<Product> productsList;
    private final Scanner sc;
    public ProductManager() {
        this.productsList = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }
    public void addProduct() {
        try {
            System.out.println("Nhập mã sản phẩm: ");
            String code = sc.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.println("Nhập giá sản phẩm: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập hãng sản xuất: ");
            String manufacture = sc.nextLine();
            System.out.println("Mô tả sản phẩm: ");
            String description = sc.nextLine();
            Product newProduct = new Product(code, name, price, manufacture, description);
            productsList.add(newProduct);
            System.out.println("Tạo sản phẩm thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void displayProductList() {
        if (!productsList.isEmpty()) {
            System.out.println("Product List:");
            for (Product p : productsList) {
                System.out.println(p);
            }
        } else {
            System.out.println("Danh sách trống!");
        }
    }
    public void findProductByName() {
        System.out.println("Nhập tên sản phẩm muốn tìm:");
        String name = sc.nextLine();
        for (Product e : productsList) {
            if (e.getName().equals(name)) {
                System.out.println(e);
                break;
            }
        }
    }
    public void writeDataToFile() {
        try {
            System.out.println("Nhập tên file:");
            String linkFile = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(linkFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productsList);
            oos.close();
            fos.close();
            System.out.println("Dữ liệu sản phẩm đã được lưu vào file " + linkFile + " thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readDataFromFile() {
        try {
            ArrayList<Product> productsList = new ArrayList<>();
            System.out.println("Nhập tên file:");
            String linkFile = sc.nextLine();
            FileInputStream fis = new FileInputStream(linkFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productsList = (ArrayList<Product>) ois.readObject();
            fis.close();
            ois.close();
            for (Product e : productsList) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
