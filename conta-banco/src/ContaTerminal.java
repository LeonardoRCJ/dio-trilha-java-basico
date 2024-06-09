import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();


        System.out.println("Olá, informe seu nome para a gente!!!: ");
            conta.nomeCliente = ler.next().toUpperCase();
        
        System.out.println("Por favor, digite o número da sua conta: ");
            conta.numero = ler.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
            conta.agencia = ler.next();

        System.out.println("Informe o saldo da sua conta: ");
            conta.saldo = ler.nextDouble();


        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo de " + conta.saldo + " já está disponível para saque");
    }
}
