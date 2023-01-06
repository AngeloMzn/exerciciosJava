import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        float precoUni, dinheiroRecebido, troco;
        int qtdComprada;

        System.out.println("Preço unitário do produto:");
        precoUni = sc.nextFloat();
        
        System.out.println("Quantidade comprada:");
        qtdComprada = sc.nextInt();

        System.out.println("Dinheiro recebido:");
        dinheiroRecebido = sc.nextFloat();

        troco = dinheiroRecebido - (precoUni * qtdComprada);

        System.out.println("Dinheiro recebido = " + String.format("%.2f", troco));
    }
}
