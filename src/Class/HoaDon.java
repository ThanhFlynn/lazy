package Class;

import java.util.ArrayList;

public class HoaDon {
    private Integer SoBan;
    private int SoLuong;

    ArrayList<MonDat> list = new ArrayList<>();

    public HoaDon() {}

    public HoaDon(Integer soBan, int soLuong, ArrayList<MonDat> list) {
        SoBan = soBan;
        SoLuong = soLuong;
        this.list = list;
    }

    public Integer getSoBan() {
        return SoBan;
    }

    public void setSoBan(Integer soBan) {
        SoBan = soBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public ArrayList<MonDat> getList() {
        return list;
    }

    public void setList(ArrayList<MonDat> list) {
        this.list = list;
    }

    public void XuatMonAn(){
        System.out.println("Các món ăn khách hàng đã chọn là:");
        for (MonDat monDat : list) {
            monDat.toString();
        }
    }
    public int TongTien (){
        
        int sum=0;
        for (MonDat monDat : list) {
            int x = monDat.getSoLuong() * monDat.getMonAn().getGia();
            sum += x;
        }
        return sum;
    }
    public int KhuyenMai(){
        if(TongTien()>=500000)
            return TongTien()/10;
        else if(TongTien()>200000) 
            return TongTien()/20;
        return 0;
    }

    public int ThanhToan(){
        return TongTien ()-KhuyenMai();
    }

    public void XuatHoaDon(){
        System.out.println("-------------------Bill------------------------");
        System.out.printf("%5s\t%20s\t%15s\t%15s\t%15s\n","STT","Tên món","Số lượng","Đơn Giá","Thành tiền");
        for(int i=0;i<list.size();i++)
        {
            System.out.printf("%2d\t%20s\t%15d\t%15d\t%15d\n"
            ,i+1,list.get(i).getMonAn().getTenMon(),list.get(i).getSoLuong(),list.get(i).getMonAn().getGia(),list.get(i).getSoLuong()*list.get(i).getMonAn().getGia());
        }
    }
}
