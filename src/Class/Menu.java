package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<FoodAndDrink> fadList;

    public Menu() {
        this.fadList = new ArrayList<FoodAndDrink>();
    }

    public List<FoodAndDrink> getFadList() {
        return fadList;
    }

    public void setFadList(List<FoodAndDrink> fadList) {
        this.fadList = fadList;
    }

    public void AddFoodAndDrink(FoodAndDrink fad){
        fadList.add(fad);
    }

    private FoodAndDrink getFADbyName(String name){
        for (FoodAndDrink item : fadList)
        {
            if (item.getName().toLowerCase().equals(name.toLowerCase())){
                return item;
            }
        }
        return null;
    }

    public void DelFoodAndDrink(){
        System.out.println("Input name of food or drink: ");
        Scanner sc = new Scanner(System.in);
        String fadName = sc.nextLine();
        if (getFADbyName(fadName)!=null) {
            fadList.remove(getFADbyName(fadName));
            System.out.println("Remove " + fadName + " successed...");
        }
        else{
            System.out.println("Not found " + fadName);
        }

    }

    public float getBillPayment(){
        float sum = 0;
        for (FoodAndDrink item : fadList){
            sum+=item.getPayment();
        }
        return sum;
    }

    public void ShowMenu()
    {
        for (FoodAndDrink item : fadList){
            item.ShowInfo();
        }
    }
}
