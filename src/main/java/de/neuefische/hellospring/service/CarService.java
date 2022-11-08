package de.neuefische.hellospring.service;

import de.neuefische.hellospring.model.Car;
import de.neuefische.hellospring.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
