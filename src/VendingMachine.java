import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<HotDrink> drinks;

    public VendingMachine() {
        drinks = new ArrayList<>();
    }

    public HotDrink getProduct(String name, double volume, double temperature) {
        for (HotDrink d : drinks) {
            if (d.getName().equals(name) && d.getVolume() == volume) {
                return d;
            }
        }
        return null;
    }

    public void addDrink(HotDrink d) {
        drinks.add(d);
    }
}

