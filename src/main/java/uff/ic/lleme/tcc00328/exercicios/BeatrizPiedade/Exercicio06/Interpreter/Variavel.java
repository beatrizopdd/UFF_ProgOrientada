package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Observer.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor.*;

public class Variavel extends Numero implements Visitable {
   
    private String nome;
    private AttVariavel alarme = new AttVariavel(this);
    
    public Variavel(String nome, double valor) {
        super(valor);
        this.nome = nome;
    }
    
    public void attValor(double valor) {
        this.setValor(valor);
        alarme.atualiza();
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visita(this);
    }
    
}
