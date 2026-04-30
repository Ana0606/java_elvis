import java.util.Scanner;

public class portaEletronica {
    public static void main(String[] args) throws Exception {
        System.out.println("Acesso por código especial");

        Scanner teclado = new Scanner(System.in);

        int codigo;

        System.out.println("Abertura da porta eletrônica");

        do{
            System.out.println("Informe o código de acesso");
            codigo = teclado.nextInt();
             if(codigo < 1000 || codigo > 9999){
                System.out.println("Código inválido! Tente novamente");
             }
             else{
                System.out.println("Acesso liberado");
             }
        }while(codigo != 1001 && codigo != 2000 && codigo != 4321);
        
    }
}
