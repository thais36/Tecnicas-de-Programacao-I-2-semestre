package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro: ");
        int x = sc.nextInt();
        System.out.println(x + " x 0 = " + x*0);
        System.out.println(x + " x 1 = " + x*1);
        System.out.println(x + " x 2 = " + x*2);
        System.out.println(x + " x 3 = " + x*3);
        System.out.println(x + " x 4 = " + x*4);
        System.out.println(x + " x 5 = " + x*5);
        System.out.println(x + " x 6 = " + x*6);
        System.out.println(x + " x 7 = " + x*7);
        System.out.println(x + " x 8 = " + x*8);
        System.out.println(x + " x 9 = " + x*9);
        System.out.println(x + " x  = 10 " + x*10);    
    }
    
}
