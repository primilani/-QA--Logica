import java.util.Scanner;

public class BuscarNome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; // Vetor de 10 posições

        // Ler os nomes do usuário
        System.out.println("Por favor, informe 10 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Ler um novo nome para buscar

        System.out.print("\nInforme um nome para buscar: ");
        String nomeBuscado = scanner.nextLine(); // Lê o nome a ser buscado

        // Verificar se o nome existe no vetor
        boolean encontrado = false; // Variável para controlar se o nome foi encontrado


        // Usando o loop

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscado)) { // Verifica se o nome está no vetor
                encontrado = true; // Marca como encontrado
                break; // Sai do loop se o nome for encontrado
            }
        }

        // Exibir o resultado da busca

        if (encontrado) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }

        // Fechar o scanner

        scanner.close();
    }
}
