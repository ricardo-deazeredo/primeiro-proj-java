package com.mycompany;

public class Aula01Variaveis {

    public static void main(String[] args) {
        // Variavel lógica

        // Tipo primitivo
        boolean valorLogicoPrimitivo = true;

        // Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato 
        Boolean valorLogicoAbstrato = false;

        // Exibe com texto
        System.out.println("O valor da variavel valorLogicoAbstrato é: " +valorLogicoAbstrato);

        // Variáveis inteiras

        // Tipo primitivo 

        int valorInteiro = 10; // 32 bits
        long valorInteiroLongo = 10L; // 64 bits

        // Tipo abstrato

        Integer valorInteiroAbs = 20; 
        Long valorLongoAbs = 20L;

        System.out.println("O valorInteiro é: " + valorInteiro + ", e o valorInteiroLongo é: " +  valorInteiroLongo);

        // Variáveis decimais

        // Tipos decimais 

        float numeroFloat = 10.5f; // 32 bits
        double numeroDouble = 10.5; // 64 bits

        // Tipo abstrato

        Float numeroFloatAbs = 10.5f; // 32 bits
        Double numerDoubleAbs = 10.5f; // 64 bits

        System.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: " + numeroDouble );


    }
}