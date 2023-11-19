package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio10;

import java.util.*;

public class Determinante {
    
    public static void calcula(Matriz M) throws InterruptedException {
        
        int max = M.getOrdem();
        
        switch (max) {
            case 1:
                M.setDeterminante(M.getMatriz()[0][0]);
                break;
                
            case 2:
                int determinante = M.getMatriz()[0][0]*M.getMatriz()[1][1] - M.getMatriz()[1][0]*M.getMatriz()[0][1];
                M.setDeterminante(determinante);
                break;
                
            default:
                List<Sarrus> threads = new ArrayList();
                for (int i = 0; i < max; i++)
                    threads.add(new Sarrus(M, i));
                for (Sarrus thread: threads)
                    thread.start();
                for (Sarrus thread: threads)
                    thread.join();
                break;
        }
    }
}
