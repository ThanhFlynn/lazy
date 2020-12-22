package Class;

public class MonDat {
    private int SoLuong;
    MonAn monAn;

    public MonDat() {}

    public MonDat(int soLuong, MonAn monAn) {
        SoLuong = soLuong;
        this.monAn = monAn;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }

    @Override
    public String toString() {
        return "MonDat{" +
                "SoLuong=" + SoLuong +
                ", mon=" + monAn +
                '}';
    }
}
