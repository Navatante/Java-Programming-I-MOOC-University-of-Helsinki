public class Product {
    private double price, quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    }
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs"  );
    }
}

