package com.company;

public class Main {

    public static void main(String[] args) {
        factorialLambda(3);
        rootInPowerLambda(3,8);
    }

    public static void factorialLambda(int num) {
        Factorial factorial = n -> {
            int factorialNum = 1;
            for (int i = 1; i <= n; i++) {
                factorialNum *= i;
            }
            return factorialNum;
        };
        System.out.println(num + " = " + factorial.getFactorial(num));
    }

    public static void rootInPowerLambda(double num, double num2) {
        RootInPower rootInPower = (a, b) -> Math.pow(b, 1 / a);
        System.out.println(rootInPower.getRootInPower(num, num2));
    }
}
