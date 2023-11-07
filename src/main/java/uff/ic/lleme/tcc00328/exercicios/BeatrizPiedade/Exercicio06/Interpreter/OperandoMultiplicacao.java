package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

public class OperandoMultiplicacao extends Operando{

    public OperandoMultiplicacao() {
        super("*");
    }

    @Override
    public double interpreta() {
        return (this.getEsquerda().interpreta() * this.getDireita().interpreta());
    }

} 
