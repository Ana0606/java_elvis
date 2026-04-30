import java.util.Scanner;

public class PIN {
    public static void main(String[] args) throws Exception {
        System.out.println("Jogo do PIN!");

        Scanner teclado = new Scanner(System.in);

        int valor, mult, r;

        System.out.println("Digite um número que será o múltiplo");
        valor = teclado.nextInt();

        mult = 0;

        while (mult <= 40){
            r = valor * mult;
            mult = mult + 1;

               if (r % mult == 0){
                System.out.println("PIN");
               }
               else{
                System.out.println(r);
               }

        }
    }
}
