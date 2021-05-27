package com.company;

public class Toctogul extends Locality {
    public Toctogul(String name, int population, float area, String country, int yearOfFoundation, String leader) {
        super(name, population, area, country, yearOfFoundation, leader);
    }

    public Toctogul(){
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getPopulation() {
        return super.getPopulation();
    }

    @Override
    public void setPopulation(int population) {
        super.setPopulation(population);
    }

    @Override
    public float getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(float area) {
        super.setArea(area);
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public void setCountry(String country) {
        super.setCountry(country);
    }

    @Override
    public int getYearOfFoundation() {
        return super.getYearOfFoundation();
    }

    @Override
    public void setYearOfFoundation(int yearOfFoundation) {
        super.setYearOfFoundation(yearOfFoundation);
    }

    @Override
    public String getLeader() {
        return super.getLeader();
    }

    @Override
    public void setLeader(String leader) {
        super.setLeader(leader);
    }
}
