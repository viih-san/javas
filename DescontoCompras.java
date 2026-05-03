import java.util.Locale;
import java.util.Scanner;

public class DescontoCompras {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Olá, tudo bem? ");

        System.out.println("Digite seu nome:");

        String nomeCliente = entrada.nextLine();//declara váriavel texto

        System.out.println(nomeCliente + ", agora que completou suas compras informe o valor para verificarmos se há desconto: ");

        System.out.println(" Digite o valor final de sua compra: ");

        double valorCompra = entrada.nextDouble();//declara variavel com entrada

        double valorFinal;//declarar variavel 

        if (valorCompra >= 500) {
            valorFinal = valorCompra * 0.80;
            System.out.println(" Seu desconto é de 20%, e já está aplicado! ");
        } else if (valorCompra >= 200) {
            valorFinal = valorCompra * 0.90;
            System.out.println(" Seu desconto é de 10%, e já está aplicado! ");
        } else {
            valorFinal = valorCompra;
            System.out.println(" Para este valor não fornecemos desconto, adicione mais alguns itens a sua compra! ");
        }

        System.out.printf(" Valor total a pagar: R$ %.2f%n" , valorFinal); //printf %.2f%n é usado para executar um resultado mais agradavel visaulmente e profissional 145.56 com 2 casas décimais 

        entrada.close();



    }
    
}
