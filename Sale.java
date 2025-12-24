public class Sale {

    private int saleId;
    private String customerName;
    private double total;
    private String status;

    public Sale(int saleId, String customerName, double total, String status) {
        this.saleId = saleId;
        this.customerName = customerName;
        this.total = total;
        this.status = status;
    }

    // getters & setters
    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // методы с логикой
    public void completeSale() {
        status = "Completed";
    }

    public boolean isCompleted() {
        return status.equals("Completed");
    }

    @Override
    public String toString() {
        return "Sale{id=" + saleId +
                ", customer='" + customerName + '\'' +
                ", total=" + total +
                ", status='" + status + '\'' + '}';
    }
}
