import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
       
        float largura, comprimento, valorMetroQuadrado, area, preco;
        
        System.out.println("Digite a largura do terreno:");
        largura = sc.nextFloat();
       
        System.out.println("Digite o comprimento do terreno:");
        comprimento = sc.nextFloat();

        System.out.println("Digite o valor do metro quadrado:");
        valorMetroQuadrado = sc.nextFloat();

        area = largura * comprimento; 
        preco = valorMetroQuadrado * area;
        
        System.out.println("Area do terreno = " + String.format("%.2f", area));
        System.out.println("Preco do terreno = " +String.format("%.2f", preco));
    }
}
