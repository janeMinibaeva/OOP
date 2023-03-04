package HW2.TASK2;

public class Product {
    private String nameProduct;
    private int price;
    private int volume;

    Product (String nameProduct, int price, int volume){
        this.nameProduct = nameProduct;
        this.price = price;
        this.volume = volume;
    }

    Product (String nameProduct, int price){
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct(){
        return this.nameProduct;
    }

    public int getPrice(){
        return this.price;
    }

    public int getVolume(){
        return this.volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}
