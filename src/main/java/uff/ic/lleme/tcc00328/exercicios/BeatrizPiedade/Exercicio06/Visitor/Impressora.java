package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class Impressora implements Visitor {

    @Override
    public void visita(Numero numero) {
        System.out.print(" " + numero.getValor() + " ");
    }

    @Override
    public void visita(Operando operando) {
        System.out.print(" " + operando.getNome() + " ");
    }

    @Override
    public void visita(Variavel variavel) {
        System.out.print(" " + variavel.getNome() + "(" + variavel.getValor() + ") ");
    }
    
}
