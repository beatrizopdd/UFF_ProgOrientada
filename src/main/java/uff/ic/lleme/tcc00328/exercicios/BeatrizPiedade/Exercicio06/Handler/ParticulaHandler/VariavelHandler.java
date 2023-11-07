package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.ParticulaHandler;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.CalculadoraNPR;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Controle;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class VariavelHandler implements ParticulaHandler {
    
    private ParticulaHandler proximo = null;
    
    public VariavelHandler(ParticulaHandler proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula handle(CalculadoraNPR calculadora, String particula) {

        if (particula.startsWith("_")) {
            Variavel variavel = Controle.buscaVariavel(calculadora, particula);
            if (variavel == null)
                variavel = new Variavel(particula, Double.NaN);
            return variavel;
        }
        
        if (proximo != null)
            return proximo.handle(calculadora, particula);
        
        return null;
        
    }
    
}
