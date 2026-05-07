import java.util.Scanner;
import java.util.Random;

public class numeroSorteado {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivinhe o número");

        int  numero, chute;
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        numero = aleatorio.nextInt(100);

        System.out.println("Digite um número");
        chute = teclado.nextInt();

        if (chute < numero) {
            System.out.println("Muito baixo!");
        }
        else {
            System.out.println("Muito alto!");
        }

        while (chute != numero){
            System.out.println("Digite outro número para tentar novamente:");
            chute = teclado.nextInt();
                if (chute < numero) {
                    System.out.println("Muito baixo!");
                }
                else if (chute > numero) {
                    System.out.println("Muito alto!");
                }
                else {
                    System.out.println("Acertou! O número secreto realmente era " + chute + " !");
                }
        }
        
    }
}
