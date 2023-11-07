package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

public class OperandoDivisao extends Operando {

    public OperandoDivisao() {
        super("/");
    }

    @Override
    public double interpreta() {
        return (this.getEsquerda().interpreta() / this.getDireita().interpreta());
    }

}
