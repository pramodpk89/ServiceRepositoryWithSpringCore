package com.learning.repository;

import com.learning.model.Car;
import java.util.List;

public interface CarRepository {

  List<Car> findAllCars();
}
