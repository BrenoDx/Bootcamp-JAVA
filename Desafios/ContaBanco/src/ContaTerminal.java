import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Objeto Scanner para receber as entradas do usuários.
        Scanner input = new Scanner(System.in);

        String nomeCliente, agencia;
        int numeroConta;
        double saldo;

        // Mensagens para o nosso usuário
        // Obtendo as informações pelo Scanner
        System.out.println("*------------------------------------*");
        System.out.println("Por favor, digite número da agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroConta = input.nextInt();

        System.out.println("Digite o seu nome: ");
        input.nextLine();
        nomeCliente = input.nextLine();

        System.out.println("Digite o saldo da conta: ");
        saldo = input.nextDouble();

        // Mensagem conta criada.
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, a sua agência é %s, conta: %d e o saldo R$ %.2f já disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

        input.close();

    }
}
