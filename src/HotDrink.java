public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Drink {name: " + this.name + ", volume: "
                + this.volume + ", temperature: " + this.temperature
                + ", price: " + this.price + "}";
    }
}