import java.util.Scanner;

public class contadorRegre {
    public static void main(String[] args) throws Exception {
        System.out.println("Contador Regressivo");

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = teclado.nextInt();

        while (numero >= 0){
            System.out.println(numero);
            numero = numero - 1;
        }
            System.out.println("BOOOMMM!!!");
        
    }
}
