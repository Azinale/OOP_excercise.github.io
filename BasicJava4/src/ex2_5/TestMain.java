package ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer an = new Customer(999, "Quysh", 'm');
        System.out.println(an);
        Account acc1 = new Account(777, an, 1707);

        acc1.withdraw(7000);
        System.out.println(acc1);
        acc1.deposit(1707);
        System.out.println(acc1);
    }
}
