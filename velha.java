import java.util.Scanner;

public class velha {
    public static char velha[][];
    public static Scanner teclado;
    public static int jogadas;

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        velha = new char[3][3];
        char Player = 'X'; // primeiro a jogar é o X
        System.out.println("Jogo da velha do Tofu dydo");

        zerarVelha();
        for(jogadas=1; jogadas<=9; jogadas++){
            imprimeVelha();
            jogar(Player);
            Player = (Player == 'X')? 'O': 'X'; // qualificador ternário!
        }
        System.out.println("GAME OVER!!!");
        imprimeVelha();
    }

    public static void jogar(char Player){
        int L, C;
        boolean repetir = true;
        do{
            System.out.printf("\n\nJogador %c informe Linha e Coluna: \n", Player);
            L = teclado.nextInt();
            C = teclado.nextInt();
                if(L<3 && C<3){ // linha e coluna válida
                    if(velha[L][C] == '.'){
                        velha[L][C] = Player;
                        repetir = false;
                    }
                    else{
                        System.out.println("Jogada inválida... Tente novamente");
                    }
                }
                else{
                    System.out.println("Posição inválida... Tente novamente (0, 1 ou 2)");
                }
        }while(repetir);
        
    } 

    public static void zerarVelha(){
        int L, C;
        for(L=0; L<3; L++){
            for(C=0; C<3; C++){
                velha[L][C] = '.';
            }
        }
    }

    public static void imprimeVelha(){
        int L, C;
        for(L=0; L<3; L++){
            System.out.println(" ");
            for(C=0; C<3; C++){
                System.out.print(" " + velha[L][C]);
            }
        }
    }
}
