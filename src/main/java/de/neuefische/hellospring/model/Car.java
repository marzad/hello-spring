package de.neuefische.hellospring.model;

public class Car {

    private String brand;
    private int wheels;
    private boolean tuv;

    public Car() {
    }

    public Car(String brand, int wheels, boolean tuv) {
        this.brand = brand;
        this.wheels = wheels;
        this.tuv = tuv;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isTuv() {
        return tuv;
    }

    public void setTuv(boolean tuv) {
        this.tuv = tuv;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", tuv=" + tuv +
                '}';
    }
}
