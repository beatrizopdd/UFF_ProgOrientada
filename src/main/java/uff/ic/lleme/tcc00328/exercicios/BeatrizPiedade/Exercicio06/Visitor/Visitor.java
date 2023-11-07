package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Visitor;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

/* todos esse objetos podem calcular mas cada um calcula de uma forma diferente */
public interface Visitor {
    public void visita(Numero numero);
    public void visita(Operando operando);
    public void visita(Variavel variavel);
}
