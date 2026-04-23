import java.util.Scanner;

public class Multiplicador {
    public static void main(String[] args) throws Exception {
        System.out.println("Multiplicador");

        int valor, mult, r; //variáveis
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor para ser multiplicado");
        valor = teclado.nextInt();

        mult = 0;

        while (mult <= 10){
            r = valor * mult;
            System.out.println(valor + " x " + mult + " = " + r);
            mult = mult + 1;
        }

    }
}
