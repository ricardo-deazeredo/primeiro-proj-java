package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ricardo";
        pessoa.idade = 16;
        // pessoa.salario = 1000; atributos privados não são visíveis

        // Instanciando classes qu estão declaradas em outro arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Naomi";
        pessoa1.idade = 26;
        pessoa1.altura = 1.98;

        pessoa2.nome = "Maria";
        pessoa2.idade = 18;
        pessoa2.altura = 1.87;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.atribuirSalario(2000.0, 500.0);
        pessoa2.atribuirSalario(3500.0);

        /*
         * System.out.println("--- Dados da pessoa ---");
         * System.out.println("Nome: " + pessoal1.nome);
         * System.out.println("Idade: " + pessoal1.idade);
         * System.out.println("Altura (m): " + pessoal1.altura);
         * 
         * System.out.println("--- Dados da pessoa ---");
         * System.out.println("Nome: " + pessoal2.nome);
         * System.out.println("Idade: " + pessoal2.idade);
         * System.out.println("Altura (m): " + pessoal2.altura);
         */
    }
}
