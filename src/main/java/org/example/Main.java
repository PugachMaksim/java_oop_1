package org.example;
//        Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinkTemp napitok1 = new HotDrinkTemp("coffee", 0.5, 70.2);
        HotDrinkTemp napitok2 = new HotDrinkTemp("tea", 0.3, 80.0);
        HotDrinkTemp napitok3 = new HotDrinkTemp("coffee", 0.4, 65.4);
        List<HotDrinkTemp> HotDrinksList  = new ArrayList<>(Arrays.asList(napitok1, napitok2, napitok3));

        Machine nalivayka = new Machine(HotDrinksList);



        System.out.println(nalivayka.getHotDrinkTemp("coffee"));


    }
}