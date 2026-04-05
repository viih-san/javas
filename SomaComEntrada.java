import java.util.Scanner;

public class SomaComEntrada {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");

        int a = entrada.nextInt();

        System.out.println("Digite o segundo número:");

        int b = entrada.nextInt();

        int soma = a + b;

        System.out.println("A soma é:" + soma);

        entrada.close();
    }
}
