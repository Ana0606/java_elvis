import java.util.Scanner;

public class Bodegacopy {
    public static void main(String[] args) throws Exception {
        System.out.println("Padoca Espíndola");

        Scanner teclado = new Scanner(System.in);

        String nome;
        float valor, total, dinheiro, troco;

        System.out.println("Informe seu nome");
        nome = teclado.next();

        System.out.println("Informe o valor do item");
        valor = teclado.nextFloat();

        total = 0;

        while(valor != 0){
            System.out.println("Informe o valor do item");
            valor = teclado.nextFloat();
            total = valor + valor;
        }

        System.out.println("Você terá que pagar: " + total);
        System.out.println("Qual o valor em dinheiro?");
        dinheiro = teclado.nextFloat();
        troco = dinheiro - total;
        System.out.println("Troco para " + nome + " será de: " + troco);



        
    }
}
