import java.util.Scanner;

public class idoso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        imprimeTofu();
        System.out.println("Verificação de idade \n");
        menuEscolha();

    }

    public static void imprimeTofu(){
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░      /\\_/\\\\               ░");
        System.out.println("░     ( o.o )   TOFU dydo      ░");
        System.out.println("░      > ^ <                   ░");
        System.out.println("░  GATINHO MAIS FOFO!          ░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }

    public static void menuEscolha(){
        Scanner teclado = new Scanner(System.in);
        char op;
        System.out.println("a. verificar entrada em ônibus \n" +
                           "b. calcular meia entrada \n" +
                           "c. calcular prestação de consignado \n" +
                           "d. encerrar programa \n");
        System.out.println("Digite a opção desejada");
        op = (teclado.next().charAt(0));

          switch (op){
                case 'a':
                    System.out.println("Qual sua idade?");
                    verificaOnibus(teclado.nextInt());
                    break;
                case 'b':
                    System.out.println("Qual o valor do ingresso?");
                    cinema(teclado.nextDouble());
                    break;
                case 'c':
                    System.out.println("Em que ano nasceu?");
                    break;
                default:
                    imprimeTofu();
                    System.out.println("Obrigado e até breve!");
                    break;
          } 
          return op;

    }

    public static void verificaOnibus(int idade){
        System.out.println("Sua idade: " + idade);
        if (idade > 65){
            System.out.println("Passagem gratuita! Liberado para entrar pela porta de trás do ônibus");
        }
        else {
            System.out.println("Você terá que pagar a passagem! Sinto muito!");
        }
    }

    public static void cinema(double valorIngresso){
        int anoNasc;
        System.out.println("Em que ano você nasceu?");
        anoNasc(teclado.nextInt());
        anoNasc = 2026 - anoNasc;
        if (anoNasc < 65){
            System.out.println("Você terá direito a meia entrada. O valor do ingresso será de: R$" + valorIngresso/2);
        }
        else {
            System.out.println("Você não tem direito a meia entrada" + valorIngresso);
        }
    }
    
}
