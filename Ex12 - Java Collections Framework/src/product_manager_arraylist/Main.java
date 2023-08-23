package product_manager_arraylist;

public class Main {
    public static void main(String[] args) {
        ProductManager aaaa = new ProductManager();
        aaaa.addProduct("A",1,1000);
        aaaa.addProduct("B",2,2500);
        aaaa.addProduct("D",3,1500);
        aaaa.addProduct("C",4,5000);
        aaaa.sortAscending();
        aaaa.sortDescending();
//        System.out.println(aaaa.searchProductByName("A"));
        aaaa.editProductWithId(1,"DAT",10000000);
        aaaa.deleteProductWithId(1);
        aaaa.displayProductsList();
    }
}
