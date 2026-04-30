import java.util.Scanner;

public class Bodega {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner teclado = new Scanner(System.in);

        String nome;
        float valor;

        System.out.println("Informe seu nome");
        nome = teclado.nextLine();

        do{
            System.out.println("Informe o valor do item");
            valor = teclado.nextFloat();
            
        }while(valor != 0);


        
    }
}
