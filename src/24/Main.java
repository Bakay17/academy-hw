package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Manchester[] man = new Manchester[3];
		man[0] = new Manchester("Bishkek", 245003, 534, "Kyrgyzstan", 1568, "Kudaibergenov");
		man[1] = new Manchester("Madrid", 5435435, 3212, "Spain", 1675, "Ramos");
		man[2] = new Manchester("Manchester", 321323, 213, "England", 1654, "Kane");

		System.out.println("----- CITY -----");
		for (int i = 0; i < man.length; i++) {
			System.out.printf("%s %s, %s, Population: %s, Area: %s, Year: %s\n", man[i].getName(), man[i].getCountry(), man[i].getLeader(), man[i].getPopulation(), man[i].getArea(), man[i].getYearOfFoundation());
		}

	    Search search = new Search();
	    search.searchCity(man);

	    Toctogul[] toc = new Toctogul[2];
	    toc[0] = new Toctogul("Toctogul", 32400, 32, "Kyrgyzstan", 1900, "Manasov");
	    toc[1] = new Toctogul("Torken", 31233, 30, "Kyrgyzstan", 1920, "Zaidov");

		System.out.println("----- VILLAGE -----");
		for (int i = 0; i < toc.length; i++) {
			System.out.printf("%s %s, %s, Population: %s, Area: %s, Year: %s\n", toc[i].getName(), toc[i].getCountry(), toc[i].getLeader(), toc[i].getPopulation(), toc[i].getArea(), toc[i].getYearOfFoundation());
		}

		search.searchVillage(toc);
    }
}
