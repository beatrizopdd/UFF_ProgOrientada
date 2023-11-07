package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class MultiplicacaoHandler implements OperadorHandler {
    
    private OperadorHandler proximo = null;
    
    public MultiplicacaoHandler(OperadorHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public Operando handle(String particula) {
        
        if (particula.equals("*")) {
            return (new OperandoMultiplicacao());
        }
        
        if (proximo != null)
            return proximo.handle(particula);
        
        return null;
    
    }
    
}
