public class Product {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    // constructor
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public Product() {
        this.productId = 0;
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // getters & setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // methods
    public boolean isAvailable() {
        return quantity > 0;
    }

    public void reduceQuantity(int amount) {
        if (amount > 0 && quantity >= amount) {
            quantity -= amount;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Product{id=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + '}';
    }
}
