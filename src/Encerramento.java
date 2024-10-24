import java.util.Scanner;

public class Encerramento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

       // System.out.println("Digite números. Digite 10 para encerrar.");

        while (true) {
            System.out.print("Digite um número inteiro: ");
            numero = Integer.parseInt(scanner.nextLine());

            if (numero == 10) {
                System.out.println("Você digitou 10. Encerrando o programa.");
                break;
            } else {
                System.out.println("Você digitou: " + numero);
            }
        }

        scanner.close();
    }
}
