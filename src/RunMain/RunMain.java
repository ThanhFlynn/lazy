package RunMain;

import Class.FoodAndDrink;
import Class.Bill;
import Class.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        FoodAndDrink fad1 = new FoodAndDrink("01","Coca",25,3,10);
        FoodAndDrink fad2 = new FoodAndDrink("02","Pepsi",20,2,30);
        FoodAndDrink fad3 = new FoodAndDrink("03","Chicken",40,5,5);
        FoodAndDrink fad4 = new FoodAndDrink("04","Ice Cream",10,10,24);
        FoodAndDrink fad5 = new FoodAndDrink("05","Hamburger",30,7,20);
        FoodAndDrink fad6 = new FoodAndDrink("06","Snack",8,8,0);
        FoodAndDrink fad7 = new FoodAndDrink("07","Fried Potato",15,4,15);
        FoodAndDrink fad8 = new FoodAndDrink("08","Milk Tea",50,2,30);
        FoodAndDrink fad9 = new FoodAndDrink("09","Hot dog",20,6,5);
        FoodAndDrink fad10 = new FoodAndDrink("10","San wick",20,1,0);

        ArrayList<FoodAndDrink> fadMenu = new ArrayList<FoodAndDrink>();

        fadMenu.add(fad1);
        fadMenu.add(fad2);
        fadMenu.add(fad3);
        fadMenu.add(fad4);
        fadMenu.add(fad5);
        fadMenu.add(fad6);
        fadMenu.add(fad7);
        fadMenu.add(fad8);
        fadMenu.add(fad9);
        fadMenu.add(fad10);

        System.out.println("--------------------------------------");
        for(FoodAndDrink x: fadMenu)
            x.ShowInfo();
        System.out.println("--------------------------------------\n");

        while(true) {
            System.out.println("--------------------------------------");
            System.out.println("1. ADD Bill");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------\n");
            Scanner sc = new Scanner(System.in);
            int choose;
            choose = sc.nextInt();
            if (choose == 1) {
                Menu mn = new Menu();
                String DOT;
                System.out.print("Date: ");
                DOT = sc.nextLine();
                sc.nextLine();
                while (true) {
                    System.out.println("--------------------------------------");
                    System.out.println("1. ADD Food and Drink");
                    System.out.println("2. Delete Food and Drink");
                    System.out.println("0. Exit");
                    System.out.println("--------------------------------------\n");
                    int c;
                    c = sc.nextInt();
                    FoodAndDrink fad = new FoodAndDrink();
                    if (c == 1) {
                        fad.Input();
                        for (FoodAndDrink t : fadMenu)
                            if (t.getId().compareTo(fad.getId()) == 0) {
                                if (fad.getNumber() <= t.getNumber()) {
                                    mn.AddFoodAndDrink(fad);
                                    t.setNumber(t.getNumber() - fad.getNumber());
                                } else System.out.println("Not enough numbers");
                            }
                    }
                    else if(c == 2){
                        String s;
                        System.out.print("Id: ");
                        s = sc.nextLine();
                        for(int i=0; i<fadMenu.size(); ++i)
                            if(fadMenu.get(i).getId().compareTo(s) == 0){
                                fadMenu.remove(i);
                            }

                    }
                    else if(c==0) {
                        Bill bill = new Bill(mn,DOT);
                        System.exit(0);
                    }
                    else
                        System.out.println("Sorry! You made the wrong choise!");
                }
            }
            else if(choose == 0)
                System.exit(0);
            else
                System.out.println("Sorry! You made the wrong choise!");
        }
    }
}

