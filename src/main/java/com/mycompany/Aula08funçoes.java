package com.mycompany;

public class Aula08funçoes {

    public static void main(String[] args) {
        int numero = 5;

        System.out.println("--- Tabuada do " + numero + " ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
        }
    }

    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }
}