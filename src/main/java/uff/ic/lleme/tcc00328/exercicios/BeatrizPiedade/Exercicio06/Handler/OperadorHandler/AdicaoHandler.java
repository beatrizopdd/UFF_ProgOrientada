package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class AdicaoHandler implements OperadorHandler {
    
    private OperadorHandler proximo = null;
    
    public AdicaoHandler(OperadorHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public Operando handle(String particula) {
        
        if (particula.equals("+")) {
            return (new OperandoAdicao());
        }
        
        if (proximo != null)
            return proximo.handle(particula);
        
        return null;
    
    }
    
}
