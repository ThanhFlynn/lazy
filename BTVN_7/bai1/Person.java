package bai1;

public abstract class Person {
    private String name,address;

    public Person(){}

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " +address);
    }
}
