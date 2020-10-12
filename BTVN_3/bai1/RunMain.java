package bai1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person("TokuDoan","XX/XX/2000","Chưa xác định","Xem phim đam mỹ");
        Person DiepBueDe = new Person("DiepBueDe","XX/XX/2000","BueDe :v","Chắc là thích TokoDoan");
        System.out.println("Thông tin chi tiết về TokuDoan");
        DoanXinhGai.display();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-Hasagi-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Thông tin chi tiết về DiepBueDe");
        DiepBueDe.display();
    }
}
