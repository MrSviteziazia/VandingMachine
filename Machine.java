public interface Machine {
    HotDrink getProduct(String name, int volume);
    HotDrinkWithTemp getProduct(String name, int volume, int temperature);
}
