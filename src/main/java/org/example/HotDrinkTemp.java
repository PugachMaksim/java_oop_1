package org.example;

public class HotDrinkTemp extends HotDrink{
    /**
     * Температура напитка*/
    private Double temp;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public HotDrinkTemp(String name, Double volume, Double temp) {
        super(name, volume);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrinkTemp{" +
                "name: '" + super.getName() + '\'' +
                "объем = '" + super.getVolume() + '\'' +
                "температура =" + temp +
                '}';
    }
}
