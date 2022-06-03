/* 03-) Calcular a multa: Leia a velocidade de um carro e a velocidade máxima
para a rua:
Informe 50 reais se estiver até 10km/h acima;
Informe 100 reais se estiver entre 11km/h e 30km/h acima;
Informe 300 reais se estiver acima de 31km/h acima.  */

package com.mycompany.estruturadecontrole;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Em qual velocidade estava o carro? ");
        float velCarro = leia.nextFloat();
  
        System.out.println("Qual a velocidade maxima permitida na via? ");
        float velMax = leia.nextFloat(); 
    
        float kmAcima = velCarro - velMax; 
        
        if(kmAcima <= 10 && kmAcima > 0){
        System.out.println("O valor da multa eh de 50 reais");
   
        }else if(kmAcima > 10 && kmAcima <= 30){
        System.out.println("O valor da multa eh de 100 reais");

        } else if(kmAcima > 30){
         System.out.println("O valor da multa eh de 300 reais");
   
        }else {
   
        System.out.println("Dentro da velocidade permitida para a via!");
        }  
    }
}