
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n***** Calculadora *******\n");

        System.out.println("Digite o primeiro número:");
        double num1 = teclado.nextDouble();

        System.out.println("\nDigite o segundo número:");
        double num2 = teclado.nextDouble();

        System.out.println("\nInforme a operação desejada '+, -, * ou /: ");
        char op = teclado.next().charAt(0);

        double total = 0;

        switch (op){
            case '+' -> total = num1+num2;
            case '-' -> total = num1-num2;
            case '*' -> total = num1*num2;
            case '/' -> total = num1/num2;

            default -> {
                System.out.println("\nComando inválido");
            }
        }
        System.out.println("\nO reultado da operação é igual a:  " +total);

        //Fechar Programa
        teclado.close();
    }

}
