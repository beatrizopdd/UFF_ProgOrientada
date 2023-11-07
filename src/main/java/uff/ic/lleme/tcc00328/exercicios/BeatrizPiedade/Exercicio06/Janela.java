package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06;

import java.util.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor.*;

public abstract class Janela {
    
    private static Impressora impressora = new Impressora();
    
    public static void printEquacao(Particula equacao) {
        if (equacao != null) {
            printEquacao(equacao.getEsquerda()); 
            
            equacao.accept(impressora);
            
            printEquacao(equacao.getDireita());
        }
    } 
    
    public static void printVariaveis(List<Variavel> lista) {
        System.out.println("Lista de variaveis: ");
        for (Variavel variavel: lista)
            System.out.println(variavel.getNome() + " = " + variavel.getValor());
    }
}
