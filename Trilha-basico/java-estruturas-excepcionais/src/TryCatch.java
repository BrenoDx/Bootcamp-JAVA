import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) throws Exception {
       try{
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome ");
        String sobrenome = input.next();

        System.out.println("Digite sua idade ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura");
        double altura = input.nextDouble();
       
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toLowerCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        input.close();
       }catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser númericos");
       }
    }
}
