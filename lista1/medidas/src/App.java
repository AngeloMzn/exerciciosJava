import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        float a, b ,c, areaQua, areaTri, areaTra;
        
        System.out.println("Digite a medida A:");
        a = sc.nextFloat();

        System.out.println("Digite a medida B:");
        b = sc.nextFloat();
        
        System.out.println("Digite a medida C:");
        c = sc.nextFloat();

        areaQua = a * a;
        areaTri = (a * b)/2;
        areaTra = ((a + b) * c) / 2;

        System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQua));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTra));

    }
}
