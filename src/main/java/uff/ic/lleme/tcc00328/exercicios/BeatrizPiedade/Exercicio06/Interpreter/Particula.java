package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor.*;

public abstract class Particula {
    
    private Particula esquerda = null;
    private Particula direita = null;
    
    public void setEsquerda(Particula esquerda) {
        this.esquerda = esquerda; 
    }
    
    public void setDireita(Particula direita) {
        this.direita = direita; 
    }
    
    public Particula getEsquerda() {
        return (this.esquerda);
    }
    
    public Particula getDireita() {
        return (this.direita);
    }
    
    public abstract String getNome();
    
    public abstract double interpreta();
    
    public abstract void accept(Visitor visitor);
    
}