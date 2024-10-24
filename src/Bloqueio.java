import java.util.Scanner;

public class Bloqueio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String lCorreto = "aluno";
        String pCorreta = "segredo";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o usuário: ");
            String login = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String password = scanner.nextLine();

            if (login.equals(lCorreto) && password.equals(pCorreta)) {
                System.out.println("Bem-vindo!");
                break; // Login bem sucedido, sai do loop

            } else {
                System.out.println("Login incorreto. Tente novamente.");
                tentativas++;
            }
        }

        if (tentativas == 3) {
            System.out.println("Você excedeu o número máximo de tentativas. Seu acesso está bloqueado.");
        }

        scanner.close();
    }
}

