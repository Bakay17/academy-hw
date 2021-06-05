package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    Firefighter[] firefighters = new Firefighter[2];
        ArrayList<Firefighter> firefighterArrayList = new ArrayList<Firefighter>();
        firefighters[0] = new Firefighter("Александр", 32, 30000, 4);
	    firefighters[1] = new Firefighter("Эльдияр", 35, 30000, 5);

        firefighterArrayList.add(firefighters[0]);
        firefighterArrayList.add(firefighters[1]);

        for (Firefighter f : firefighterArrayList) {
            System.out.println(f);
        }
    }
}
