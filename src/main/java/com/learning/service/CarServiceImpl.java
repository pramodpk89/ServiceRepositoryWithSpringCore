package com.learning.service;

import com.learning.model.Car;
import com.learning.repository.CarRepository;
import com.learning.repository.CarRepositoryImpl;
import java.util.List;

public class CarServiceImpl implements CarService {
private CarRepository carRepository;
  public CarServiceImpl(CarRepository carRepository){
    this.carRepository=carRepository;
  }
  public List<Car> getCars() {
    return carRepository.findAllCars();
  }
}
