import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            // Pedir os dados do aluno
            System.out.println("Bem-vindo(a), Professor(a). \nPor favor, informe o nome e as notas do aluno a ser avaliado.\n");

            System.out.print("Nome do aluno: ");
            String aluno = scanner.nextLine();

            System.out.print("\nPrimeira Nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("\nSegunda Nota: ");
            double nota2 = scanner.nextDouble();

            // Calcular a média do aluno
            double media = (nota1 + nota2) / 2;

            // Condição para saber se foi aprovado, reprovado ou em recuperação

            if (media >= 7) {
                System.out.printf("\nA nota final é: %.1f \nO(a) aluno(a) %s está Aprovado(a).", media, aluno);
            } else if (media >= 5) {
                System.out.printf("\nA nota final é: %.1f \nO(a) aluno(a) %s está em Recuperação.", media, aluno);
            } else {
                System.out.printf("\nA nota final é: %.1f \nO(a) aluno(a) %s está Reprovado(a).", media, aluno);
            }

            // Pergunta se deseja realizar um novo cálculo

            System.out.print("\n\nDeseja realizar um novo cálculo? (S/N): ");
            opcao = scanner.next().toUpperCase();
            scanner.nextLine();  // Limpa o buffer

        } while (opcao.equals("S"));

        // Fechar o scanner
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
