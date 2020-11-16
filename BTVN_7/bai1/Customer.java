package bai1;

public class Customer extends Person{
    private Integer balance;

    public Customer(){}

    public Customer(Integer balance) {
        this.balance = balance;
    }

    public Customer(String name, String address, Integer balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void Display() {
        System.out.println("Customer name: " + super.getName());
        System.out.println("Customer address: " + super.getAddress());
        System.out.println("Customer balance: " + balance);
    }
}
