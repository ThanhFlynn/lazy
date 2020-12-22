package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

    public static Menu menus = new Menu();
    public static Scanner sc = new Scanner(System.in);
    public static int vt;
    public static int So_ban_an = 15;

    public static List<Account> list = new ArrayList<>();
    public static boolean[] checkBan;
    public static BanAn[] banAns;

    static {
        banAns = new BanAn[So_ban_an];
    }

    static {
        checkBan = new boolean[So_ban_an];
        for(int i=0; i<So_ban_an; ++i)
            checkBan[i] = false;
    }

    public static void main(String[] args) {
        list.add(new Account("00", "Nguyễn Chí Thành", "ThanhFlynn", "123", "admin"));
        list.get(0).setPoSiTion(ChuanHoa(list.get(0).getPoSiTion()));
        String acCount, passWord;
        while (true) {
            try {
                Login();
                int abc;
                System.out.print("Selection: ");
                abc = sc.nextInt();
                sc.nextLine();
                if(abc == 1) {
                    boolean dn = false;
                    while(!dn) {
                        System.out.print("Account: ");
                        acCount = sc.nextLine();
                        acCount = acCount.trim();
                        passWord = sc.nextLine();

                        boolean check = false;
                        for (int i=0; i<list.size(); ++i)
                            if (list.get(i).getAcCount().compareTo(acCount.trim()) == 0) {
                                if (list.get(i).getPassWord().compareTo(passWord) == 0) {
                                    if (list.get(i).getPoSiTion().compareToIgnoreCase("admin") == 0) {
                                        check = true;
                                    }
                                    vt = i;
                                    dn = true;
                                    break;
                                }
                            }
                        if (dn) {
                            if (check) {
                                Login1();
                            } else {
                                System.out.println("Welcome "+ list.get(vt).getPoSiTion() + ": " + list.get(vt).getName());
                                ShowChooseEm();
                                Employee();
                            }
                        } else {
                            System.out.println("Wrong account or password!");
                            System.out.println("Log in again!");
                        }
                    }
                }else if(abc == 0){
                    System.out.println("Goodbye!");
                    System.exit(0);
                }else{
                    System.out.println("Choose wrong, please choose again!");
                }
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }

    public static void Login(){
        System.out.println(" ______________________________________");
        System.out.println("|**************************************|");
        System.out.println("|1. Login                             *|");
        System.out.println("|0. Exit                              *|");
        System.out.println("|**************************************|");
        System.out.println(" ______________________________________");
    }
    public static void ShowChooseAd(){
        System.out.println(" ______________________________________");
        System.out.println("|**************************************|");
        System.out.println("|1. Add employee                      *|");
        System.out.println("|2. Del employee                      *|");
        System.out.println("|3. Display all employee's account    *|");
        System.out.println("|4. Sort employee                     *|");
        System.out.println("|0. Log out                           *|");
        System.out.println("|**************************************|");
        System.out.println(" --------------------------------------");
    }

    public static void ShowChooseEm(){
        System.out.println(" --------------------------------------");
        System.out.println("|**************************************|");
        System.out.println("|1. Add the dish to the menu          *|");
        System.out.println("|2. Remove the dish from the menu     *|");
        System.out.println("|3. Show the menu                     *|");
        System.out.println("|4. Add dining table                  *|");
        //System.out.println("|5. Show all dining tables            *|");
        System.out.println("|0. Log out                           *|");
        System.out.println("|**************************************|");
        System.out.println(" --------------------------------------");
    }

    public static void Employee(){
        while (true) {
            try {
                int choose;
                System.out.print("Select: ");
                choose = sc.nextInt();
                if (choose == 1) {
                    Add_dish_to_menu();
                } else if (choose == 2) {
                    Remove_dish_from_menu();
                } else if (choose == 3) {
                    ShowMenu();
                } else if (choose == 4) {
                    Add_table();
                } /*else if (choose == 5) {

                }*/ else if (choose == 0) {
                    System.out.println("Log out!");
                    break;
                } else System.out.println("Choose wrong, please choose again!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void ShowAccInfo(){
        System.out.printf("%5s %32s %13s\n","Id","Name","Position");
        for(Account account : list)
            if(account.getPoSiTion().trim().compareToIgnoreCase("Employee") == 0){
            account.Output();
        }
    }

    public static void Del_Em_By_Id(String id){
        for(int i=0; i<list.size(); ++i)
            if(list.get(i).getId().compareTo(id) == 0){
                list.remove(i);
                break;
            }
    }

    public static void Del_Em_By_Name(String name){
        for(int i=0; i<list.size(); ++i)
            if(list.get(i).getName().compareToIgnoreCase(name) == 0){
                list.remove(i);
                break;
            }
    }

    public static void Add_table(){
        boolean over = false;
        int index = 0;
        for(int i=0; i<So_ban_an; ++i)
            if(!checkBan[i]){
                checkBan[i] = true;
                over = true;
                index = i;
                break;
            }
        if(!over){
            System.out.println("Sorry!! No more dining tables!");
        }else {
            System.out.println("Table: " + (index+1));
            System.out.print("Amount of people: ");
            int soNguoi1;
            soNguoi1 = sc.nextInt();
            sc.nextLine();
            banAns[index] = new BanAn();
            banAns[index].setSoNguoi(soNguoi1);
            banAns[index].setSoBan(index);
            banAns[index].hoaDon = new HoaDon();
            banAns[index].hoaDon.setSoBan(index);
            System.out.println("\t1. Choose food");
            System.out.println("\t2. Delete food from bill");
            System.out.println("\t0. End");
            int ch;
            while (true) {
                try {
                    System.out.print("Selection: ");
                    ch = sc.nextInt();
                    sc.nextLine();
                    if (ch == 1) {
                        System.out.print("Food: ");
                        String food;
                        food = sc.nextLine();
                        food = food.trim();
                        int soLuong;
                        System.out.print("Amount: ");
                        soLuong = sc.nextInt();
                        for(MonAn monAn : menus.list)
                            if(monAn.getTenMon().compareToIgnoreCase(food) == 0){
                                MonDat monDat = new MonDat(soLuong,monAn);
                                banAns[index].hoaDon.list.add(monDat);
                                break;
                            }
                    }else if(ch == 2){
                        String food;
                        System.out.print("Delete food: ");
                        food = sc.nextLine();
                        for(int i=0; i<banAns[index].hoaDon.list.size(); ++i)
                            if(banAns[index].hoaDon.list.get(i).getMonAn().getTenMon().compareToIgnoreCase(food) == 0){
                                banAns[index].hoaDon.list.remove(i);
                                break;
                            }
                    } else if(ch == 0){
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Payment confirmation: ");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");
            while (true) {
                ch = sc.nextInt();
                if (ch == 1) {
                    banAns[index].hoaDon.XuatHoaDon();
                    System.out.println("Total money: " + banAns[index].hoaDon.TongTien());
                    System.out.println("Discount: " + banAns[index].hoaDon.KhuyenMai());
                    System.out.println("Price: " + banAns[index].hoaDon.ThanhToan());
                    banAns[index] = null;
                    checkBan[index] = false;
                    break;
                } else if (ch == 0) {
                    banAns[index] = null;
                    break;
                }else {
                    System.out.println("Choose wrong, please choose again!");
                }
            }
            System.out.println("Thank you");
        }
    }

    public static void Login1() {
        System.out.println("Welcome "+ list.get(vt).getPoSiTion() + ": " + list.get(vt).getName());
        ShowChooseAd();
        while (true) {
            try {
                int choose;
                System.out.print("Select: ");
                choose = sc.nextInt();
                if (choose == 1) {
                    Account c = new Account();
                    c.Input();
                    c.setPoSiTion(ChuanHoa(c.getPoSiTion()));
                    list.add(c);
                } else if (choose == 2) {
                    System.out.println("\t2.1. Del employee by id");
                    System.out.println("\t2.2. Del employee by name");
                    try {
                        int select;
                        System.out.print("Select delete: ");
                        select = sc.nextByte();
                        if (select == 1) {
                            String Id;
                            System.out.print("Id: ");
                            sc.nextLine();
                            Id = sc.nextLine();
                            Del_Em_By_Id(Id);
                        } else if (select == 2) {
                            String Name;
                            System.out.print("Name: ");
                            sc.nextLine();
                            Name = sc.nextLine();
                            Del_Em_By_Name(Name);
                        } else System.out.println("Choose wrong, please choose again!");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        break;
                    }
                } else if (choose == 3) {
                    ShowAccInfo();
                } else if(choose == 4){
                    System.out.println("\t1. Sort employee by id");
                    System.out.println("\t2. Sort employee by id");
                    int sel;
                    System.out.print("Your choice: ");
                    sel = sc.nextInt();
                    if(sel == 1){
                        for(int i=0; i<list.size()-1; ++i)
                            for(int j=i+1; j<list.size(); ++j)
                                if(list.get(i).getId().compareTo(list.get(j).getId()) == 1){
                                    Account tg = list.get(i);
                                    list.get(i).setPoSiTion(list.get(j).getPoSiTion());
                                    list.get(i).setId(list.get(j).getId());
                                    list.get(i).setName(list.get(j).getName());
                                    list.get(i).setAcCount(list.get(j).getAcCount());
                                    list.get(i).setPassWord(list.get(j).getPassWord());
                                    list.get(j).setPoSiTion(tg.getPoSiTion());
                                    list.get(j).setId(tg.getId());
                                    list.get(j).setName(tg.getName());
                                    list.get(j).setAcCount(tg.getAcCount());
                                    list.get(j).setPassWord(tg.getPassWord());
                                }
                    }else if(sel == 2){
                        list.sort(new SortPeopleByName());
                    }
                } else if (choose == 0) {
                    System.out.println("Log out!");
                    break;
                } else System.out.println("Choose wrong, please choose again!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void Add_dish_to_menu(){
        MonAn x = new MonAn();
        x.Input();
        menus.list.add(x);
    }

    public static void Remove_dish_from_menu(){
        System.out.print("Tên món ăn cần xóa: ");
        String s;
        s = sc.nextLine();
        for(int i=0; i<menus.list.size(); ++i)
            if(menus.list.get(i).getTenMon().compareToIgnoreCase(s) == 0) {
                menus.list.remove(i);
                break;
            }
    }

    public static void ShowMenu(){
        System.out.printf("%25s %10s\n","Tên món","Giá");
        for(MonAn monAn : menus.list)
            monAn.Output();
    }

    public static String ChuanHoa(String s){
        String str = s;
        str = str.toLowerCase();
        char c = str.charAt(0);
        c -= 32;
        return c + str.substring(1);
    }
}
