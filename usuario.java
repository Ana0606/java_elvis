import java.util.Scanner;

public class usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Senha até acertar!");

        Scanner teclado = new Scanner(System.in);

        String senha;

        do{
            System.out.println("Digite sua senha de 7 dígitos:");
            senha = teclado.nextLine();
            System.out.println("Tamanho da palavra: " + senha.length());
            if(senha.length()<6){
                System.out.println("Faltaram letras!");
            }
            if(senha.length()>6){
                System.out.println("Sobraram letras!");
            }

            if(senha.equals("devjava")){
                System.out.println("Bem vindo devjava! Bora codar JAVA");
            }
            else{
                System.out.println("Usuário Invalido! Tente novamente");
            }

        }while(!senha.equals("devjava"));
        
    }
}
