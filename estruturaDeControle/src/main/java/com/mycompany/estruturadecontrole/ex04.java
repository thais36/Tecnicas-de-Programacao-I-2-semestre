/* 04-) Ler 3 valores em qualquer ordem e escrever eles em ordem crescente.  */

package com.mycompany.estruturadecontrole;

import java.util.Scanner;

public class ex04 {
     

 public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        int x1,x2,x3;
        
System.out.println("Informe o primeiro numero: ");
        x1 = s.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        x2 = s.nextInt();
        
        System.out.println("Informe o terceiro numero: ");
        x3 = s.nextInt();
        
        int aux;
        if (x1>x2) {
            aux = x2;
            x2 = x1;
            x1 = aux;
        } 
        if (x1>x3) {
            aux = x3;
            x3 = x2;
            x2 = x1;
            x1 = aux;
        } else if (x2>x3){
            aux = x2;
            x2 = x3;
            x3 = aux;
        }
        System.out.println(x1+" "+x2+" "+x3);
    }
}