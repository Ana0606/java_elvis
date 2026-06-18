import java.util.Scanner;

    public class ex1 {
        public static Scanner teclado = new Scanner(System.in);
        public static int[] temperaturas;
        public static String cidade;

    public static void main(String[] args) throws Exception { //Método principal
        temperaturas = new int[6];
        setTemperaturas(); // definir cidade e 6 temperaturas
        getTemperaturas(); // imrpimit cidade e 6 temperaturas
        getMediaTemperaturas(); // media das 6 temperaturas
        getComparacao();
    }

    public static void setTemperaturas(){
        int i; // variável local para imprimir 6 temperaturas
        System.out.println("Programa do clima");
        System.out.println("Informe sua cidade");
        cidade = teclado.nextLine();
        System.out.println("Informe as últimas 6 temperaturas registradas");
        for(i = 0; i < 6; i++){
            temperaturas[i] = teclado.nextInt();
        }
    }

    public static void getTemperaturas(){
        int i;
        System.out.println("Cidade: " + cidade);
        for(i = 0; i < 6; i++)
            System.out.printf("\nDia %d: %dºC", i, temperaturas[i]);

    }

    public static void getMediaTemperaturas(){
        int mediaT, somaT, i;
        somaT = 0;
        for(i = 0; i < 6; i++){
            somaT = somaT + temperaturas[i];
        }
        mediaT = somaT/6;
        System.out.println("\n Média de temperatura em °C: " + mediaT);
    }

    public static void getComparacao(){
        int maior = temperaturas[0];
        int menor = temperaturas[0];
        int i;

        for(i = 0; i < temperaturas.length; i++){

            if (temperaturas[i] > maior){
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor){
                menor = temperaturas[i];
            }
        }

        System.out.println("\nMaior temperatura: °C" + maior);
        System.out.println("Menor temperatura: °C" + menor);

    }

}
