package RunMain;

import Class.FoodAndDrink;
import Class.Bill;
import Class.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {



    public static void main(String[] args) {

        ArrayList<FoodAndDrink> fadMenu = new ArrayList<FoodAndDrink>();

        fadMenu.add(new FoodAndDrink("01","Coca",25,3,10));
        fadMenu.add(new FoodAndDrink("02","Pepsi",20,2,30));
        fadMenu.add(new FoodAndDrink("03","Chicken",40,5,5));
        fadMenu.add(new FoodAndDrink("04","Ice Cream",10,10,24));
        fadMenu.add(new FoodAndDrink("05","Hamburger",30,7,20));
        fadMenu.add(new FoodAndDrink("06","Snack",8,8,0));
        fadMenu.add(new FoodAndDrink("07","Fried Potato",15,4,15));
        fadMenu.add(new FoodAndDrink("08","Milk Tea",50,2,30));
        fadMenu.add(new FoodAndDrink("09","Hot dog",20,6,5));
        fadMenu.add(new FoodAndDrink("10","San wick",20,1,0));

        System.out.println("--------------------------------------");
        for(FoodAndDrink x: fadMenu)
            x.ShowInfo();
        System.out.println("--------------------------------------\n");

        while(true) {
            System.out.println("--------------------------------------");
            System.out.println("1. ADD Bill");
            System.out.println("2. Show Menu");
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
                    FoodAndDrink abc = new FoodAndDrink();
                    if (c == 1) {
                        int c1;
                        System.out.println("1.1. Add Food and Drink by Id");
                        System.out.println("1.2. Add Food and Drink by Name\n");
                        System.out.print("Choose: ");
                        c1 = sc.nextInt();
                        if(c1 == 1){
                            String s;
                            System.out.print("Id Food and Drink: ");
                            s = sc.nextLine();
                            int sl;
                            System.out.print("So luong: ");
                            sl = sc.nextInt();
                            for (FoodAndDrink t : fadMenu)
                                if (t.getId().compareTo(fad.getId()) == 0) {
                                    if(sl > t.getNumber())
                                        System.out.println("Not enough number");
                                    else {
                                        abc = t;
                                        abc.setNumber(t.getNumber() - sl);
                                        mn.AddFoodAndDrink(abc);
                                    }
                                }
                        }
                        else if(c1 == 2){
                            String s;
                            System.out.print("Name of Food and Drink: ");
                            s = sc.nextLine();
                            int sl;
                            System.out.print("So luong: ");
                            sl = sc.nextInt();
                            for (FoodAndDrink t : fadMenu)
                                if (t.getName().compareTo(fad.getId()) == 0) {
                                    if(sl > t.getNumber())
                                        System.out.println("Not enough number");
                                    else {
                                        abc = t;
                                        abc.setNumber(t.getNumber() - sl);
                                        mn.AddFoodAndDrink(abc);
                                    }
                                }
                        }
                    }
                    else if (c == 2) {
                        int c1;
                        System.out.println("2.1. Delete Food and Drink by Id");
                        System.out.println("2.2. Delete Food and Drink by Name\n");
                        System.out.print("Choose: ");
                        c1 = sc.nextInt();
                        if(c1 == 1){
                            String s;
                            System.out.print("Id Food and Drink: ");
                            s = sc.nextLine();
                            for (int i=0; i<fadMenu.size(); ++i)
                                if (fadMenu.get(i).getId().compareTo(s) == 0) {
                                    fadMenu.remove(i);
                                }
                        }
                        else if(c1 == 2){
                            String s;
                            System.out.print("Name of Food and Drink: ");
                            s = sc.nextLine();
                            for (int i=0; i<fadMenu.size(); ++i)
                                if (fadMenu.get(i).getName().compareTo(fad.getId()) == 0) {
                                    fadMenu.remove(i);
                                }
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
            else if(choose == 2){
                for(FoodAndDrink x: fadMenu)
                    x.ShowInfo();
            }
            else if(choose == 0)
                System.exit(0);
            else
                System.out.println("Sorry! You made the wrong choise!");
        }
    }
}

