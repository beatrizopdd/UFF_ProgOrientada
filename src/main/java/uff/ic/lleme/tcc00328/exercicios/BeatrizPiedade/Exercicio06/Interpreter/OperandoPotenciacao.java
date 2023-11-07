package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter;

public class OperandoPotenciacao extends Operando {

    public OperandoPotenciacao() {
        super("^");
    }

    @Override
    public double interpreta() {
        double resultado = 1;
        double base = this.getEsquerda().interpreta();
        double expoente = this.getDireita().interpreta();
        boolean negativo = (expoente < 0);
        
        if (negativo)
            expoente = expoente * -1;
        
        for (int i = 0; i < expoente; i++)
            resultado = resultado * base;
           
        if (negativo)
            resultado = 1 / resultado;
        
        return (resultado);
    }

}