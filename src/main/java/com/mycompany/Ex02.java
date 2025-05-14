package com.mycompany;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: (0 para parar)");

        int num1 = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + "x" + i + "=" + (i * num1));
        }

    }
}