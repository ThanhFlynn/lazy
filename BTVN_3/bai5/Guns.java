package bai5;

public class Guns {
    private String weaponName;
    private int ammoNumber;

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    private void Load(int x)
    {
        ammoNumber += x;
    }

    public void Shoot(int x)
    {
        if (ammoNumber-x>=0)
        {
            ammoNumber-=x;
        }
        else if (ammoNumber == 0)
        {
            System.out.println("Het dan");
        }
        else
        {
            System.out.println("Khong the ban vi so luong dan ban ra qua so luong dan cua sung");

        }
    }

    public boolean isEmpty()
    {
        return ammoNumber <=0;
    }

    public void ShowInfo(){
        System.out.println("Ten sung: " + weaponName);
        System.out.println("So luong dan: " + ammoNumber);
    }
}
