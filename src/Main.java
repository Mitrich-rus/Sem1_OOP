import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 50, 150, 90);
        HotDrink latte = new HotDrink("Latte", 70, 150, 90);
        HotDrink cappuccino = new HotDrink("Cappuccino", 60, 150, 80);
        HotDrink espresso = new HotDrink("Espresso", 55, 100, 85);

        ArrayList<HotDrink> drinks = new ArrayList<>(List.of(coffee, latte, cappuccino, espresso));

        HotDrinkAutomat automat = new HotDrinkAutomat();
        automat.addDrink(drinks);
        System.out.println(automat.getProduct("Latte"));
        System.out.println(automat.getProduct("Espresso",  100, 85));
    }

}