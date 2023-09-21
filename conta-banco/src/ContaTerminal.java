import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite os dados solicitados!");
    System.out.print("Nome do Cliente: ");
    String nomeCliente = scanner.nextLine();

    System.out.print("Agência: ");
    String agencia = scanner.nextLine();

    System.out.print("Conta: ");
    int numero = scanner.nextInt();

    System.out.print("Saldo: ");
    double saldo = scanner.nextDouble();

    scanner.close();

    System.out.println(
        "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
            + numero + " e seu saldo " + saldo + " já está disponível para saque.");
  }
}
