package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook("Нурс", 21, "Медерова", "Муж", "Шеф повар",
                40000, 5000, 2500, "Профи", 20, "Разного типа", "Повар", "Имееться");
        System.out.println(cook.toString());
        cook.goOutToWork();
        cook.goOutToVacation();
        cook.beLateToWork();
        cook.goToFood();
        cook.inventDish();
        cook.cookingDish();

        Client[] clients = new Client[6];
        clients[0] = new Client("Pink", 43, "Бишкек", "Жен", "Частный", 2300, true);
        clients[1] = new Client("Blonde", 32, "Нарын", "Муж", "Постоянный", 3200, true);
        clients[2] = new Client("Orange", 17, "Неизвестно", "Жен", "Спонтанный", 0, false);
        clients[3] = new Client("White", 23, "Баткен", "Муж", "Редкий", 1020, true);
        clients[4] = new Client("Blue", 27, "Каракол", "Жен", "Регулярный", 4330, true);
        clients[5] = new Client("Brown", 20, "Бишкек", "Муж", "Частный", 3000, true);

        System.out.println(clients[2].toString());
        clients[2].toOrder();
        clients[2].toPaid();
        clients[2].callTheOfic();


        Ofic[] ofic = new Ofic[3];
        ofic[0] = new Ofic("Сыймык", 19, "Ахунбаева", "Муж", "Студент",
                20000, 2000, 1200, "Старший официант", 10, clients[0]);

        System.out.println("-------------------------\nОфициант 1" + ofic[0].toString());
        ofic[0].acceptOrder();
        ofic[0].relateOrder();
        ofic[0].printCount();

        ofic[1] = new Ofic("Майкл", 18, "Асанбай", "Муж", "Студент",
                20000, 2000, 1700, "официант", 5, clients[2]);

        System.out.println("-------------------------\nОфициант 2" + ofic[1].toString());
        ofic[1].acceptOrder();
        ofic[1].relateOrder();
        ofic[1].printCount();

        ofic[2] = new Ofic("Айдай", 18, "7 Микрорайон", "Жен", "Студент",
                15000, 2000, 1000, "Стажер", 0, clients[4]);

        System.out.println("-------------------------\nОфициант 3" + ofic[2].toString());
        ofic[2].acceptOrder();
        ofic[2].relateOrder();
        ofic[2].printCount();

        Security security = new Security("Нурбек", 31, "Боконбаева", "Муж", "----", 25000,
                2000, 4000, "Профи", 10, "Вооружен", "Электрошокер", clients);
        System.out.println(security.toString());
        security.faceControl();
        security.peopleOut();


    }
}
