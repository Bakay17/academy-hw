package com.company;

public class City {
    private String name;
    private String country;
    private Integer codeCity;

    public City(String name, String country, Integer codeCity) {
        this.name = name;
        this.country = country;
        this.codeCity = codeCity;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCodeCity() {
        return codeCity;
    }

    public void setCodCity(Integer codeCity) {
        this.codeCity = codeCity;
    }
}
