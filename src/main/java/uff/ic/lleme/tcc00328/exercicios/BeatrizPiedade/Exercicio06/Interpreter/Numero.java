package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor.*;

public class Numero extends Particula implements Visitable {
   
    private double valor;
    
    public Numero(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    } 
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double interpreta() {
        return (this.valor);
    }

    @Override
    public String getNome() {
        return (Double.toString(valor));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visita(this);
    }

}
