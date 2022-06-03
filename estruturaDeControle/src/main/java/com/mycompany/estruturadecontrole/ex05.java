/* 05-) Escrever se um ano informado pelo usuário é bissexto ou não.
Um ano é bissexto quando é (divisível por 400) ou é 
(divisível por 4 e não por 100).  */

package com.mycompany.estruturadecontrole;

import java.util.Scanner;

public class ex05 {
      public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano para saber se eh bissexto: ");
        ano = ent.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " eh bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " eh bissexto.");
        } else{
            System.out.println(ano + " nao eh bissexto");
        }
    }
}
