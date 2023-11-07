package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.ParticulaHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.CalculadoraNPR;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Controle;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class OperandoHandler implements ParticulaHandler {
    
    private ParticulaHandler proximo = null;
    
    public OperandoHandler(ParticulaHandler proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula handle(CalculadoraNPR calculadora, String particula) {

        if (particula.equals("+") || particula.equals("-") || particula.equals("*") || particula.equals("/") || particula.equals("^")) {
            OperadorHandler handler = Controle.criaOperandoHandler();
            return (handler.handle(particula));
        }
        
        if (proximo != null)
            return proximo.handle(calculadora, particula);
        
        return null;
    }
    
}
