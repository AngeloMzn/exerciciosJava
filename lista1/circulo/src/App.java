import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double raio, area, pi;

        pi = 3.14159;
        System.out.println("Digite o valor do raio do circulo:");
        raio = sc.nextFloat();

        area = pi * raio * raio;
        
        System.out.println("AREA = " + String.format("%.3f", area));
    }
}
