package com.mycompany;

public class Aula03Operadores {

    public static void main(String[] args) {
        
        /**
         * Tipos de comentário
         */

         // Comentário de uma linha

        /**
         * Comentário de
        * multiplas
        * linhas
        */

        /**
         * Declaração de variáveis
         */

        String var1; // Toda variável declarada sem valor, automaticamente é null,
        String var2 = null; // Variável declarada com valor null
        String var3 = ""; // Variável declarada com valor vazio (diferente de null)

        /**
         * Operadores matemáticos
         */

         int num1 = 10;
         int num2 = 2;

         // Soma 
         int soma = num1 + num2;
         System.out.println("A soma entre " + num1 + " e " + num2 + " é " + soma);

         // Subtração
         int Subtração = num1 - num2;
         System.out.println("A subtração de " + num1 + " por " + num2 + " é : " + Subtração);

         // Multiplicação
         int Multiplicação = num1 * num2;
         System.out.println("A multiplicação de " + num1 + " por " + num2 + " é : " + Multiplicação);

         // Divisão
         int Divisão = num1 / num2;
         System.out.println("A Divisão de " + num1 + " por " + num2 + " é : " + Divisão);

    }
}