public class vetor {
    public static double[] nota; // Criando vetor global e definindo um tipo

    public static void main(String[] args) throws Exception { //Método principal
        nota = new double[100]; // Aloca memória para 100 doubles
        nota[0] = 8.0; // Define nota Zero
        nota[1] = 7.5; // Define nota Um
        nota[2] = 10.0; // Define nota Dois
        nota[3] = 6.0; // Define nota Três
        System.out.println(nota);

        nota[4] = (nota[0] + nota[1] + nota[2] + nota[3])/4; // média
        System.out.println(nota[4]);
        System.out.printf("%f; %.2f; %.1f", nota[0], nota[1], nota[2]);

        for (int i = 0; i <= 99; i++){
            System.out.println(nota[i]);
        }

        for (int i = 0; i < nota.length; i++){
            System.out.print("  " + nota[i]);
        }
    }
}
