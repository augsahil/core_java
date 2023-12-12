package org.sahil.laptop.components;

public class GraphicsCard {
    private int series;
    private String brand;
    private String memory;

    public GraphicsCard() {
        this.series = 3100;
        this.brand = "NVidia";
        this.memory = "6 GB";
    }

    public GraphicsCard(int series, String brand, String memory) {
        this.series = series;
        this.brand = brand;
        this.memory = memory;
    }

    public int getSeries() {
        return series;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "series=" + series +
                ", brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
