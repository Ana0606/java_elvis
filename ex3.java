import java.util.Scanner;

    public class ex3 {
        public static Scanner teclado = new Scanner(System.in);
        public static int[] idades;

    public static void main(String[] args) throws Exception {
        idades = new int[5];
        setIdades();
        getIdades();
        getMaiorMenor();
        getInvertida();
    }

    public static void setIdades(){
        int i; // variável local para imprimir as idades
        System.out.println("Cadastro de idades");
        System.out.println("Informe as idades");
        for(i = 0; i < 5; i++){
            idades[i] = teclado.nextInt();
        }
    }

    public static void getIdades(){
        int i;
        for(i = 0; i < 5; i++){
            System.out.print("\nIdades: " + idades[i]);
        }

    }

    public static void getMaiorMenor(){
        int maior = idades[0];
        int menor = idades[0];
        int i;

        for(i = 0; i < idades.length; i++){

            if (idades[i] > maior){
                maior = idades[i];
            }
            if (idades[i] < menor){
                menor = idades[i];
            }
        }

        System.out.println("\nIdade do mais velho: " + maior);
        System.out.println("Idade do mais novo: " + menor);
    }

    public static void getInvertida(){
        int i;

        System.out.println("\nIdades na ordem inversa:");

        for(i = idades.length - 1; i >= 0; i--){
            System.out.println(idades[i]);
        }
    }
    
}
