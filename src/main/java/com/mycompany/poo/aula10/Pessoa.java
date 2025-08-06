package com.mycompany.poo.aula10;

public class Pessoa {
    /**
     * Modificaodres de acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança nossas classses.
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

    /**
     * 
     * Nomenclatura de métodos
     *
     * método/função indicam ações, e por padrão utilizamos verbos
     *
     * Ex: Correr, andar, andar, caminhar, ....
     * 
     * @param valor
     */

    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salário de" + this.nome + "é" + this.salario);
    }

    public void atribuirSalario(double valor, double bonus) {
        this.salario = valor + bonus;

        System.out.println("O novo salário de" + this.nome + "é" + this.salario + "mais um bônus de" + bonus);
    }
}
