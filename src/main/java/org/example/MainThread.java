package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainThread implements Runnable{
    private Integer number;

    @Override
    public void run() {
        if (number == 1) System.out.println("Умножение: " + multiplication());
        else if (number == 2) System.out.println("Деление: " + division());
        else if (number == 3) System.out.println("Сложение: " + addition());
        else if (number == 4) System.out.println("Вычитание: " + minus());
    }
    private Integer multiplication() {
        return Main.num = Main.num * 2;
    }

    private Integer division() {
        return Main.num = Main.num / 2;
    }

    private Integer addition() {
        return Main.num = Main.num + 2;
    }

    private Integer minus() {
        return Main.num = Main.num - 2;
    }
}
