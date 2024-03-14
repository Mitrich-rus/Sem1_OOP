import java.util.ArrayList;

public class HotDrinkAutomat implements TradingAutomation {
    ArrayList<HotDrink> drinks = new ArrayList<>();

    @Override
    public void addDrink(ArrayList<HotDrink> addDrinks) {
        drinks = addDrinks;
    }

    @Override
    public Drink getProduct(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equals(name)) return drink;
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) return drink;
        }
        return null;
    }
}