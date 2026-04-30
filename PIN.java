import java.util.Scanner;

public class PIN {
    public static void main(String[] args) throws Exception {
        System.out.println("Jogo do PIN!");

        Scanner teclado = new Scanner(System.in);

        int multiplo, contador;
        multiplo = 0;

        System.out.println("Digite um número que será o múltiplo");
        multiplo = teclado.nextInt();

        contador = 0;

        while (contador < 40){
            contador = contador + 1;

               if (contador % multiplo == 0){
                System.out.print("PIN, ");
               }
               else{
                System.out.print(contador + ", ");
               }

        }
    }
}
