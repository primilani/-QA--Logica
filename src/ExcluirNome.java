import java.util.Scanner;

public class ExcluirNome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20]; // Vetor de 20 posições

        // Ler os nomes do usuário

        System.out.println("Por favor, informe 20 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Vetor para nomes unicos

        String[] nomesUnicos = new String[20];
        int contador = 0; // Contador para o vetor de nomes únicos

        // Adicionar os nomes únicos no vetor

        for (String nome : nomes) {
            boolean encontrado = false;

            // Verificar se o nome já está no vetor

            for (int j = 0; j < contador; j++) {
                if (nomesUnicos[j].equalsIgnoreCase(nome)) {
                    encontrado = true; // Nome encontrado
                    break; // Sai do loop se o nome for encontrado
                }
            }

            // Se o nome não foi encontrado, adicioná-lo ao vetor de nomes únicos

            if (!encontrado) {
                nomesUnicos[contador] = nome;
                contador++; // Incrementa o contador
            }
        }

        // Exibir os nomes únicos

        System.out.println("\nNomes únicos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(nomesUnicos[i]); // Exibe cada nome único
        }

        // Fechar o scanner
        scanner.close();
    }
}
