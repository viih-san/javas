import java.util.Locale; //importa a classe Locale para configurar padrões regionais(ex: separador decimal com ponto)
import java.util.Scanner; //importa a classe Scanner para ler dados digitados pelo usuario/no console (teclado)

public class RelatorioLaboratorio {

    public static void main(String[] args) {

        //define o padrão regional do programa
        //Locale.US usa ponto como separador decimal (ex: 3.50)
        Locale.setDefault(Locale.US);

        //cria um Scanner para ler os dados digitados no console (pelo usuario)
        Scanner entrada = new Scanner(System.in);

        //mostra o texto para o usuario (Título) *saída informativa*
        System.out.println(" Relatório Diário do Laboratório ");

        //solicita a quantidade de amostras (inteiro)
        System.out.print(" Informe a quantidade de Amostras processadas: ");

        int amostras = entrada.nextInt();

        //solicita o tempo total gasto (pode ter casas decimais)
        System.out.print(" Informe o tempo total gasto (em min): "); 

        double tempoTotalMin = entrada.nextDouble();

        //solicita o número de resultados válidos (inteiro)
        System.out.print(" Informe o número de resultados válidos: ");

        int validos = entrada.nextInt();

        //calcula o tempo médio por amostra
        //como tempoTotalMin é Double, o resultado será decimal (se necessário)
        double tempoMedio = tempoTotalMin / amostras;

        //Calcula o percentual de válidos 
        //(double) amostras força divisão decimal, evitando truncamento da divisão inteira
        double percentualValido = ( validos / (double) amostras ) * 100.0;

        //mostra os resultados com formatação e rotúlos claros
        System.out.println("\nResultados");

        System.out.println("Tempo médio por amostra (min):" + String.format("%.2f", tempoMedio));

        System.out.println(" Percentual de resultados válidos(%): " + String.format("%.2f", percentualValido));

        //Fecha o Scanner (Boa prática e uso de recurso)
        entrada.close();
    }
}
