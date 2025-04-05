import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Dados e valores do usuário
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor digite o número da agência! ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor do saldo da sua conta");
        double saldo = scanner.nextDouble();

        //Impressão da mensagem
        System.out.println("Olá " + nome +
                ",obrigado por criar uma conta em nosso banco, sua agência "
                + agencia + ",conta" + conta + "e seu saldo " + saldo + "vjá está disponível para saque");


    }

}
