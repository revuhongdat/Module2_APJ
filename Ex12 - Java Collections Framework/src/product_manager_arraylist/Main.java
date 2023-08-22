package product_manager_arraylist;

public class Main {
    public static void main(String[] args) {
        ProductManager productsList = new ProductManager();
        productsList.addProduct("A",1,1000);
        productsList.addProduct("B",2,2500);
        productsList.addProduct("D",3,1500);
        productsList.addProduct("C",4,5000);
        productsList.sortAscending();
        productsList.sortDescending();
//        System.out.println(productsList.searchProductByName("A"));
        productsList.editProductWithId(1,"DAT",10000000);
        productsList.deleteProductWithId(1);
        productsList.displayProductsList();
    }
}
