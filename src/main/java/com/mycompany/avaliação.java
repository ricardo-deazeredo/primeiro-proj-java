package com.mycompany;

public class avaliação {
        public static void main(String[] args) {

         /**
          * Atividade 1
          */
         

         double num1 = 8.0;
         double num2 = 6.7;
         double num3 = 8.1;
         double num4 = 9.4;

         // Média 
         double soma = num1 + num2 + num3 + num4;
         double media = soma / 4.0 ;
         System.out.println("A média dele em física foi " + media);

         /**
          * Atividade 2 
          */

         double peso1 = 81.7;
         double altura1 = 1.87;
         double altura2 = 1.87;

         /**
          * Cálculo do IMC
          */
          
         double alturafinal = altura1 * altura2;
         double imc = peso1 / alturafinal;
         System.out.println("O imc dessa pessoa é " + imc);

         /**
          * Atividade 3
          */

         double valor_produto1 = 249.99;
         double valor_descontando1 = valor_produto1 * 35;
         double porcentagem_desconto1 = valor_descontando1 / 100;
         double novo_valor = valor_produto1 - porcentagem_desconto1;


         System.out.println("O valor deste produto com desconto é de R$ " + novo_valor);

        }
}
