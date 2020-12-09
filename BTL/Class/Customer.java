package Class;

import java.util.Scanner;

public class Customer {
    private String Ten;
    private String Sdt;
    private String DiaChi;
    private static int Diem=0;
    public  Customer(){};
    public Customer(String ten, String sdt, String diaChi) {
        Ten = ten;
        Sdt = sdt;
        DiaChi = diaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public static int getDiem() {
        return Diem;
    }

    public static void setDiem(int diem) {
        Diem = diem;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten khach hang :");
        Ten=sc.nextLine();
        System.out.println("nhap Sdt:");
        Sdt=sc.nextLine();
        System.out.println("nhap dia chi :");
        DiaChi=sc.nextLine();

    }

    @Override
    public String toString() {
        return "Customer{" +
                "Ten='" + Ten + '\'' +
                ", Sdt='" + Sdt + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
