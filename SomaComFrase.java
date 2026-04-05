import java.util.Scanner;

public class SomaComFrase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número de 102 a 684:");

        int a = entrada.nextInt();

        System.out.println("Escolha novamente, agora entre 692 a 1.306");

        int b = entrada.nextInt();

        System.out.println("Calculando...");

        int soma = a + b;

        System.out.println("A soma de: " + a + " + " + b + " é igual a: " + soma); 

        entrada.close();
    }
    
}
