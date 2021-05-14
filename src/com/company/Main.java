package com.company;

public class Main {

    public static void main(String[] args) {
        Credit[] credits = new Credit[5];
        credits[0] = new Credit(232142, 50000, "1 год", 15, credits);
        credits[1] = new Credit(321234, 30000, "9 месяцев", 11, credits);
        credits[2] = new Credit(123432, 20000, "11 месяцев", 10, credits);
        credits[3] = new Credit(543212, 100000, "3 года", 9, credits);
        credits[4] = new Credit(421232, 32000, "7 месяцев", 12, credits);
        System.out.println(credits[0].toString());
        System.out.println(credits[1].toString());
        System.out.println(credits[2].toString());
        System.out.println(credits[3].toString());
        System.out.println(credits[4].toString());

        System.out.println("_______________________________");
        System.out.println("Количество кредитов: " + credits[0].countCredits());
        System.out.println("Сумма выданных кредитов: " + credits[0].sumCredits());
        System.out.println("Средняя сумма выданных кредитов: " + credits[0].avrSumCredits());


    }
}
