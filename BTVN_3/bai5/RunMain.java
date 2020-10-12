package bai5;

import java.util.Scanner;

public class ShootingBattle {
    private Guns Gun1 = new Guns("AK47",50);
    private Guns Gun2 = new Guns("Barret",40);

    private int ifGunRunoutOfAmmo()
    {
        if (Gun1.isEmpty())
        {
            return 1;
        }
        else if (Gun2.isEmpty())
        {
            return 2;
        }
        return 0;
    }

    public void Battle()
    {
        do {

            ShowInfo();
            System.out.println("Nhap so dan ban ra: ");
            Scanner sc = new Scanner(System.in);
            int ammo = sc.nextInt();

            Gun1.Shoot(ammo);
            Gun2.Shoot(ammo);
        }
        while (ifGunRunoutOfAmmo()!=1 && ifGunRunoutOfAmmo() != 2);
        Result();
    }

    private void Result(){
        if (ifGunRunoutOfAmmo()==1){
            System.out.println("Sung 1 het dan");
        }
        else
        {
            System.out.println("Sung 2 het dan");
        }
    }

    public void ShowInfo(){
        Gun1.ShowInfo();
        System.out.println("===========");
        Gun2.ShowInfo();
    }
}
