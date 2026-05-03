import java.util.Scanner;

public class SemaforoComandos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Informe a cor que aparece no Semaforo: ");

        String cor = entrada.nextLine();

        if (cor.equalsIgnoreCase ("vermelho")) {//.equals serve para comparar as String // .equalsIgnoreCase compara os textos mas ignorando se é maiúscula ou minúcula
            System.out.println(" Pare! ");
        } else if (cor.equalsIgnoreCase ("amarelo")) {
            System.out.println(" Atenção, ande com cuidado! ");
        } else {
            System.out.println(" Siga em frente, respeitando o limite de velocidade! ");
        }

    }
    
}
