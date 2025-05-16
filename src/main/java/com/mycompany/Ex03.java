package com.mycompany;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double alturafinal = altura * altura;
        double imc = peso / alturafinal;

        System.out.println(peso);


        if (imc < 16.0) {
            System.out.println("Magreza grau III");
        } else if (imc >= 16.0 && imc <= 16.9) {
            System.out.println("Magreza grau II");
        } else if (imc >= 17.0 && imc <= 18.4) {
            System.out.println("Magreza grau I");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Eutrofia");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Pré-obesidade");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade moderada (grau I)");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade severa(grau II)");
        } else {
            System.out.println("obesidade severa (grau III)");
        }
    }
}