package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Bai4.Array arr1 = new Bai4.Array();
        Bai4.Array arr2 = new Bai4.Array();
        arr1.InputData();
        System.out.println(arr1.Sum() / (double)arr1.getN());
        double TBC1 = arr1.Sum() / (double)arr1.getN();
        arr2.InputData();
        System.out.println(arr2.Sum() / (double)arr2.getN());
        double TBC2 = arr2.Sum() / (double)arr2.getN();
        if(TBC1 > TBC2)
            System.out.println("TBC của arr1 lớn hơn arr2");
        else if(TBC1 < TBC2)
            System.out.println("TBC của arr1 nhỏ hơn arr2");
        else
            System.out.println("Hi");
    }
}