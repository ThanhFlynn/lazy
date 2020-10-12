package bai2;

public class RunMain {
    public static void main(String[] args) {
        Dog Shiba = new Dog();
        Shiba.InputName("Cậu vàng");
        for(int i=0; i<3; ++i){
            Shiba.Bark();
            Shiba.ShowMP();
        }
    }
}
