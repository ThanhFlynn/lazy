package bai3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa hh1 = new HangHoa("HH1","Tai nghe",20,1);
        HangHoa hh2 = new HangHoa();
        hh2.setMaHang("HH2");
        hh2.setTenHang("Laptop");
        hh2.setDonGia(20);
        hh2.setSoLuong(1);
        System.out.println("Thông tin hàng hóa 1: ");
        hh1.Xuat();
        System.out.println();
        System.out.println("Thông tin hàng hóa 2: ");
        hh2.Xuat();
    }
}
