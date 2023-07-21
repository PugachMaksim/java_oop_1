package org.example;

public abstract class HotDrink {
    /**
     * Наименование напитка*/
    private String name;
    /**
     * Объем напитка*/
    private Double volume;

    public HotDrink(String name, Double volume){
        setName(name);
        setVolue(volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolue(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "Напиток='" + name + '\'' +
                ", объем=" + volume +
                '}';
    }
}
