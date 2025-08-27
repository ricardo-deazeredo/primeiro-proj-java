package com.mycompany.poo.aula11;

public class Pessoa {
    /**
     * Encapsulamento (Métodos acessores/modificadores)
     * 
     * Em projetos de grande escala, para mantermos a segurança das nossas classes,
     * utilizamos o modificador de acesso privado, com uma maior frequência
     * 
     * Em muitas situações precisamos buscar e alterar uma ou mais informações, e é
     * nesse cenário que ultilizamos os métodos:
     * 
     * - Getter: acessar/buscar
     * - Setter: modificar/alterar
     */

    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Declaramos sempre depois dos atributos

    // Método acessor, sempre começa com get
    public String getNome() {
        return nome;
    }

    // Método modificador, sempre começa com set
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
