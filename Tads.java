import java.util.Scanner;

public class Tads {
    public static Scanner teclado;
    public static Aluno turma[];

    public static void main(String[] args) {
        System.out.println("Criando 4 alunos!");
        teclado = new Scanner(System.in);
        turma = new Aluno[30]; // criando turma com 30 alunos

        setTurma(4); // gravando 4 alunos na turma
    }

    public static void setTurma(int n){ // gera turma com n alunos
    int i; // contador
        for(i = 0; i < n; i++){
            turma[i] = new Aluno();
            System.out.println("Informe nome e conceito do aluno!" + i);
            turma[i].nome = teclado.next();
            turma[i].conceito = teclado.next().charAt(0);
        }

    }
}