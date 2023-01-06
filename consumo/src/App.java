import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int distancia;
        float combustivelGasto, consumo;

        System.out.println("Distancia percorrida:");
        distancia = sc.nextInt();

        System.out.println("Combustível gasto:");
        combustivelGasto = sc.nextFloat();

        consumo = distancia/combustivelGasto;

        System.out.println("Consumo medio = " + String.format("%.3f", consumo));
    }
}
