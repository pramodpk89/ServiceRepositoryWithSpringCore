package com.learning.repository;

import com.learning.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
  List<Car> carList=new ArrayList<Car>();
  public List<Car> findAllCars(){
    Car punto=new Car();
    punto.setCompany("Fiat");
    punto.setName("Punto");
    punto.setYearOfManufacturing(2015);
    punto.setPetrol(true);

    carList.add(punto);

    return carList;
  }

}
