package Provas.P2.Q2;

import java.util.*;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        List<ArrayList<Double>> colecoes = new ArrayList();
        
        for (int i = 1; i < 6; i++) {
            ArrayList<Double> colecao = new ArrayList();
            Controle.preencheArrayList(colecao, i);
            colecoes.add(colecao);
        }

        ArrayList<Media> threads = new ArrayList();
        for (ArrayList<Double> c: colecoes)
            threads.add(new Media(c));

        for (Media thread: threads)
            thread.start();

        for (Media thread: threads)
            thread.join();
        
    }   
    
}
