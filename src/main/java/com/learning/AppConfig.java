package com.learning;

import com.learning.repository.CarRepository;
import com.learning.repository.CarRepositoryImpl;
import com.learning.service.CarService;
import com.learning.service.CarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(name = "carRepository")
  public CarRepository getCarRepo() {
    return new CarRepositoryImpl();
  }

  @Bean(name = "carService")
  public CarService getCarService(){
  CarService carService=new CarServiceImpl(getCarRepo());
  return carService;
  }
}
