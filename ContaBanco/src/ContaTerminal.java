import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
    
    Scanner ler = new Scanner (System.in).useLocale(Locale.US);
    
    int conta;
    String agencia;
    String nomecliente;
    double saldo;

            System.out.println("Por favor, digite o numero da conta: ");
            conta = ler.nextInt();

            System.out.println("Por favor, digite o numero da agência: ");
            agencia = ler.next();

            System.out.println("Por favor, digite o nome do cliente: ");
            nomecliente = ler.next();

            System.out.println("Por favor, digite o saldo: ");
            saldo = ler.nextDouble();

        // RESOLUÇÃO

            System.out.println("Olá, " + nomecliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        
    }
    
}
