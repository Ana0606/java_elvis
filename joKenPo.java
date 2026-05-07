import java.util.Scanner;
import java.util.Random;

public class joKenPo {
    public static void main(String[] args) throws Exception {
        System.out.println("JoKen");

        Scanner teclado = new Scanner(System.in);
        Random gerar = new Random();

        char p1, p2; // player1 e player2
        int sorteio;
        String Player2 = "j k p";

        System.out.println("Escolha: ");
        System.out.println("\n j-Pedra; \n k-Papel \n p-Tesoura \n");

        System.out.println("Player1: ");
        p1 = teclado.next().charAt(0); //primeiro caracter do player1

        sorteio = gerar.nextInt(3); //sorteia entre 0, 1 ou 2
        p2 = Player2.charAt(sorteio); //ler o caracter sorteado para o player 2
        System.out.println("Player2 jogou: " + p2);

        // Lógica e-ou Aritmética 

        if(p1 == p2){
            System.out.println("Empate");
        }
        else if(p1 == 'j' && p2 == 'k'){
            System.out.println("Player 2 ganhou: Papel cobre Pedra");
        }
        else if(p1 == 'j' && p2 == 'p'){
            System.out.println("Player 1 ganhou: Pedra quebra Tesoura");
        }
        else if(p1 == 'k' && p2 == 'j'){
            System.out.println("Player 1 ganhou: Papel cobre Pedra");
        }
        else if(p1 == 'k' && p2 == 'p'){
            System.out.println("Player 2 ganhou: Tesoura corta Papel");
        }
        else if(p1 == 'p' && p2 == 'j'){
            System.out.println("Player 2 ganhou: Pedra quebra Tesoura");
        }
        else if(p1 == 'p' && p2 == 'k'){
            System.out.println("Player 2 ganhou: Tesoura corta Papel");
        }
        else{
            System.out.println("Jogada indeterminada!");
        }

    }
}
