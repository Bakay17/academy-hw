package com.company;

import java.util.Scanner;

public class Search {
    private Manchester[] manchesters;
    private Toctogul[] toctoguls;

    public void searchCity(Manchester[] manchester) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of leader(Kudaibergenov, Ramos, Kane): ");
        String a = sc.nextLine();
        for (int i = 0; i < manchester.length; i++) {
            if (a.equals(manchester[i].getLeader())) System.out.println(a + " leader of " + manchester[i].getName() + " city.");
        }
    }

    public void searchVillage(Toctogul[] toctoguls) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of leader(Manasov, Zaidov): ");
        String a = sc.nextLine();
        for (int i = 0; i < toctoguls.length; i++) {
            if (a.equals(toctoguls[i].getLeader())) System.out.println(a + " leader of " + toctoguls[i].getName() + " village.");
        }
    }
}
