import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner R = new Scanner(System.in);
        int n;

        System.out.println("Olá usuário, vamos verificar se existem números negativos em um vetor ?");
        System.out.println("=======================================================================");

        System.out.println("Informe quantos números você irá colocar no vetor:");
        n = R.nextInt();

        int[] vet = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Digite o número da posição " + i);
            
            vet[i] = R.nextInt();

        }

        System.out.println("NÚMEROS NEGATIVOS");
        System.out.println("=================");
        
        for(int i = 0; i < n; i++)
        {
            if(vet[i] < 0)
            {
                System.out.println("posição: " + i + "; número: " + vet[i]);
            }
        }
    }
}
