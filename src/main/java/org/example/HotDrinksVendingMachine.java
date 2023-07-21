package org.example;

import java.util.List;

public interface HotDrinksVendingMachine {
    HotDrink getHotDrinkTemp(String name) throws IllegalStateException;

    boolean addHotDrinkTemp(List<HotDrinkTemp> list);

}
