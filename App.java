import java.util.Scanner;

public class App {
    public static Scanner teclado; // objeto da Classe Scanner
    public static Aluno discente; // objeto da Classe Aluno que criamos

    public static void main(String[] args) throws Exception {
        System.out.println("Cadastro de alunos!");
        teclado = new Scanner(System.in); // inicializa meu teclado
        discente = new Aluno(); // inicializa meu aluninho
        System.out.println("Informe Nome, Turma, Idade e Média do discente: ");
        // informando dados do discente do teclado direto para o atributo
        discente.nome = teclado.next();
        discente.turma = teclado.next();
        discente.idade = teclado.nextInt();
        discente.media = teclado.nextDouble();
        discente.conceito = teclado.next().charAt(0);
        discente.animal = teclado.next();
        System.out.println("Nome: " + discente.nome);
        System.out.println("Turma: " + discente.turma);
        System.out.println("Idade: " + discente.idade);
        System.out.println("Média: " + discente.media);
        System.out.println("Conceito: " + discente.conceito);
        System.out.println("Nome do animal: " + discente.animal);
    }
}
