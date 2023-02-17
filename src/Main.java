public class Main {
    public static void main(String[] args) {
        HotDrink hd1 = new HotDrink("Coffee", 8.0);
        HotDrink hd2 = new HotDrink("Tea", 6.0);
        HotDrink hd3 = new HotDrinkWithTemperature("Hot Chocolate", 10.0, 80);

        HotDrinkVendingMachine hdvm = new HotDrinkVendingMachine();
        hdvm.addDrink(hd1);
        hdvm.addDrink(hd2);
        hdvm.addDrink(hd3);

        HotDrink product = hdvm.getProduct("Hot Chocolate", 10.0, 80);

        if (product != null) {
            System.out.println("Product found: " + product.getName());
        } else {
            System.out.println("Product not found!");
        }
    }
}