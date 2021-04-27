package com.company;

import java.awt.event.KeyAdapter;

public class Main {

    public static void main(String[] args) {
        NarutoCharacters naruto = new NarutoCharacters();

	    NarutoCharacters[] characters = new NarutoCharacters[2];
		characters[0] = new NarutoCharacters();
	    characters[0].name = "Naruto Uzumaki";
	    characters[0].age = 17;
	    characters[0].clane = "Uzumaki";
	    characters[0].team = "Team 7";
	    characters[0].family = "Minato Namikaze, Kushyna Uzumaki";
	    characters[0].friend = "Sasuke Uchiha";
	    characters[0].homeland = "Kanoha";
	    characters[0].organization = "No organization";
	    characters[0].slogan = "Мало сказать глупость, надо что б в нее поверили.\n";

	    characters[1] = new NarutoCharacters();
		characters[1].name = "Sasuke Uchiha";
		characters[1].age = 17;
		characters[1].clane = "Uchiha";
		characters[1].team = "Team 7";
		characters[1].family = "Itachi Uchiha";
		characters[1].friend = "Naruto Uzumaki";
		characters[1].homeland = "Kanoha";
		characters[1].organization = "Taka, Akatsuki";
		characters[1].slogan = "Мне много чего не нравится, и мало что нравится.\n";

		for (int i = 0; i < characters.length; i++) {
			System.out.printf("Name: %s\nAge: %s\nClane: %s\nTeam: %s\nFamily: %s\n" +
					"Friend: %s\nHomeland: %s\nOrganization: %s\nЦитата: %s\n", characters[i].name, characters[i].age, characters[i].clane,
					characters[i].team, characters[i].family, characters[i].friend, characters[i].homeland, characters[i].organization, characters[i].slogan);
		}

        AkatsukiMembers akatsukiMembers = new AkatsukiMembers();
        akatsukiMembers.getMembersAkatsuki();

    }
}
