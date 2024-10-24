import java.util.Scanner;

public class Imovel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite o valor do imóvel a ser vendido: R$");
        double imovel = teclado.nextDouble();

        double comissao;

        if (imovel >= 50000){
            comissao = imovel*0.20;

        } else if (imovel>=30000){
            comissao = imovel*0.15;

        } else {
            comissao = imovel*0.10;
        }


        System.out.println("Vendedor : " +nome);
        System.out.println("Valor do Imóvel: R$" +imovel);
        System.out.println("Comissão: R$" +comissao);

    }
}
