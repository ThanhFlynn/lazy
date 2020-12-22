package Class;

import java.util.Scanner;

public class Account {
    private String Id;
    private String name;
    private String acCount;
    private String passWord;
    private String poSiTion;

    public Account(){};

    public Account(String id, String name, String acCount, String passWord, String poSiTion) {
        this.Id = id;
        this.name = name;
        this.acCount = acCount;
        this.passWord = passWord;
        this.poSiTion = poSiTion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAcCount() {
        return acCount;
    }

    public void setAcCount(String acCount) {
        this.acCount = acCount;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPoSiTion() {
        return poSiTion;
    }

    public void setPoSiTion(String poSiTion) {
        this.poSiTion = poSiTion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Id: ");
        Id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Account: ");
        acCount = sc.nextLine();
        System.out.print("Password: ");
        passWord = sc.nextLine();
        System.out.print("Position: ");
        poSiTion = sc.nextLine();
    }

    public void Output(){
        System.out.printf("%5s \t%30s \t%12s\n",Id,name,poSiTion);
    }

}
