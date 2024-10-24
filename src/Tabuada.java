import java.util.Scanner;

public class Tabuada {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            // Solicita um número inteiro entre 1 e 10 do usuario

            do {
                System.out.print("Digite um número inteiro entre 1 e 10: ");
                while (!scanner.hasNextInt()) {

                    System.out.println("Por favor, digite um valor válido.");
                    scanner.next(); // consome o valor inválido
                }
                numero = scanner.nextInt();
            } while (numero < 1 || numero > 10);

            // Exibe a tabuada do número informado
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            scanner.close();

        }
    }


