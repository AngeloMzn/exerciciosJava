import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;
        float mediaIdade;


        System.out.println("Dados da primeira pessoa:");
        
        System.out.println("Nome:");
        nome1 = sc.nextLine();
        
        System.out.println("Idade:");
        idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        
        System.out.println("Nome:");
        nome2 = sc.nextLine();
    
        System.out.println("Idade:");
        idade2 = sc.nextInt();

        
       mediaIdade= (float)(idade1 + idade2) / 2;

        
        System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " +String.format("%.1f", mediaIdade));
    }
}
