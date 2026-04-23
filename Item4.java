import java.io.PrintStream;
import java.util.Scanner;
// Identação automática: Alt+Shift+F
public class Item4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de Mensalidade com Bolsa");
        Scanner teclado = new Scanner(System.in); // entrada teclado
        PrintStream video = new PrintStream(System.out); // saída vídeo

        float mensalidade, renda, desconto, valor_final;

        System.out.println("Informe o valor da mensalidade e sua renda familiar");
        mensalidade = teclado.nextFloat();
        renda = teclado.nextFloat();

        if (renda <= 1500){
            video.println("Terá um desconto de 50%");
            desconto = mensalidade * 50/100;
            valor_final = mensalidade - desconto;
            video.println("Desconto: " + desconto);
            video.println("O valor final será de: " + valor_final);
        }
        else if (renda <= 3000){
            video.println("Terá um desconto de 25%");
            desconto = mensalidade * 25/100;
            valor_final = mensalidade - desconto;
            video.println("Desconto: " + desconto);
            video.println("O valor final será de: " + valor_final);
        }
             else {
                video.println("Sem desconto");
                valor_final = mensalidade;
                video.println("O valor final será de: " + valor_final);
             }

    }
}