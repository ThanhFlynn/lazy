package Class;

public class Bill {
    private Menu menu;
    private float payBill;
    private String payDATE;

    public Menu getMenu() {
        return menu;
    }

    public float getPayBill() {
        return payBill;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getpayDATE() {
        return payDATE;
    }

    public void setpayDATE(String payDATE) {
        this.payDATE = payDATE;
    }

    public void setPayBill(float payBill) {
        this.payBill = payBill;
    }

    public Bill(Menu menu, String payDATE) {
        this.menu = menu;
        this.payDATE = payDATE;
    }

    public Bill(){}

    public void PayBill(){
        System.out.println("TableID: " + ", your bill is: " + menu.getBillPayment() + "$, date and time: " + this.payDATE);
    }
}
