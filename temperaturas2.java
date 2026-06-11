import java.util.Scanner;

    public class temperaturas2 {
        public static Scanner teclado = new Scanner(System.in);
        public static int[] temperaturas;
        public static String cidade;

    public static void main(String[] args) throws Exception { //Método principal
        temperaturas = new int[6];
        setTemperaturas(); // definir cidade e 6 temperaturas
        getTemperaturas(); // imrpimit cidade e 6 temperaturas
        getMediaTemperaturas(); // media das 6 temperaturas
        getMaxima();
        getMinima();
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
        System.out.println("\nMédia de temperatura em °C: " + mediaT);
    }

    public static void getMaxima(){

    }

    public static void getMinima(){

    }

}

