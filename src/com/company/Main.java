package com.company;

public class Main {

    public static void main(String[] args) {
        Cow[] cow = new Cow[5];
        cow[0] = new Cow("Муму", "Девочка", 2, 30);
        cow[1] = new Cow("Элькаира", "Девочка", 3, 29);
        cow[2] = new Cow("Батма", "Девочка", 3, 32);
        cow[3] = new Cow("Айэлита", "Девочка", 1, 33);
        cow[4] = new Cow("Айдана", "Девочка", 2, 26);

        Sheep[] sheep = new Sheep[3];
        sheep[0] = new Sheep("Баращ", "Мальчик", 3, 30);
        sheep[1] = new Sheep("Баращ2", "Мальчик", 2, 20);
        sheep[2] = new Sheep("Баращ3", "Мальчик", 1, 22);

        Horse[] horses = new Horse[2];
        horses[0] = new Horse("Спирит", "Мальчик", 10, 100, "Черный");
        horses[1] = new Horse("Аккула", "Мальчик", 15, 160, "Белый");

        Farm farm1 = new Farm("Нарын", cow, sheep, horses, "Эмир Чокоев");

        System.out.println("Ферма № 1");
        farm1.InfoFarm();
        System.out.println("--------------------\nИнфо про животных: ");
        System.out.println("КОРОВЫ:");
        farm1.cowsList();
        System.out.println("ОВЦЫ:");
        farm1.sheepsList();
        System.out.println("ЛОШАДИ:");
        farm1.horsesList();


        Cow[] cow1 = new Cow[1];
        cow1[0] = new Cow("Ала бука", "Мальчик", 4, 50);

        Sheep[] sheep1 = new Sheep[1];
        sheep1[0] = new Sheep("Роналду", "Мальчик", 5, 35);

        Horse[] horses1 = new Horse[1];
        horses1[0] = new Horse("Моисей", "Мальчик", 7, 99, "Белый");

        Farm farm2 = new Farm("Бишкек", cow1, sheep1, horses1, "Учиха Мадара");

        System.out.println("________________________________\nФерма № 2");
        farm2.InfoFarm();
        System.out.println("--------------------\nИнфо про животных: ");
        System.out.println("КОРОВЫ:");
        farm2.cowsList();
        System.out.println("ОВЦЫ:");
        farm2.sheepsList();
        System.out.println("ЛОШАДИ:");
        farm2.horsesList();
    }
}
