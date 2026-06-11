import java.util.Scanner;
import java.io.PrintStream;

public class caixaEletro {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    private static double saldo = 0, deposito, saque;

    

    public static void escolha(){
        char opcao;
        video.println("O que deseja fazer hoje?");
        video.println("Digite a opção desejada");
        video.println("\n a. Depósito \n b. Ver saldo \n c. Efetuar Saque \n d. Sair \n");
        opcao = teclado.next().charAt(0);
        switch(opcao){
            case 'a':
                deposito();
                break;
            case 'b':
                saldo();
                break;
            case 'c':
                saque();
                break;
            default:
                break;
        }

    }

    public static void deposito(){
        do{
            System.out.println("Quanto deseja depositar?");
            deposito = teclado.nextDouble();
            System.out.println("O valor do seu depósito foi de: " + deposito);
            saldo = saldo + deposito;
        }while (deposito != 0);
    }

    public static void saldo(){

    }

    public static void saque(){

    }
}