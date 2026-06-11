import java.util.Scanner;

public class ex2 {
    public static Scanner teclado;
    public static String palavraS; // palavra em string
    public static char[] palavraV; // palavra em vetor

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        System.out.println("Informe sua palavra mágica: ");
        palavraS = teclado.next();

        // convertendo de string para vetor de char;
        palavraV = palavraS.toCharArray();

        System.out.println(palavraV);
        System.out.println("Primeira letra da palavra: " + palavraV[0]); // primeira letra da palavra
        System.out.println("Tamanho da palavra?");
        System.out.println(palavraV.length); // mostra tamanho da palavra em int
        int u, i;
        u = palavraV.length - 1; // 5
        System.out.println("Última letra da palavra: " + palavraV[u]);
        for(i = u; i >= 0; i--){
            System.out.println(palavraV[i]);
        }

    }
}
