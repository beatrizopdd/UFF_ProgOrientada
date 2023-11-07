package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Observer;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

/**
 *
 * @author Fred
 */
public class AttVariavel implements Observer {
    
    public Variavel variavel;
    
    public AttVariavel(Variavel variavel){
        this.variavel = variavel;
    }
    
    @Override
    public void atualiza(){
        System.out.println(variavel.getNome() + " teve seu valor alterado para " + variavel.getValor() + "\n");
    }
    
}
