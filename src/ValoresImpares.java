import java.util.Scanner;

public class ValoresImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; // Vetor de 10 posições
        int contImpares = 0;

        // Pedir os números ao usuário
        System.out.println("Por favor, informe 10 números inteiros:");

        // Usando um loop para solicitar cada número

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: "); // Exibe a mensagem
            numeros[i] = scanner.nextInt(); // Lê o número do usuário

            // Verifica se o número é ímpar

            if (numeros[i] % 2 != 0) {
                contImpares++; // Incrementa o contador de ímpares
            }
        }

        // Exibir a quantidade de números ímpares

        System.out.printf("\nA quantidade de números ímpares é: %d\n", contImpares);

        // Fechar o scanner
        scanner.close();
    }
}
