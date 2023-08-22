package product_manager_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private final List<Product> productsList = new ArrayList<Product>();

    public ProductManager() {}

    public void addProduct(String Name, int id, double price) {
       Product newProduct = new Product(Name, id, price);
       productsList.add(newProduct);
    }

    public void editProductWithId(int id, String editName, double editPrice) {
        for(Product element : productsList) {
            if (element.getId() == id) {
                element.setName(editName);
                element.setPrice(editPrice);
            }
        }
    }
    public void deleteProductWithId(int id) {
        for(Product element : productsList) {
            if (element.getId() == id) {
                productsList.remove(element);
                break;
            }
        }
    }
    public void displayProductsList() {
        for (Product element : productsList) {
            System.out.println(element.toString());
        }
    }
    public Product searchProductByName(String name) {
        for (Product element:productsList) {
            if (element.getName() == name) {
                return element;
            }
        }
        return null;
    }
    public void sortAscending() {
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(productsList,comparator);
    }
    public void sortDescending() {
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(productsList,comparator);
    }

}
