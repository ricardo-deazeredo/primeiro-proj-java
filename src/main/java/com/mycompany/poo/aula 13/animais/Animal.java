package com.mycompany.poo.aula13.animais;

/**
 * Classe Abstrata
 * 
 * Toda classe abstrata somente servirá de modelo/molde para
 * herança em outras classes, por ser abstrata, não pode ser instanciada.
 */
public abstract class Animal {

    private String nome;
    private double altura;
    private double peso;

    public Animal() {

    }

    public Animal(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    
    public abstract void emitirSom();

    public void respirar() {
        System.out.println("Respirando...");
    }

    public void mover() {
        System.out.println(this.nome + " está se movendo...");
    }

    public void mover(String direcao) {
        System.out.println(this.nome + " está se movendo para " + direcao + "...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
