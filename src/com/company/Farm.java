package com.company;

public class Farm {
    private String address;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String FIO;


    public Farm(String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String FIO) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.FIO = FIO;
    }

    public Farm(String address, Cow[] cows) {
        this.address = address;
        this.cows = cows;
    }

    public Farm() {
    }

    public void countCows(){
        int count = 0;
        for (int i = 0; i < cows.length; i++) {
            count++;
        }
        System.out.println(count);
    }

    public void countSheeps(){
        int count = 0;
        for (int i = 0; i < sheeps.length; i++) {
            count++;
        }
        System.out.println(count);
    }

    public void countHorses(){
        int count = 0;
        for (int i = 0; i < horses.length; i++) {
            count++;
        }
        System.out.println(count);
    }

    public void cowsList(){
        int count = 0;
        int counti = 0;
        for (int i = 0; i < cows.length; i++) {
            count++;
            counti = counti = i;
            System.out.printf("Имя: %s,   Пол:  %s,  Возраст: %s,  Вес: %s \n",cows[counti].getName(), cows[counti].getSex(), cows[counti].getAge(), cows[counti].getWeight());
        }
    }

    public void sheepsList(){
        int count = 0;
        int counti = 0;
        for (int i = 0; i < sheeps.length; i++) {
            count++;
            counti = counti = i;
            System.out.printf("Имя: %s,   Пол:  %s,  Возраст: %s,  Вес: %s \n",sheeps[counti].getName(), sheeps[counti].getSex(), sheeps[counti].getAge(), sheeps[counti].getWeight());
        }
    }

    public void horsesList(){
        int count = 0;
        int counti = 0;
        for (int i = 0; i < horses.length; i++) {
            count++;
            counti = counti = i;
            System.out.printf("Имя: %s,   Пол:  %s,  Возраст: %s,  Вес: %s \n",horses[counti].getName(), horses[counti].getSex(), horses[counti].getAge(), horses[counti].getWeight());
        }
    }

    public void InfoFarm(){
        System.out.println("Владелец: " + FIO);
        System.out.println("Адрес: " + address);
        System.out.print("Количество коров: ");
        countCows();
        System.out.print("Количество овец: ");
        countSheeps();
        System.out.print("Количество лошадей: ");
        countHorses();
    }
}
