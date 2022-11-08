package de.neuefische.hellospring.repository;

import de.neuefische.hellospring.model.Car;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarRepository {
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
    }

    public boolean addCar(Car car){
        return cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }
}
