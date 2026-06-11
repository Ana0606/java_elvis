import java.io.PrintStream;
import java.util.Scanner;

public class juroComposto {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    private static String aplicacao;
    private static double meses;
    private static double juros;
    private static double capital;
    private static double montante;

    public static void main(String[] args) throws Exception {
        video.println("Programa de rendimentos");
        //entradas
        aplicacao = escolherAplicacao();
        video.println("Você escolheu: " + aplicacao);
        char opcao;

        do{
            opcao = escolherAplicacao().charAt(0);
        }while (opcao == 'g');

        video.println("Obrigado por escolher o banco Tofu!");
    }

    public static void setValores(){
        video.println("Qual o capital inicial?");
        capital = teclado.nextDouble();
        video.println("Qual o número de meses?");
        meses = teclado.nextDouble();
        video.println("Calculando seu rendimento...");
    }

    /* 
    public static void getResultadoMensal(){
        int mesAmes;
        double resultado = capital;

        for(mesAmes = 1; mesAmes<=meses; mesAmes++){
            resultado = resultado + (resultado * (juros/100));
            video.print("Montante mês " + mesAmes);
            video.printf(": R$ %.2f \n", resultado);
        }
    }
    */

    public static String escolherAplicacao(){
        String minhaAplicacao;
        System.out.println("Qual aplicação deseja?");
        System.out.println("\n a.CBD\n b.RDB\n c.Cripto\n d.Fundos\n e.Poupança\n f.Inserir valores\n g.Sair\n");
        System.out.println("Informe sua opção: ");
        switch (teclado.next().charAt(0)){
            case 'a': minhaAplicacao = "CDB"; // 1.2/100 ao mês
            video.println("Rendimento do CDB: 1.2%");
            setValores();
            opCDB();
                break;
            case 'b' : minhaAplicacao = "RDB"; // 0.83/100 ao mês
            video.println("Rendimento do RDB: 0.83%");
            setValores();
            opRDB();
                break; 
            case 'c': minhaAplicacao = "CRIPTO"; // aleatório entre 2 e 8% ao mês
            video.println("Rendimento da CRIPTO: 2%");
            setValores();
            opCripto();
                break;
            case 'd': minhaAplicacao = "FUNDOS"; // 0.70/100 ao mês
            video.println("Rendimento do FUNDOS: 0.70%");
            setValores();
            opFundos();
                break;
            case 'e': minhaAplicacao = "POUPANÇA"; // 0,5/100 ao mês
            video.println("Rendimento da POUPANÇA: 0.5%");
            setValores();
            opPoupanca();
                break;
            case 'f': minhaAplicacao = "INSIRA SEUS VALORES"; 
            video.println("Insira o valor do juros");
            setValores();
            opInserir();
                break;
            default: minhaAplicacao = "SAIR"; 
            // inserir poupança e atualizar default para digitação do usuário + rodar mais de uma vez até o usuário desjar sair 
        }
        return minhaAplicacao;
    }

    public static void opCDB(){
        juros = 1.2/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

    public static void opRDB(){
        juros = 0.83/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

    public static void opCripto(){
        juros = 2.0/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

    public static void opFundos(){
        juros = 0.70/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

    public static void opPoupanca(){
        juros = 0.5/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

    public static void opInserir(){
        juros = teclado.nextDouble();
        juros = juros/100;
        montante = capital * Math.pow(1 + juros, meses);
        video.println("O rendimento final será de: ");
        video.printf("R$ %.2f \n", montante);
    }

}