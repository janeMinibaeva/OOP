package HW2.TASK2;

import HW2.TASK2.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private int size;

    VendingMachine(int size){
        this.size = size;
    }

    public void addProduct(Product product){
        products.add(product);
        size++;
    }

    public Product getProductByName(String name) throws Exception{
        for (Product pr : products){
            if (pr.getNameProduct().equals(name)){
                return pr;
            }
        }
        throw new Exception("not fountd product");
    }

    public Product getProductByCost(double price) throws Exception{
        for (Product pr: products){
            if (pr.getPrice() == price){
                return pr;
            }
        }
        throw new Exception("not fountd product");
    }
}
