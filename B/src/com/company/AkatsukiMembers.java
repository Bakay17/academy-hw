package com.company;

import javax.swing.text.html.HTML;

public class AkatsukiMembers extends NarutoCharacters{
    String partner;
    String colorRing;
    String village;

    public void getMembersAkatsuki(){
        System.out.println("------ AKATSUKI ------\n");

        AkatsukiMembers[] akatsuki = new AkatsukiMembers[3];
        akatsuki[0] = new AkatsukiMembers();
        akatsuki[0].name = "Pain";
        akatsuki[0].age = 28;
        akatsuki[0].clane = "---";
        akatsuki[0].team = "Team Jiraya";
        akatsuki[0].family = "---";
        akatsuki[0].friend = "Konan, Nagato";
        akatsuki[0].partner = "Konan";
        akatsuki[0].colorRing = "Yellow";
        akatsuki[0].village = "Village Rain";
        akatsuki[0].organization = "Akatsuki";
        akatsuki[0].slogan = "Нельзя понять всю красоту леса, оценивая лишь одно дерево.\n";


        akatsuki[1] = new AkatsukiMembers();
        akatsuki[1].name = "Itachi Uchiha";
        akatsuki[1].age = 21;
        akatsuki[1].clane = "Uchiha";
        akatsuki[1].team = "---";
        akatsuki[1].family = "Sasuke Uchiha";
        akatsuki[1].friend = "Shisui Uchiha, Kissame";
        akatsuki[1].partner = "Kissame";
        akatsuki[1].colorRing = "Red";
        akatsuki[1].village = "Village Kanoha";
        akatsuki[1].organization = "Akatsuki, Anbu";
        akatsuki[1].slogan = "Люди живут руководствуясь тем, что в этой жизни верно, а что нет, и называют это реальностью," +
                " но каждый сам решает, что для него правильно. И реальность одного человека вполне может оказаться иллюзией для другого. " +
                "Все люди живут в своем внутреннем мире, хочешь верь, хочешь нет... \n";


        akatsuki[2] = new AkatsukiMembers();
        akatsuki[2].name = "Obito Uchiha";
        akatsuki[2].age = 30;
        akatsuki[2].clane = "Uchiha";
        akatsuki[2].team = "Team Minato";
        akatsuki[2].family = "---";
        akatsuki[2].friend = "Kakashi Hatake, Rin Naharo";
        akatsuki[2].partner = "Deidara";
        akatsuki[2].colorRing = "Black";
        akatsuki[2].village = "Village Kanoha";
        akatsuki[2].organization = "Akatsuki";
        akatsuki[2].slogan = "Если бросить друга в беде означает поумнеть, то я лучше навсегдп останусь глупцом!";

        for (int i = 0; i < akatsuki.length; i++) {
            System.out.printf("Name: %s\nAge: %s\nClane: %s\nTeam: %s\nFamily: %s\n" +
                            "Friend: %s\nPartner: %s\nColor ring: %s\nVillage: %s\nOrganization: %s\nЦитата: %s\n", akatsuki[i].name,
                    akatsuki[i].age, akatsuki[i].clane, akatsuki[i].team, akatsuki[i].family,
                    akatsuki[i].friend, akatsuki[i].partner,
                    akatsuki[i].colorRing, akatsuki[i].village, akatsuki[i].organization, akatsuki[i].slogan);
        }
    }
}
