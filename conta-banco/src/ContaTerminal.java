import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta!");
         int numero = scanner.nextInt();
       
        System.out.println("Por favor, digite o número da Agência!");
         String agencia = scanner.next();

         System.out.println("Por favor, informe seu nome.");
         String nome = scanner.next();

         System.out.println("Qual valor deseja depositar?");
         Double saldo = scanner.nextDouble();

         System.out.println("Olá" +" "+  nome +", obrigado por criar uma conta em nosso banco, sua agência é"+" "+ agencia+", conta"+ " "+ numero + " e seu saldo"+ " "+ saldo+ " "+ "já está disponivel para saque.");

    }
}
