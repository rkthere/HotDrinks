public class HotDrinkVendingMachine extends VendingMachine {
    @Override
    public HotDrink getProduct(String name, double volume, double temperature) {
        for (HotDrink d : drinks) {
            if (d instanceof HotDrinkWithTemperature) {
                HotDrinkWithTemperature ht = (HotDrinkWithTemperature) d;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return ht;
                }
            }
        }
        return null;
    }
}