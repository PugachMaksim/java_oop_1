package org.example;

import java.util.List;

public class Machine implements HotDrinksVendingMachine{
    private final List<HotDrinkTemp> products;

    public Machine(List<HotDrinkTemp> products) {
        this.products = products;
    }
    public HotDrinkTemp getHotDrinkTemp(String name) throws IllegalStateException {
        for(HotDrinkTemp Drink: products){
            if(Drink.getName().equalsIgnoreCase(name)){
                return Drink;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден", name));
    }



    @Override
    public boolean addHotDrinkTemp(List<HotDrinkTemp> list) {
        if(products == null && list == null){
            return false;
        }
        else {
            products.addAll(list);
            return true;
        }
    }
}
