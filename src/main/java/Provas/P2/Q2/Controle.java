package Provas.P2.Q2;

import java.util.*;

public class Controle {
    
    public static void imprimeArrayList(ArrayList<Double> lista) {
        for (Double numero: lista)
            System.out.print(numero + " ");
        System.out.println();
    }
    
    public static void preencheArrayList(ArrayList<Double> lista, double tamanho) {
        for (int i = 1; i < tamanho+1; i++)
            lista.add(tamanho * i);
        imprimeArrayList(lista);
    }
    
}
