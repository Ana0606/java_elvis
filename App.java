import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int anoNasc, idade, aposenta; // variável do ano de nascimento - número inteiro
        double renda; // variável de renda - número real
        boolean dev; // variável lógica se você é programador - true ou false
        String nome;  // variável que pergunta o nome do programador
        char genero;  // variável que define o gênero da pessoa
        Scanner teclado = new Scanner(System.in); // instalar entrada
        PrintStream video = new PrintStream(System.out); 
        
        // entrada de variáveis
        video.println("Calculadora de Idade!"); // mensagem para usuário
        video.println("Qual seu nome?");
        nome = teclado.next(); // faz leitura da string nome - entrada
        video.println("Você é programador?");
        dev = teclado.nextBoolean(); 
        video.println("Qual seu gênero? (letra:)");
        genero = teclado.next().charAt(0); // forma mais adequada de ler um caracter - char
        video.println("Qual sua renda mensal?");
        renda = teclado.nextDouble();
        video.println("Em que ano nasceu?");
        anoNasc = teclado.nextInt();
        // procedimentos lógicos e aritméticos: 
        idade = 2026 - anoNasc; // diz a idade que completa esse ano
        renda = renda*13; //renda anual total básica com décimo terceiro:
        if(genero=='m'){ // teste para ver quanto tempo aposenta
            aposenta=70-idade; // daqui quanto tempo aposenta-se masculino
        }
        else{
            aposenta=65-idade; // previsão de aposentadoria
        }
        
        // procedimentos de saída:
        video.println(nome+" este ano você completa "+idade+" anos.");
        video.println("Sua renda anual é de: R$"+renda);
        video.println("Faltam "+aposenta+" anos para se aposentar");
    }
}
