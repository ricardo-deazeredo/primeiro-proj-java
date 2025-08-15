package com.avaliaçao;

import java.util.Scanner;

public class Banco {
    public int numero;
    public String nome;
    protected int saldo;
    protected int senha;

    public static void main(String[] args) {
        System.out.println("-----Escolha uma opção:-----");
        System.out.println("1 - FECHAR UMA CONTA");
        System.err.println("2 - REALIZAR DEPÓSITO");
        System.out.println("3 - REALIZAR TRANSFERÊNCIA");
        System.out.println("4 - MOSTRAR SEU SALDO BANCÁRIO");
        System.out.println("5 - EXTRATO BANCARIO");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua opção: ");
        double opçao = scan.nextDouble();

        if (opçao == 1) {

        }

        else if (opçao == 2) {
            Scanner scan2Scanner = new Scanner(System.in);
            System.out.println("DIGITE A CONTA DESTINADA ");
            double destinatario = scan.nextDouble();
            System.out.println("DIGITE O VALOR: ");
            double valor = scan.nextDouble();

        }
    }

}
