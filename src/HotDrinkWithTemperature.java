public class HotDrinkWithTemperature extends HotDrink {
    int temperature;

    public HotDrinkWithTemperature(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}