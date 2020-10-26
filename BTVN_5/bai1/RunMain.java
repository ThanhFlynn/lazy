package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Integer n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng điều hòa: ");
        n = sc.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            System.out.println("Nhập thông tin điều hòa thứ " +(i+1));
            DieuHoa x = new DieuHoa();
            x.Input();
            list.add(x);
        }
        for(int i=0; i<n; ++i)
            list.get(i).Output();
        double min = Double.MAX_VALUE;
        int d = 0;
        for(int i=0; i<n; ++i)
            if(list.get(i).getTenNSX().equals("Electrolux")) {
                min = Double.min(min, list.get(i).getGiaBan());
                d = 1;
            }
        if(d==0)
            System.out.println("Không có hãng sản xuất Electrolux");
        else{
            System.out.println("Thông tin các hãng sản xuất Electrolux có giá bán thấp nhất là: ");
            for(int i=0; i<n; ++i)
                if(list.get(i).getGiaBan() == min)
                    list.get(i).Output();
        }
    }
}
