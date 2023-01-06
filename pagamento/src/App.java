import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {

        Scanner sc = new Scanner(System.in);
        String nome;
        int  horas;
        float valHora, pagamento;

        System.out.println("Nome:");
        nome = sc.nextLine();
        
        System.out.println("Valor por hora:");
        valHora = sc.nextFloat();

        System.out.println("Horas trabalhadas:");
        horas = sc.nextInt();

        pagamento = valHora * horas;

        System.out.println("O pagamento para " + nome + " deve ser " + pagamento);
    }
}
