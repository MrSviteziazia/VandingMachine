import java.util.ArrayList;
import java.util.List;

public class Main implements Machine {
    private List<HotDrink> drinks = new ArrayList<>();

    public void addProduct(HotDrink drink) {
        drinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }

    @Override
    public HotDrinkWithTemp getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink instanceof HotDrinkWithTemp) {
                HotDrinkWithTemp hotDrink = (HotDrinkWithTemp) drink;
                if (hotDrink.getName().equalsIgnoreCase(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
