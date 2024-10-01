import java.util.Scanner;

public class AlunoNota {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        //Pedir os dados do aluno

        System.out.println("Bem vindo caro Professo (a). \nPor favor informe o nome e as notas do aluno a ser avaliado \n ");

        System.out.println("Nome do aluno:  ");
        String aluno = nota.nextLine();

        System.out.println("\nPrimeira Nota:  ");
        double num1 = nota.nextDouble();

        System.out.println("\nSegunda Nota:   ");
        double num2 = nota.nextDouble();

        System.out.println("\nTerceira Nota:  ");
        double num3 = nota.nextDouble();

        double media = (num1+num2+num3)/3;

        //Condição

        if (media >=7){
            System.out.printf("\n A nota final é: %.1f  \n o(a) aluno(a) %s esta Aprovado(a)", media, aluno);

        } else if (media >=5) {
            System.out.printf("\n A nota final é: %.1f  \n o(a) aluno(a) %s esta em Recuperação", media, aluno);

        }else System.out.printf("\n A nota final é: %.1f  \n o(a) aluno(a) %s esta Reprovado(a)", media, aluno);

        //Fechar Programa
        nota.close();

          /* o printf é de format, onde vou formatar a sentença, em vez de colocarmos + media + aluno, substituimos a media por '%.1f (float)
          e aluno por %s (string) e ao final apenas chamamos suas variaveis que ele fara a substituição.
            * */
    }

}