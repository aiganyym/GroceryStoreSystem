public class Main {
    public static void main(String[] args) {

        System.out.println("=== Grocery Store System ===\n");

        
        Product apple = new Product(1, "Apple", 250, 30);
        Product milk = new Product(2, "Milk", 450, 10);

        
        Customer customer = new Customer(101, "Student", "Standard", 0);

        
        System.out.println("Products:");
        System.out.println(apple);
        System.out.println(milk);

        
        double total = apple.getPrice() * 2;
        apple.reduceQuantity(2);
        customer.addPurchase(total);

        
        Sale sale = new Sale(5001, customer.getName(), total, "Pending");
        sale.completeSale();

        System.out.println("\nSale info:");
        System.out.println(sale);

        System.out.println("\nCustomer info:");
        System.out.println(customer);

        System.out.println("\n=== Program Complete ===");
    }
}
