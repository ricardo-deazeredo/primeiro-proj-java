package com.mycompany;

import java.util.Scanner;

public class Aula06condicional {

    public static void main(String[] args) {
        /**
         * Estrutura condicional simples(if, else)
         * 
         * pode ser lida como: SE, SENÃO
         * 
         * a condição verdadeira é executada dentro do if
         */
        int num = 3;

        // % é o resto da divisão
        // comparando com 0, o número é par
        if (num % 2 == 0) {
            System.out.println(num + " é par!!");
        } else {
            System.out.println(num + " é ímpar!!");
        }

        /**
         * estrutra condicional composta( if, else if, else)
         * 
         * nesse tipo de estrutura podemos ter mais de uma verificação caso o primeiro
         * if não esteja satisfeito
         * 
         * um exemplo prático pode ser a verificação de imc
         */
        double imc = 49.0;

        if (imc < 18.5) {
            System.out.println("está abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("está com peso ideal");
        } else {
            System.out.println("está com obesidade");
        }

        /**
         * Estrutura switch/ case
         * 
         * É similar ao if/else, com a diferença que ele considera valores predefinidos
         * que serão em cada case/ caso
         * 
         * na sua estrutura ele analisa uma variável, e considera dentre suas opções
         * qual considera.
         * 
         * cada estrutura case deve conter um break, para encerrar a execução.
         * 
         * o default (padrão) é executado, caso nenhum case tenha sido executado
         * 
         * um exemplo seria uma pergunta de múltipla escolha.
         */

        // Digitando textos em mais de uma linha
        System.out.println(
                "1) verde, amarelo e azul, são cores que fazem parte da bandeira de qual país?\n" + //
                        "\na) Argentina" + // é um escape usado para quebrar linha
                        "\nb) Paraguai" +
                        "\nc) Brasil" +
                        "\nd) Alemanha" +
                        "\n\nDigite uma opção : "

        );

        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();

        switch (opcao) {
            case "a":
                System.out.println("Resposta incorreta !!");
                break;
            case "b":
                System.out.println("Resposta incorreta !!");
                break;
            case "c":
                System.out.println("Resposta correta !!");
                break;
            case "d":
                System.out.println("Resposta incorreta !!");
                break;
            default:
                System.out.println("Opção inexistente !!");
                break;
        }

    }
}