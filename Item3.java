import java.io.PrintStream;
import java.util.Scanner;
// Identação automática: Alt+Shift+F
public class Item3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Conta de Energia com Faixa de Consumo");
        Scanner teclado = new Scanner(System.in); // entrada teclado
        PrintStream video = new PrintStream(System.out); // saída vídeo

        float consumo, valor_base, valor_kwh, valor_final, acrescimo; // declaração de variável

        System.out.println("Informe o consumo e o valor base do kWh");
        consumo = teclado.nextFloat();
        valor_kwh = teclado.nextFloat();

        valor_base = consumo*valor_kwh;
        
        if (valor_base <= 100){
            video.println("Sem acréscimo");
            valor_final = valor_base;
        }
        else if (valor_base > 101 && valor_base < 200){
            video.println("Acréscimo de 10%");
            acrescimo = valor_base * 10/100;
            valor_final = valor_base + acrescimo;
            }
             else { 
                video.println("Acréscimo de 20%");
                acrescimo = valor_base * 20/100;
                valor_final = valor_base + acrescimo;
            }

            System.out.println("Valor base: " + valor_base);
            System.out.println("Valor final " + valor_final);

    }
}