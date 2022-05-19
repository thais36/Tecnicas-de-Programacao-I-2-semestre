import java.util.*;
public class UsaForma {
    public static void main(String args []) {
        float b, a;
        Quadrado q;
        Triangulo t;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base do quadrado: ");
        b = scan.nextFloat();
        q = new Quadrado(b);

        q.mostra();

        System.out.print("Digite a base do triangulo: ");
        b = scan.nextFloat();
        System.out.print("Digite a altura do triangulo: ");
        a = scan.nextFloat();
        t = new Triangulo(b, a);

        t.mostra();
    }
    }
}
