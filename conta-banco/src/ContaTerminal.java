import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner nomeClienteScanner = new Scanner(System.in);
           String nomeCliente;
             System.out.println("digite seu nome");
            nomeCliente = nomeClienteScanner.nextLine();

        Scanner agenciaScanner = new Scanner(System.in);
           String agencia;
             System.out.println("Bem vindo " + nomeCliente + ", Por favor digite o numero da Agência: ");
               agencia = agenciaScanner.nextLine();

        Scanner numeroContaScanner = new Scanner(System.in);
            int numero;
               System.out.println("Agora digite o número da conta: ");
                numero = numeroContaScanner.nextInt();

        Scanner saldoContaScanner = new Scanner(System.in);
          double saldo;
             System.out.println("Deposite um valor,para a validação da conta: ");
              saldo = saldoContaScanner.nextDouble();


      System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco,sua Agência é: " + agencia + " Conta: " + numero + " e seu saldo, R$" + saldo + " já está disponivel para saque.");
       
    }

}
           

