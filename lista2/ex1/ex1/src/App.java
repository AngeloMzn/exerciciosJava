import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner R = new Scanner(System.in);
        double nota1, nota2, soma;
        
        System.out.println("Olá usuário ! Vamos ver se o seu aluno passou de ano ?");
        System.out.println("Digite, por favor, as notas totais de cada semestre do seu aluno.");
        System.out.println("=================================================================");

        System.out.println("Digite apenas a primeira nota e aperte enter:");
        nota1 = R.nextDouble();
        
        System.out.println("Digite apenas a segunda nota e aperte enter:");
        nota2 = R.nextDouble();

        soma = nota1 + nota2;

        if(soma >= 60)
        {
            System.out.println("O aluno teve como nota final " + soma + " e está APROVADO");
        }
        else
        {
            System.out.println("O aluno teve como nota final " + soma + " e está REPROVADO");
        }
        

    }
}
