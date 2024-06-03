import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha restante

        System.out.println("Digite a sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Bem-vindo, " + nomeCliente + ". Sua conta foi criada com sucesso!");
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }
}
