package ex2_4;

public class Customer {
    private int id, discount;
    private String name;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\"" + name + "(" + id + ")" + "(" + discount + "%" + ")" + "\"";
    }
}
