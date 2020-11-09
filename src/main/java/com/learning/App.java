package com.learning;

import com.learning.service.CarService;
import com.learning.service.CarServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
    CarService carService=appContext.getBean("carService",CarService.class);
    System.out.println(carService.getCars().get(0).getName());
  }
}
