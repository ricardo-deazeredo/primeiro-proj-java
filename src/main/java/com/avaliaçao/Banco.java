package com.avaliaçao;

import java.util.Scanner;

public class Banco {
    public int numero;
    public String nome;
    public int saldo;
    protected int senha;

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("-----Escolha uma opção:-----");
        System.out.println("1 - FECHAR UMA CONTA");
        System.err.println("2 - REALIZAR DEPÓSITO");
        System.out.println("3 - REALIZAR TRANSFERÊNCIA");
        System.out.println("4 - MOSTRAR SEU SALDO BANCÁRIO");
        System.out.println("5 - EXTRATO BANCARIO");

        int saldo1 = 750;
        int saldo2 = 3500;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua opção: ");
        double opçao = scan.nextDouble();

        Scanner scan3Scanner = new Scanner(System.in);
        System.out.println("DIGITE SUA CONTA: ");
        double conta = scan3Scanner.nextDouble();

        if(opçao==1){

        }

        else if(opçao==2){
            Scanner scan2Scanner = new Scanner(System.in);
            System.out.println("DIGITE A CONTA DESTINADA ");
            double destinatario = scan.nextDouble();
            System.out.println("DIGITE O VALOR: ");
            double valor = scan.nextDouble();

        }

        else if(opçao == 3){
            Scanner scan2Scanner = new Scanner(System.in);
            System.out.println("DIGITE A CONTA DESTINADA ");
            double destinatario = scan.nextDouble();
            System.out.println("DIGITE O VALOR: ");
            double valor = scan.nextDouble();

        if(opçao == 4){
                Scanner scan4Scanner = new Scanner(System.in);
                System.out.println("DIGITE A SUA CONTA: ");
                double contacliente = scan.nextDouble();
                System.out.println("DIGITE O VALOR: ");
                double valordeposito = scan.nextDouble();}

                else if(conta == 1){
                    System.out.println("Seu saldo é" + saldo1  );
                }

                else if(conta == 2){
                    System.out.println("Seu saldo é " + saldo2);
                }
            }
    }
}

