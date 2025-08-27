package com.mycompany.poo.exercicio;

public class Calcado {

    private String marca;
    private String modelo;
    private String cor;
    private int tamanho;

    // Declaramos sempre após a declaração dos atributos

    // Método acessor, sempre começa com get
    public String getMarca() {
        return marca;
    }

    // Método modificador, sempre começa com set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
