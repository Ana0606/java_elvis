import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double b1, b2, b3, b4, mediaFinal; // declaração de variáveis do mesmo tipo
        String aprovado; 

        System.out.println("Informe suas 4 notas bimestrais (1b, 2b, 3b, 4b) :");
        b1 = teclado.nextDouble();
        b2 = teclado.nextDouble();
        b3 = teclado.nextDouble();
        b4 = teclado.nextDouble();

        mediaFinal = (b1+b2+b3+b4)/4;

        if (mediaFinal >= 6.0){
            aprovado = "Aprovado!";
        }
        else{
            aprovado = "Reprovado!";
        }

        if (mediaFinal > 4 || mediaFinal < 5.9){
            aprovado = "Recuperação!";
        }
        else{
            aprovado = "Reprovado!";
        }

        System.out.println("Sua média anual: "+mediaFinal);
        System.out.println(aprovado);

    }
}
