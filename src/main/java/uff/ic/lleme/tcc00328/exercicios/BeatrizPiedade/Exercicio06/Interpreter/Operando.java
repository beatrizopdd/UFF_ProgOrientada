package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor.*;

public abstract class Operando extends Particula implements Visitable {
    
    private String simbolo;
    
    public Operando(String simbolo) {
        this.simbolo = simbolo;
    }
    
    @Override
    public String getNome() {
        return simbolo;
    } 
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visita(this);
    }
    
}
