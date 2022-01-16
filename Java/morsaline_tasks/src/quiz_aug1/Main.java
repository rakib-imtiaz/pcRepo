package quiz_aug1;

import java_files.DepartmentStore;

public class Main {
    public static void main(String[] args) {
        DepartmentStore dStore = new DepartmentStore("All in one store","New market,Dhaka");
        
        Product p1 = new Product("Coca-cola",25,20,12121);
        Product p2 = new Product("Pepsi",15,20,42123);
        Product p3 = new Product("Fanta",15,20,52126);
        Product p4 = new Product("Sprite",15,20,22128);
        
        dStore.addProduct(p1);
        dStore.addProduct(p2);
        dStore.addProduct(p3);
        dStore.addProduct(p4);
        
dStore.DisplayProducts();       
      //  dStore.removeProduct(p3.getProductID());
        //dStore.searchProduct(p4.getProductID());
    }
}
