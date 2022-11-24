package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new HotDrink("Cappuchino", 1.5, 500, 20),
                new HotDrink("Latte", 3.5, 150, 35),
                new HotDrink("Coffee", 0.5, 200, 25),
                new HotDrink("Espresso", 1.0, 50, 40)));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(products);
        // String key = "Pear";
        System.out.println(vendingMachine.getProduct("Latte", 150, 35));
    }

}
