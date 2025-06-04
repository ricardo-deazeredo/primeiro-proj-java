package com.mycompany;

public class Aula08funçoes {

    public static void main(String[] args) {
        int numero = 5;

        System.out.println("--- Tabuada do " + numero + " ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
        }
        System.out.println(fatorial(numero));
    }

    /**
     * Não podemos declarar uma função dentro da outra.
     * 
     * Toda função deve ter um retorno, quando não há retorno utilizamos void.
     * 
     * Uma função pode não ter parâmetros, ou ter um ou mais.
     */

    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }

    /**
     * Funções recursivas
     * 
     * Uma função recursiva faz uma chamada para ela própria porém, toda
     * recusrividade deve ter um ponto de parada,
     * caso contrário pode resultar em um loop infinito.
     */

    public static int fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n - 1);
        } else {
            return 1;
        }
    }

}