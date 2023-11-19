package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio10;

public class Sarrus extends Thread {
    
    private Matriz matriz;
    private int coluna;
    
    public Sarrus(Matriz matriz, int coluna) {
        this.matriz = matriz;
        this.coluna = coluna;
    }
    
    @Override
    public void run() {
        
        int[][] M = matriz.getMatriz();
        int direita = 1;
        int esquerda = -1;

        int lD = 0;
        int lE = matriz.getOrdem() - 1;
        
        int c = coluna;

        for (int i = 0; i < matriz.getOrdem(); i++) {
            direita *= M[lD++][c % matriz.getOrdem()];
            esquerda *= M[lE--][c++ % matriz.getOrdem()];
        }
        
        matriz.setDeterminante(direita + esquerda);
    }
}
