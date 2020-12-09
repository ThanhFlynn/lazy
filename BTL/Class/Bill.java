package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {
    private  String SoPhieu;
    Customer customer ;
    List<Food> food=new ArrayList<>();
    private int CachTT;

    public Bill(){};
    public Bill(String soPhieu, Customer customer, List<Food> food) {
        SoPhieu = soPhieu;
        this.customer = customer;
        this.food = food;
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        SoPhieu = soPhieu;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phieu :");
        SoPhieu=sc.nextLine();
        System.out.println("Nhap thong tin khach hang :");
        customer=new Customer();
        customer.nhap();

        System.out.println("Nhap cach thanh toan :\n 1.tien mat\n2.the tin dung");
        try{
            CachTT=sc.nextInt();
            if(CachTT == 1 || CachTT == 2){

            }
            else{
                System.out.println("Nhap sai moi nhap lai!");
                return;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
