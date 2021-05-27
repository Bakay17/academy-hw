package com.company;

public abstract class Locality {
    private String name;
    private int population;
    private float area;
    private String country;
    private int yearOfFoundation;
    private String leader;

    public Locality(String name, int population, float area, String country, int yearOfFoundation, String leader) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.leader = leader;
    }

    public Locality(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
