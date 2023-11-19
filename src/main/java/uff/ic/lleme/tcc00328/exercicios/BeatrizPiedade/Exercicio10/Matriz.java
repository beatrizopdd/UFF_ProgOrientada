package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio10;

import java.util.*;

public class Matriz {
    private int[][] matriz;
    private int ordem;
    private int determinante = 0;
    
    public Matriz(int ordem) {
        this.ordem = ordem;
        matriz = new int[ordem][ordem];
    }
    
    public void setMatriz(int[][] matriz) throws InterruptedException {
        if (matriz.length == ordem) {
            this.matriz = matriz;
            Determinante.calcula(this);
        }
        else
            System.out.println("Tamanho inválido!");
    }
    
    public void setDeterminante(int valor) {
        determinante += valor;
    }
    
    public int[][] getMatriz() {
        return matriz;
    }
    
    public int getOrdem() {
        return ordem;
    }
    
    public int getDeterminante() {  
        return determinante;
    }
    
}
