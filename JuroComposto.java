import java.io.PrintStream;
import java.util.Scanner;

public class JuroComposto {
    private static Scanner teclado = new Scanner(System.in);
    private static PrintStream video = new PrintStream(System.out);
    private static String aplicacao;
    private static double meses;
    private static double juros;
    private static double capital;
    private static double montante;

    public static void main(String[] args) throws Exception {
        video.println("**Programa de rendimentos");
        //entradas
        aplicacao = escolherAplicacao();
        video.println("Você escolheu: " + aplicacao);
        setValoresRendimento();
        //lógica aritmética
        getMontanteMensal();
        //saída
        video.println("Obrigado por escolher o banco Tofu!");
    }

    public static void setValoresRendimento(){
        video.println("Qual o capital inicial?");
        capital = teclado.nextDouble();
        video.println("Qual o número de meses?");
        meses = teclado.nextDouble();
        video.println("Qual o juro?");
        juros = teclado.nextDouble();
    }

    public static void getMontanteMensal(){
        int mesAmes;
        double resultado = capital;

        for(mesAmes = 1; mesAmes<=meses; mesAmes++){
            resultado = resultado + (resultado * (juros/100));
            video.print("Montante mês " + mesAmes);
            video.printf(": R$ %.2f \n", resultado);
        }
    }

    public static String escolherAplicacao(){
        String minhaAplicacao;
        System.out.println("Qual aplicação deseja?");
        System.out.println("\n a.CBD\n b.RDB\n c.Cripto\n d.Fundos\n");
        System.out.println("Informe sua opção: ");
        switch (teclado.next().charAt(0)){
            case 'a': minhaAplicacao = "CDB"; // 1.2/100 ao mês
                break;
            case 'b' : minhaAplicacao = "RDB"; // 0.83/100 ao mês
                break; 
            case 'c': minhaAplicacao = "CRIPTO"; // aleatório entre 2 e 8% ao mês
                break;
            default: minhaAplicacao = "FUNDOS"; // 0.70/100 ao mês
            // inserir poupança e atualizar default para digitação do usuário + rodar mais de uma vez até o usuário desjar sair 
        }
        return minhaAplicacao;

    }
}
