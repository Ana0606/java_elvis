import java.util.Scanner;

public class cofrinho {
    public static void main(String[] args) throws Exception {
        System.out.println("Adivinhe o número");

        float  meta, valor, total;
        Scanner teclado = new Scanner(System.in);

        meta = 100;
        total = 0;

        while (total < meta){
            System.out.println("Quanto irá depositar?");
            valor = teclado.nextFloat();
            total = total + valor;
            System.out.println("Valor acumulado " + "R$" + total);
        }

        System.out.println("Meta atingida!");

    }
}
