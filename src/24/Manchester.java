package com.company;

public class Manchester extends Locality {
    public Manchester(String name, int population, float area, String country, int yearOfFoundation, String leader) {
        super(name, population, area, country, yearOfFoundation, leader);
    }

    public Manchester(){
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

    public void City(){
        Manchester[] man = new Manchester[3];
        man[0] = new Manchester("Bishkek", 245003, 534, "Kyrgyzstan", 1568, "Kudaibergenov");
        man[1] = new Manchester("Madrid", 5435435, 3212, "Spain", 1675, "Ramos");
        man[2] = new Manchester("Manchester", 321323, 213, "England", 1654, "Kane");

        for (int i = 0; i < man.length; i++) {
            System.out.printf("%s %s, %s, Population: %s, Area: %s, Year: %s\n", man[i].getName(), man[i].getCountry(), man[i].getLeader(), man[i].getPopulation(), man[i].getArea(), man[i].getYearOfFoundation());
        }
    }
}
