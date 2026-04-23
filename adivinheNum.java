import java.util.Scanner;

public class adivinheNum {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivinhe o número");

        float  numero, chute;
        Scanner teclado = new Scanner(System.in);

        numero = 7;

        System.out.println("Digite um número");
        chute = teclado.nextFloat();

        if (chute < numero) {
            System.out.println("Muito baixo!");
        }
        else {
            System.out.println("Muito alto!");
        }

        while (chute != numero){
            System.out.println("Digite outro número para tentar novamente:");
            chute = teclado.nextFloat();
                if (chute < numero) {
                    System.out.println("Muito baixo!");
                }
                else if (chute > numero) {
                    System.out.println("Muito alto!");
                }
                else {
                    System.out.println("Acertou! O número secreto realmente era 7!");
                }
        }
        
    }
}
