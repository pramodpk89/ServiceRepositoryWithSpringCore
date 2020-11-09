package com.learning.model;

public class Car {
private String name;
private String company;
private int yearOfManufacturing;
private boolean isPetrol;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getYearOfManufacturing() {
    return yearOfManufacturing;
  }

  public void setYearOfManufacturing(int yearOfManufacturing) {
    this.yearOfManufacturing = yearOfManufacturing;
  }

  public boolean isPetrol() {
    return isPetrol;
  }

  public void setPetrol(boolean petrol) {
    isPetrol = petrol;
  }
}
