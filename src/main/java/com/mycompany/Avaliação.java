package com.mycompany;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Avaliação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int moda = 0;
        Map<Integer, Integer> frequencias = new HashMap<>();

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            valores[i] = scanner.nextInt();
            soma += valores[i];

            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }

            frequencias.put(valores[i], frequencias.getOrDefault(valores[i], 0) + 1);
        }

        double media = soma / 10.0;

        /* for (int i = 0; i < valores.length; i++) {
            int numero = valores[i];
            int count = 0;

            for (int j = 0; j < valores.length; j++) {
                int outro = valores[j];

                if (numero == outro) {
                    count++;
                }
            }

            if (count > 0) {
                moda = numero;
            }
        }
 */
        int valorMaisFrequente = valores[0];
        int maxFrequencia = 0;
        for (Map.Entry<Integer, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maxFrequencia = entry.getValue();
                valorMaisFrequente = entry.getKey();
            }
        }

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valor que mais se repete: " + valorMaisFrequente);

        scanner.close();
    }
}
