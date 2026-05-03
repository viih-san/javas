import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Conversor Celsius para Fahrenheit ");

        System.out.println(" Informe a temperatura em Celsius: ");

        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32; 

        System.out.println(" Temperatura em Fahrenheit: " + fahrenheit + String.format("%.2f",fahrenheit));

        entrada.close();
    }
    
}
