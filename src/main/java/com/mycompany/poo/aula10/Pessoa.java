package com.mycompany.poo.aula10;

public class Pessoa {
    /**
     * Modificaodres de acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso, para dar segurança nossas classses.
     * 
     * Utilizamos elas para:
     * -Classes
     * -Interfaces
     * -Atributos
     * -Métodos
     */

     public String nome; // Publico, é visível em qualquer classe.
     protected int idade; // Protegido, é visível somente em classes filhas(herdeiras).
     private double salario; // Privado, é visível somente dentro da própria classe.
     double altura; // Friendly ou público, apesar de não estar explicitado, ele também é visível. 

     public void exibirDados() {
        System.out.println("-----Dados da pessoa-----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
     }
}
