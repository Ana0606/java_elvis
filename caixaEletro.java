import java.util.Scanner;
import java.io.PrintStream;

public class caixaEletro {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    double saldo = 0, deposito, saque;

    public static void escolha(){
        char opcao;
        video.println("O que deseja fazer hoje?");
        video.println("Digite a opção desejada");
        video.println("\n a. Depósito \n b. Ver saldo \n c. Efetuar Saque \n d. Sair \n");
        opcao = teclado.next().charAt(0);
        switch(opcao){
            case 'a':
                video.println("Quanto deseja depositar?");
                deposito();
                break;
            case 'b':
                break;
            case 'c':
                break;
            default:
                break;
        }

    }

    public static void deposito(){
        deposito = teclado.nextDouble();
        saldo = saldo + deposito;
    }

    public static void saldo(){

    }

    public static void saque(){

    }
}