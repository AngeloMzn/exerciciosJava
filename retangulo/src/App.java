import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro, diagonal; 
        
        System.out.println("Base do retangulo:");
        base = sc.nextFloat();

        System.out.println("Altura do retangulo:");
        altura = sc.nextFloat();

        area = base * altura; 
        perimetro = (2 * base) + (2 * altura);
        diagonal =  Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));

        
        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
       
        sc.close();
    }
}
