public abstract class Drink {
    protected String name;
    protected int price;
    protected int volume;

    public Drink(String name, int price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public abstract String getName();
    public abstract int getPrice();
    public abstract int getVolume();

}