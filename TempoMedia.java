public class TempoMedia {
 public static void main(String[] args) {

    int amostras = 250;

    int validos = 230;

    double tempoTotalMin = 580.0;

    double tempoMedio = tempoTotalMin / amostras;

    double percentualValidos = (validos / (double) amostras) * 100.0;

    System.out.println(" Tempo Média por Amostras (min): " + String.format("%.2f", tempoMedio));

    System.out.println(" Percentual de Resultados Validos (%): " + String.format("%.2f", percentualValidos));

 }
    
}
