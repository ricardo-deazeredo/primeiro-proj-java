package com.mycompany;

import java.util.Arrays;

public class Aula07Estruturas {
    public static void main(String[] args) {
        /**
         * Esruturas complexas de dados
         */

        /**
         * Array (listas)
         * 
         * representados por um []
         * 
         * seu tamanho é fixo, onde o primeiro elemento ocupa a posição 0 e o último
         * sendo n - 1, onde n é o número total de elementos
         * todo array tem um tipo associado
         */
        System.out.println("--------Array--------");

        int numeros[] = new int[5]; // declara uma lista vazia de 5 posições [0, 1, 2, 3, 4]
        System.out.println(numeros[0]); // retorna o valor no indíce 0

        numeros[0] = 5; // Atribui um valor para a posição 1

        System.out.println(numeros); // Retorna os valores em bytes
        System.out.println(Arrays.toString(numeros)); // Retorna as representações dos valores

        int numeros2[] = { 2, 3, 5, 7 }; // Declaração com valores de um array
        System.out.println(numeros2[2]);

        /**
         * Matrizes
         * 
         * são representadas por dois []
         * 
         * seu tamanho assim como o array é fixo, em número de linhas e colunas
         */

        System.out.println("--------Matriz--------");

        int matriz[][] = new int[3][4]; // deve-se declarar uma matriz 3X4

        matriz[0][1] = 2; // Atribui um valor na linha 0 e coluna 1

        int matriz2[][] = { // declara uma matriz 2X3
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        System.out.println(Arrays.deepToString(matriz2)); // Retorna a representação dos valores
    }
}
