import java.util.Locale;
import java.util.Scanner;

public class AvaliaçaoEscolar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Vamos verificar se você foi aprovado no ano letivo? ");

        System.out.println(" Informe sua nota da prova: ");

        double nota1 = entrada.nextDouble();

        if (nota1 >= 7) {
            System.out.println(" Você está aprovado! Parabéns, agora pode relaxar mas nunca deixe de estudar.. ");
        } else if (nota1 >= 5 && nota1 < 7) { //&& significa (E), quer dizer que 2 condições precisam ser verdadde ao mesmo tempo
            System.out.println(" Você está de recuperação, não desanime pois ainda dá tempo ser aprovado! Descanse um pouco e amanhã mantenha o foco no objetivo. Boa sorte! ");
        } else  {
            System.out.println(" Você foi reprovado.. pode não ter sido o melhor ano, mas sempre vem o próximo para tentarmos novamente. Então siga em frente e não esqueça de manter o foco, boa sorte para o próximo ano! ");
        }

        System.out.println(" Seguimos com aqueles de recuperação, os demais boas festas! ");


        entrada.close();


    }
    
}
