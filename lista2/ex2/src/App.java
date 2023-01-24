import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner R = new Scanner(System.in);
        double  a, b, c, delta, x1, x2;

        System.out.println("Olá usuário ! Vamos calcular as raizes de uma equação do segundo grau ?");
        System.out.println("Informe, por favor, os coeficientes A, B, C da equação");
        System.out.println("======================================================");

        System.out.println("Informe o coeficiente A e aperte enter:");
        a = R.nextDouble();
        
        System.out.println("Informe o coeficiente B e aperte enter:");
        b = R.nextDouble();

        System.out.println("Informe o coeficiente C e aperte enter:");
        c = R.nextDouble();

        delta = Math.pow(b, 2) - (4*a*c);

        if(delta > 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A raiz X1 é = " + String.format("%.4f", x1));
            System.out.println("A raiz X2 é = " + String.format("%.4f", x2));

        }
        else
        {
            System.out.println("Éssa esquação não possui solução !");
        }

    }
}
