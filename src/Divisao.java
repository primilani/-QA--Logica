import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado;

        // Solicita ao usuario que insira dois valores para a divisão
        System.out.print("Digite um numero inteiro: ");
        n1 = scanner.nextDouble();

        // Solicita ao usuario que insira o denominador, com validação para evitar divisão por zero
        do {
            System.out.print("Digite um número inteiro (não pode ser zero): ");
            n2 = scanner.nextDouble();

            if (n2 == 0) {
                System.out.println("Erro: O denominador não pode ser zero. Por favor, insira um valor válido.");
            }

        } while (n2 == 0);

        // Calcula a divisão e exibe o resultado
        resultado = n1 / n2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}

