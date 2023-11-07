package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.ParticulaHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.CalculadoraNPR;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class ConstanteHandler implements ParticulaHandler {
    
    private ParticulaHandler proximo = null;
    
    public ConstanteHandler(ParticulaHandler proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula handle(CalculadoraNPR calculadora, String particula) {
        return (new Numero(Double.parseDouble(particula)));
    }
    
}
