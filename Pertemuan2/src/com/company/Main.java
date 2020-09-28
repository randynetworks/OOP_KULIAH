package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fugsi : f(x) = x^2 + 2x + 1");

        for (int i = 1; i <= 10; i++) {
            getCalculate(i);
        }
    }

    static void getCalculate(Integer x) {
        int perhitungan = (x * x) + (2 * x) + 1;
        System.out.println("f("+x+") = " + x + "^2 " + "+ 2(" + x + ") + 1 = " + perhitungan);
    }
}


