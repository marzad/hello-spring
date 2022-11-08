package de.neuefische.hellospring.repository;

import de.neuefische.hellospring.classes.Car;

import java.util.List;

public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
    }

    public boolean addCar(Car car){
        return cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }
}
