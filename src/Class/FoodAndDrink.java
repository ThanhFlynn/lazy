package Class;

import java.util.Scanner;

public class FoodAndDrink {
    private String id;
    private String name;
    private double price;
    private int number;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public FoodAndDrink() {}

    public FoodAndDrink(String id, String name, float price, int number, float discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.discount = discount;
    }

    public void ShowInfo()
    {
        //System.out.format("Id: %10s" + this.id + "Name: %20" + this.name + "Price: %10f" + this.price + "Number: %10f" + this.number + "Discount: " + this.discount + "%");
        System.out.format("Id: %5s\tName: %20s\tPrice: %10f\tNumber: %5d\tDiscount: %10f\n",this.id,this.name,this.price,this.number,this.discount);
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Id FAD: ");
        id = sc.nextLine();
        System.out.print("Name FAD: ");
        name = sc.nextLine();
        System.out.print("Price FAD: ");
        price = sc.nextDouble();
        System.out.print("Number FAD: ");
        number = sc.nextInt();
        System.out.print("Discount FAD: ");
        discount = sc.nextDouble();
    }

    public double getPayment(){
        return price*number*((100-discount)/100);
    }
}
