package product_manager.models;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private double price;
    private String manufacture;
    private String description;

    public Product(String code, String name, double price, String manufacture, String description) {
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.description = description;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
