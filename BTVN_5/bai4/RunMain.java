package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void menu(ArrayList<SinhVien> list ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("/************************************/");
        System.out.println(" 1. Add student.");
        System.out.println(" 2. Edit student by id.");
        System.out.println(" 3. Delete student by id.");
        System.out.println(" 4. Show student.");
        System.out.println(" 5. Sort student by gpa.");
        System.out.println(" 6. Sort student by name.");
        System.out.println(" 7. Exit.");
        System.out.println("/************************************/");
        Boolean check = true;
        do {
            System.out.print("Chọn : ");
            int chose;
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên cần thêm: ");
                    SinhVien x = new SinhVien();
                    x.Input();
                    list.add(x);
                    break;
                case 2:
                    String n;
                    System.out.println("Nhập ID cần sửa thông tin: ");
                    n = scanner.nextLine();
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).getId().equals(n)){
                            SinhVien t = new SinhVien();
                            t.Input();
                            list.set(i,t);
                            break;
                        }
                    }
                    break;
                case 3:
                    String str;
                    System.out.println("Nhập ID: ");
                    str = scanner.nextLine();
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).getId().equals(str)){
                            list.remove(i);
                            break;
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                    break;
                case 5:
                    for(int i=0;i<list.size()-1;i++){
                        for(int j=i;j<list.size();j++){
                            if(list.get(i).getGpa() > list.get(j).getGpa()){
                                SinhVien tg = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, tg);
                            }
                        }
                    }
                    break;
                case 6:
                    for(int i=0;i<list.size()-1;i++){
                        for(int j=i;j<list.size();j++){
                            if(list.get(i).getName().compareTo(list.get(j).getName()) >0){
                                SinhVien tg = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, tg);
                            }
                        }
                    }
                    break;
                case 7:
                    check = false;
                    System.out.println("Thoát menu!");
                    break;
            }
        }while(check);
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        menu(list);
    }
}