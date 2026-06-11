import java.util.Scanner;

    public class temperaturas {
        public static Scanner teclado = new Scanner(System.in);
        public static double[] temperaturas;
        public static double media;
        public static String cidade;

    public static void main(String[] args) throws Exception { //Método principal
        temperaturas = new double[6]; // Aloca memória para 6 doubles
        System.out.println("Insira o nome da sua cidade");
        cidade = teclado.nextLine();
        System.out.println("Informe as temperaturas");
        temperaturas[0] = teclado.nextDouble();
        temperaturas[1] = teclado.nextDouble();
        temperaturas[2] = teclado.nextDouble();
        temperaturas[3] = teclado.nextDouble();
        temperaturas[4] = teclado.nextDouble();
        temperaturas[5] = teclado.nextDouble();

        System.out.println("Cidade escolhida: " + cidade);
        media = (temperaturas[0] + temperaturas[1] + temperaturas[2] + temperaturas[3] + temperaturas[4] + temperaturas[5])/6;
        System.out.println("A média de temperatura na semana é de: " + media);
        System.out.println("Temperaturas registradas: " + temperaturas[0] + ", " + temperaturas[1] + ", " + temperaturas[2] + ", " + temperaturas[3] + ", " + temperaturas[4] + ", " + temperaturas[5]);
        System.out.println("A maior temperatura registrada foi de: ");
        System.out.println("A menor temperatura registrada foi de: ");
    }

}

