package com.mycompany;

import java.util.Scanner;

public class aula05repetiçoes {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For (para)
         * 
         * Para cada elemento repita
         * 
         * 1º variável de interação
         * 2º condição de parada
         * 3º incremento ou decremento
         */
        // Incremento
        for (int i = 0; i <= 5; i = i + 1) {
            System.out.println(i);
        }
        // Decremento
        System.out.println("Contagem regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");

        }
        System.out.println("BOOM !!!");

        /**
         * Classe scanner
         * 
         * É ultilizada para ler valores do usuário inserido pelo promt
         */

        // Scanner scan = new Scanner(System.in); // cria o scanner
        // System.out.println("Digite um número: ");

        // int numero = scan.nextInt(); // Lê o valor digitado e capturado pelo scanner
        // System.out.println("Você digitou " + numero + " !!");

        /**
         * while (enquanto)
         * 
         * Enquanto a condição for verdadeira o código será executado
         * Diferente da próxima estrura, essa faz a validação antes da execução
         */

        int num1 = 1;

        while (num1 != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para parar)");

            num1 = scan.nextInt();

            System.out.println("você digitou: " + num1 + "!!");

            System.out.println("Execução encerrada");

        }

        /**
         * Do while (execute,, enquanto)
         * 
         * É executada uma estrutura de código e após é validada a condição
         */

        int num2 = 1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para sair)");
            num2 = scan.nextInt();
        } while (num2 != 0);

        System.out.println("execução errada");

    }

}
