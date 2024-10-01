import java.util.Scanner;

public class ItensMercado {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);

        System.out.println("******Bem Vindos!*****\n" );
        System.out.println("1 - Água");
        System.out.println("2 - Refrigerante");
        System.out.println("3 - Cerveja\n");
        System.out.println("Informe qual sua bebida: ");

        int bebida = menu.nextInt();

        if (bebida == 1) { // Água
            System.out.println("Compra efetuada.");

        } else if (bebida == 2) { // Refrigerante
            System.out.println("Compra efetuada");

        }

        if (bebida == 3) { // Cerveja
            System.out.println("Informe sua idade:");
            int idade = menu.nextInt();

            if (idade < 18) {
                System.out.println("Compra negada para menores de 18 anos!");

            } else {
                System.out.println("Compra efetuada.");

            }
        }
    }
}