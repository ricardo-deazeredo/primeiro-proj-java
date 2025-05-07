package com.mycompany;

import java.util.Scanner;

public class aula05repetiçoes {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For  (para)
         * 
         * Para cada elemento repita 
         * 
         * 1º variável de interação
         * 2º condição de parada
         * 3º incremento ou decremento
         */
        // Incremento
        for(int i = 0; i <= 5; i = i + 1){
            System.out.println(i);
        }
        // Decremento
        System.out.println("Contagem regressiva...");
        for (int i = 10;i >= 0; i-- ){
            Thread.sleep(1000L);
            System.out.println(i + "...");

        }
        System.out.println("BOOM !!!");

        /**
         * Classe scanner
         * 
         * É ultilizada para ler valores do usuário inserido pelo promt
         */

         Scanner scan = new Scanner(System.in); // cria o scanner
         System.out.println("Digite um número: ");

         int numero = scan.nextInt(); // Lê o valor digitado e capturado pelo scanner
         System.out.println("Você digitou " + numero + " !!");
    }
    
}
