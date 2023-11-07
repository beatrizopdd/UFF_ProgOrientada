package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Observer;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.CalculadoraNPR;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Controle;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class AttCalculadora implements Observer {
    
    public CalculadoraNPR calculadora;
    
    public AttCalculadora(CalculadoraNPR calculadora){
        this.calculadora = calculadora;
    }
    
    @Override
    public void atualiza(){
        String[] particulas = calculadora.particulas;
        calculadora.equacao = Controle.criaEquacao(calculadora, particulas, particulas.length-1);
        calculadora.setResultado(calculadora.equacao.interpreta());
    }
}
