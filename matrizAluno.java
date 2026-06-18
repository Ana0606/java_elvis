public class matrizAluno {
    static int[][] notas; // criação da matriz global
    
    public static void main(String[] args) throws Exception {
        // aloca matriz 3 linhas x 4 colunas
        notas = new int[][]{
                       //0 1 2 3
                   /*0*/{2,8,9,7},
                   /*1*/{9,9,6,9},
                   /*2*/{8,7,8,4},};
        System.out.println(notas[0][2]);
        // qual nota irá imprimir?
        System.out.println(notas[2][1]);
        notas[1][1] = 5;
        System.out.println(notas[1][1]);
        imprimeNotas();
    }    

    public static void imprimeNotas(){ // utiliza 2 laços para l e c
        int l, c; // variável linha e coluna
        System.out.println("             Nota1 Nota2 Nota3 Nota4");
        for (l=0; l<3; l++){ // laço para percorrer linhas
            System.out.print("\n" + (l+1) + "º Aluno: "); // informa qual aluno
            for(c=0; c<4; c++){ // laço para percorrer colunas
                System.out.print("     " + notas[l][c]);
            }
            System.out.println("\n");

        }

    }
}
