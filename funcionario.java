import java.util.Scanner;

public class funcionario {
    public static int[][] funcionario;
    public static Scanner teclado;

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        funcionario = new int[3][2];
        System.out.println("Programa Tofu dydo");
        setDados(); // informa idade e salário
        getDados();
    }

    public static void setDados(){
        int i;
        for (i=0; i<3; i++){
            System.out.println("Informe idade e salário do Funcionário " + (i+1) + ":");
            funcionario[i][0] = teclado.nextInt();
            funcionario[i][1] = teclado.nextInt();
        }
    }

    public static void getDados(){
        int i;
        for (i=0; i<3; i++){
            System.out.println(
                "Funcionário " + (i+1) + ": " +
                 funcionario[i][0] + " anos de idade com salário de R$" + 
                 funcionario[i][1] 
            );
        }
    }
    
}
