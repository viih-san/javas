import java.util.Scanner;

     class SomaMedia {
        public static void main(String[] args) {

          Scanner entrada = new Scanner(System.in);

            System.out.println("Escolha 2 números (podendo ser decimal), para testarmos o nosso sistema de cálculo de soma e média, segue abaixo:"); 

            System.out.println("Escolha o primeiro número:");

            double a = entrada.nextDouble(); 

            System.out.println("Escolha o segundo número:");

            double b = entrada.nextDouble(); 

            double soma = a + b;
            double media = soma / 2; 

            System.out.println("A soma de " + a + " + " + b + " é igual a: " + soma);

            System.out.println("A média de " + soma + " é igual a: " + media);

            entrada.close();
        }
     }