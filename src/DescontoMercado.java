
import java.util.Scanner;
public class DescontoMercado {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);

        // Lista de Produtos com desconto

        System.out.print("Olá Visitante | Aproveite os nossos cupons de descontos |\n");
        System.out.println(" - Ganhe 10% de desconto levando de 11 a 20 unidades");
        System.out.println(" - Ganhe 20% de desconto levando de 21 a 50 unidades");
        System.out.println(" - Ganhe 25% de desconto levando acima de 50 unidades");

        System.out.println(" \n | Seção de Frutas | \n");

        System.out.println(" Abacate | R$ 5,00");
        System.out.println(" Maça    | R$ 7,00");
        System.out.println(" Kiwi    | R$ 3,00");



        // Seleção dos produtos

        System.out.print("\nInforme o produto que deseja: ");
        String produto = menu.nextLine();

        System.out.print("\nInforme o valor do produto: R$ ");
        double valor = menu.nextDouble();

        System.out.print("\nInforme a quantidade: ");
        int qtd = menu.nextInt();

        double total;


        // Condição

        if (qtd <=10){
            total = valor*qtd;
            System.out.println( " Esta quantidade não possui nenhum desconto! ");


        } else if (qtd <=20) {
            total = valor*qtd*0.10;
            System.out.println("Você recebeu 10% de desconto");


        } else if (qtd <=50) {
            total = valor*qtd*0.20;
            System.out.println("Você recebeu 20% de desconto");

        }else{
            total = valor*qtd*0.25;
            System.out.println("Você recebeu 25% de desconto");



        }

        System.out.println("\n###############################\n");
        System.out.println("Produto selecionado: " +produto);
        System.out.println("Preço unitário: R$ " + valor);
        System.out.println("Quantidade selecionada: " +qtd);
        System.out.println("Total da compra: R$ " +total);
        System.out.println("\n###############################\n");
    }
}
