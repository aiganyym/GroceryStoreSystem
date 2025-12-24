public class Customer {

    private int customerId;
    private String name;
    private String level;
    private double totalSpent;

    public Customer(int customerId, String name, String level, double totalSpent) {
        this.customerId = customerId;
        this.name = name;
        this.level = level;
        this.totalSpent = totalSpent;
    }

    public Customer() {
        this.customerId = 0;
        this.name = "Guest";
        this.level = "Standard";
        this.totalSpent = 0.0;
    }

    // getters & setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    // methods
    public void addPurchase(double amount) {
        if (amount > 0) {
            totalSpent += amount;
            if (totalSpent > 50000) {
                level = "VIP";
            }
        }
    }

    public boolean isVIP() {
        return level.equals("VIP");
    }

    @Override
    public String toString() {
        return "Customer{id=" + customerId +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", totalSpent=" + totalSpent + '}';
    }
}
