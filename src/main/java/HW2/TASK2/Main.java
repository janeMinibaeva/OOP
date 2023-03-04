package HW2.TASK2;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(10);
        vendingMachine.addProduct(new Product("coffee",170,200));
        vendingMachine.addProduct(new Product("snickers",80));
        vendingMachine.addProduct(new Product("mars",75));
        vendingMachine.addProduct(new Product("nuts",60));

        try {
            System.out.println(vendingMachine.getProductByName("mars"));
            System.out.println(vendingMachine.getProductByCost(80));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
