package de.neuefische.hellospring.controller;

import de.neuefische.hellospring.model.Car;
import de.neuefische.hellospring.repository.CarRepository;
import de.neuefische.hellospring.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cars")
public class CarController {

    private CarService cars;

    public CarController(CarService cars){
        this.cars = cars;
    }

    @GetMapping("cars")
    public List<Car> getCars(){
        return cars.getCars();
    }

    @PostMapping
    public void addCar(@RequestBody Car car){
        Optional<CarService> carsList = Optional.of(cars);
        if(!carsList.isPresent()){
            cars = new CarService();
        }
        cars.addCar(car);
    }

}
