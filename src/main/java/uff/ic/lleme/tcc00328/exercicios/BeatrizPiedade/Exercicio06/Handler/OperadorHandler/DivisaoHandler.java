package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class DivisaoHandler implements OperadorHandler {
    
    private OperadorHandler proximo = null;
    
    public DivisaoHandler(OperadorHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public Operando handle(String particula) {
        
        if (particula.equals("/")) {
            return (new OperandoDivisao());
        }
        
        if (proximo != null)
            return proximo.handle(particula);
        
        return null;
    
    }
    
}
