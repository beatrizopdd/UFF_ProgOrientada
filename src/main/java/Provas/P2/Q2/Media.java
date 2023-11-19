package Provas.P2.Q2;

import java.util.*;

public class Media extends Thread {
    
    private ArrayList<Double> colecao;
    
    public Media(ArrayList<Double> colecao) {
        this.colecao = colecao;
    }
    
    @Override
    public void run(){
        double media = 0;
        for (Double numero: colecao)
            media += numero;
        
        media = media / colecao.size();
        
        System.out.println("Coleção " + colecao.size() + ": " + media);
    }
    
}
