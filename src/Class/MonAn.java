package Class;

import java.util.Scanner;

public class MonAn {
    private String TenMon;
    private int Gia;

    public MonAn() {
    }

    public MonAn(String TenMon, int Gia) {
        this.TenMon = TenMon;
        this.Gia = Gia;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

   
    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ten mon: ");
        TenMon = sc.nextLine();
        System.out.printf("Gia: ");
        Gia = sc.nextInt();
    }
    
    @Override
    public String toString() {
        return "MonAn{" + "TenMon :" + TenMon + ", Gia :" + Gia + '}';
    }

    public void Output(){
        System.out.printf("%25s %10d\n",TenMon,Gia);
    }
}
