package com.company.taskB;

public class Main {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan") {
            @Override
            public void passTheTest() {
                System.out.println(getName() + " сдал тест");
            }
        };

        Tested sergei = () -> System.out.println("Тестируется Серегей");
        sergei.passTheTest();
        ivan.passTheTest();
    }
}
