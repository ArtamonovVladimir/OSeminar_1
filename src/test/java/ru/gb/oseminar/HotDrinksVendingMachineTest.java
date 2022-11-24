package ru.gb.oseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachineTest {
    private List<Product> products;
    private HotDrinksVendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        this.vendingMachine = new HotDrinksVendingMachine(products);
    }

    @Test
    void getProductTestSuccessful() {
        // expected
        products.add(new HotDrink("Latte", 3.5, 150, 35));
        products.add(new HotDrink("Coffee", 0.5, 200, 25));
        this.vendingMachine = new HotDrinksVendingMachine(products);
        HotDrink expected = new HotDrink("Coffee", 0.5, 200, 25);

        // actual
        HotDrink actual = vendingMachine.getProduct("Coffee", 200, 25);

        Assertions.assertEquals(expected, actual);
    }
}
