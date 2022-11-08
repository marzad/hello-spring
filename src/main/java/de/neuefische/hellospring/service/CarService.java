package de.neuefische.hellospring.service;

import de.neuefische.hellospring.classes.Car;
import de.neuefische.hellospring.repository.CarRepository;

import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService() {
        carRepository = new CarRepository();
    }

    public boolean addCar(Car car){
        return carRepository.addCar(car);
    }

    public List<Car> getCars(){
        return carRepository.getCars();
    }


}
