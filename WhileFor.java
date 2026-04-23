public class WhileFor {
    public static void main(String[] args) throws Exception {
        System.out.println("Contador");

        int valor;

        //Estrutura do For
        System.out.println("For");
        for (valor = 1; valor <= 20; valor++) {
            System.out.println(valor);
        }

        //Estrutura do while
        System.out.println("While");
        valor = 1; // inicializa variável 
        while (valor <= 20){
            System.out.println(valor);
            valor = valor + 1;
        }
    }
}
