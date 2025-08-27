package com.mycompany.poo.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Modificar o valor
        pessoa.setNome("Ricardo");
        pessoa.setIdade(16);

        // Acessar o valor
        System.out.printf("%S tem %d anos de idade\n", pessoa.getNome(), pessoa.getIdade());


    }
}
