import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner termImput = new Scanner(System.in);
        int contaNumero;
        String agenciaId;
        String nomeDoCliente;
        double saldo;


        System.out.print("Por favor, digite o número da sua conta: ");
        contaNumero = Integer.parseInt(termImput.nextLine());

        System.out.print("Por favor, digite a identificação da agência: ");
        agenciaId = termImput.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        nomeDoCliente = termImput.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        saldo = termImput.nextDouble();

        System.out.println("Olá " + nomeDoCliente + " , obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agenciaId + " , conta " + contaNumero + " e seu saldo R$" + saldo +
                " já esta disponivel para saque."
        );
    }
}
