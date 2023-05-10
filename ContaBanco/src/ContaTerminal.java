import java.math.BigDecimal;
import java.util.Scanner;
public class ContaTerminal {

   
    public static void main(String[] args) throws Exception {


        int numero;
        BigDecimal saldo;
        String nomeCliente;
        String agencia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao banco!");


        System.out.println("Por favor, digite o numero da agencia");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo do cliente");
        saldo = sc.nextBigDecimal();

        System.out.println("...........................Carregando");

        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá," + nomeCliente + 
        " obrigado por criar uma conta em nosso banco! sua agência é: " + agencia + 
        ", conta: " + numero + " e o seu saldo de : " + saldo + " já está disponível para saque.");

        sc.close();

    }
}
