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
        
        for (ArrayList<Double> c: colecoes) {
            Media thread = new Media(c);
            thread.start();
        }
        
    }   
    
}
