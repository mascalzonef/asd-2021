package it.unical.inf.asd.model;

public class Country {
  private String name;
  private long population;

  public Country(String name,
      long population) {
    this.name = name;
    this.population = population;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

}