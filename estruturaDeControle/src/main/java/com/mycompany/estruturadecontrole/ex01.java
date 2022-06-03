/*  1-) Crie um programa que solicite ao usuário informar o número referente ao
mês e exibir o nome do mês de acordo com o número informado pelo usuário e caso
o número seja < 0 ou > 12 exibir a mensagem de ERRO. */

package com.mycompany.estruturadecontrole;
        
import java.util.Scanner;

public class ex01 {
    public static void main(String a[]){
        Scanner ent = new Scanner(System.in);
        int mes;
        
        System.out.println("Digite o numero do mes: ");
        mes = ent.nextInt();
        

      if(mes==1){
             System.out.println("\nJANEIRO\n");
             }
      if (mes==2){
             System.out.println("\nFEVEREIRO\n");
             }
      if(mes==3){
            System.out.println("\nMARCO\n");
             }
      if (mes==4){
             System.out.println("\nABRIL\n\n");
             }
      if(mes==5){
             System.out.println("\nMAIO\n");
             }
      if (mes==6){
             System.out.println("\nJUNHO\n");
             }
      if(mes==7){
             System.out.println("\nJULHO\n");
             }
      if (mes==8){
             System.out.println("\nAGOSTO\n");
             }
      if(mes==9){
             System.out.println("\nSETEMBRO\n");
             }
      if (mes==10){
             System.out.println("\nOUTUBRO\n");
             }
      if(mes==11){
             System.out.println("\nNOVEMBRO\n");
             }
      if (mes==12){
            System.out.println("\nDEZEMBRO\n");          
        }
      else if(mes<0 && mes>12){
            System.out.println("\n Numero eh Invalido!\n");
            }
      }
}
