package com.avaliaçao;

import com.mycompany.poo.aula10.Pessoa;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {


        Banco titular1 = new Banco();
        titular1.numero = 1;
        titular1.nome = "Nazaré";
        titular1.saldo = 750;
        titular1.senha = 2565;

        Banco titular2 = new Banco();
        titular2.numero = 2;
        titular2.nome = "Maria";
        titular2.saldo = 3500;
        titular2.senha = 6998;
        

        
    }
}
