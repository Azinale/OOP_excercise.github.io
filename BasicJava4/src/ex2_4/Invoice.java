package ex2_4;

public class Invoice {
    private int id;
    private double amount;
    private Customer customer;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerID() {
        return customer.getID();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount -= ((amount * customer.getDiscount()) / 100);
    }

    @Override
    public String toString() {
        return "Invoice[" + "id=" + id + ", amount=" + amount + ", customer=" + customer + ']';
    }
}
