package bai1;

public class Employee extends Person{
    private Integer salary;

    public Employee(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, Integer salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void Display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
