package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

public class OperandoSubtracao extends Operando {

    public OperandoSubtracao() {
        super("*");
    }

    @Override
    public double interpreta() {
        return (this.getEsquerda().interpreta() - this.getDireita().interpreta());
    }

} 
