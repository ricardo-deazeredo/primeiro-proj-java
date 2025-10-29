package com.mycompany.poo.aula13.animais;

/**
 * Herdar de uma classe
 * 
 * Para herdar características de outra classe, utilizamos:
 * 
 * extends [NOME DA CLASSE]
 * 
 * Só podemos herdar de uma única classe
 */
public class Leao extends Animal {

    public Leao(String nome, double altura, double peso) {
        /**
         * super() referese a classe pai, no caso, Animal
         * 
         * chamará o construtor presente nela.
         */
        super(nome, altura, peso);
    }

    @Override
    public void emitirSom() {
        System.err.println("O leão está rugindo ...");
    }
}
