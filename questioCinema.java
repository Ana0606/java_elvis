import java.util.Scanner;
import java.io.PrintStream;

public class questioCinema {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    private static int idade, regular, bom, otimo, contador = 0, media, soma;
    private static double porcentagem;
    private static char opiniao;

    public static void main(String[] args) {

        do {
            inicio();
            opiniao();
        } while (contador < 15);
        // saidas();
        somas();
    }

    public static void inicio() {
        video.println("Qual sua idade?");
        idade = teclado.nextInt();
    }

    public static void opiniao() {
        video.println("Qual sua opinião sobre o filme?");
        video.println("\n a. Regular \n b. Bom \n c. Ótimo \n");
        opiniao = teclado.next().charAt(0);
        switch (opiniao) {
            case 'a':
                regular = regular + 1;
                break;
            case 'b':
                bom = bom + 1;
                soma = idade + idade;
                break;
            case 'c':
                otimo = otimo + 1;
                break;
            default:
                video.println("Insira apenas a, b ou c");
        }
        contador = contador + 1;
    }

    public static void somas() {
        video.println("Quantidade de pessoas que responderam Regular: " + regular);
        media = soma / bom;
        video.println("Média de idade de quem respondeu Bom: " + media + " anos.");
        porcentagem = (otimo / contador) * 100;
        video.println("Porcentagem das pessoas que responderam Ótimo: " + porcentagem + "%");
    }

    public static void saidas() {
        video.println("Quantidade de pessoas que responderam Regular: " + regular);
        video.println("Quantidade de pessoas que responderam Bom: " + bom);
        video.println("Quantidade de pessoas que responderam Ótimo: " + otimo);
    }

}
