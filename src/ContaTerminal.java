import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String nomeCliente;
    String agencia;
    double saldo;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome: ");

       String nomeCliente = scan.next();
        System.out.println("Por favor, insira o numero da agencia: ");
        String agencia = scan.next();

        System.out.println("Insira o numero da conta: ");
        int numero = scan.nextInt();

        System.out.println("Insira seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + numero + " e seu saldo "  + saldo + " já está disponível para saque");








    }
    }
