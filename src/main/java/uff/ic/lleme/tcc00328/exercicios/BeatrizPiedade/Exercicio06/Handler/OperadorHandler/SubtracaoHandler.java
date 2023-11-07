package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class SubtracaoHandler implements OperadorHandler {
    
    private OperadorHandler proximo = null;
    
    public SubtracaoHandler(OperadorHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public Operando handle(String particula) {
        
        if (particula.equals("-")) {
            return (new OperandoSubtracao());
        }
        
        if (proximo != null)
            return proximo.handle(particula);
        
        return null;
    
    }
    
}
