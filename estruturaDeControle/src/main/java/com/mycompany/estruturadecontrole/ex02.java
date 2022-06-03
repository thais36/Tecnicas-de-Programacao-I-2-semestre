/* 02-) Ler 3 números fracionários do teclado e informar se o primeiro é maior
do que a soma dos dois últimos. */
       
package com.mycompany.estruturadecontrole;

import java.util.Scanner; 

public class ex02 {
        public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        float x1,x2,x3;
        
        System.out.println("Informe o primeiro numero fracionario: ");
        x1 = s.nextFloat();
        
        System.out.println("Informe o segundo numero fracionario: ");
        x2 = s.nextFloat();
        
        System.out.println("Informe o terceiro numero fracionario: ");
        x3 = s.nextFloat();
        
        if (x1 > x2+x3 )
        System.out.println("Primeiro maior que a soma dos outros dois");
        System.out.println("X1 = "+x1 +" X2 = "+x2+" X3 = "+x3 );
    }
}
   
