public class Contador {
    public static void main(String[] args) {

        int soma = 0;
        int i = 1;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos valores inteiros de 1 a 100 é: " + soma);
    }
}