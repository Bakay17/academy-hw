package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<City> city = new ArrayList<>();
	    city.add(new City("London", "England", 12));
	    city.add(new City("Monaco", "France", 41));
	    city.add(new City("Bishkek", "Kyrgyzstan", 7));
	    city.add(new City("Berlin", "Germany", 154));
	    city.add(new City("Istanbul", "Turkey", 172));
	    city.add(new City("Ottawa", "Canada", 212));
	    city.add(new City("Moscow", "Russia", 132));
	    city.add(new City("Madrid", "Spain", 111));
	    city.add(new City("Tokyo", "Japan", 94));
	    city.add(new City("Rio", "Brasilia", 76));

	    Set<City> hashSet = new HashSet<>();
	    Set<City> treeSet = new TreeSet<>();

	    // четное и нечетное
	    setSet(hashSet, treeSet, city);
	    // удаление
		removeTreeSet(treeSet);
		// убывание
		printWaning(city);
		//возрастание
		printIncrease(city);
    }

    public static void setSet(Set<City> hashSet, Set<City> treeSet, List<City> cityList) {
		if (cityList.stream().allMatch(city -> city.getCodeCity() % 2 == 0)) hashSet.add((City) treeSet);
		else treeSet.add((City) hashSet);
	}

	public static void removeTreeSet(Set<City> treeSet) {
		if (treeSet.stream().allMatch(city -> city.getName().length() > 5))
			treeSet.remove(treeSet);
	}

	public static void printWaning(List<City> cityList) {
    	TreeSet<City> treeSet = new TreeSet<>(cityList);
    	Iterator<City> iterator = treeSet.descendingIterator();
		System.out.println("По убыванию:");
    	while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void printIncrease(List<City> cityList) {
    	TreeSet<City> treeSet = new TreeSet<>(cityList);
		System.out.println("По возрастанию:");
		for (City city : treeSet) {
			System.out.println(city);
		}
	}
}
