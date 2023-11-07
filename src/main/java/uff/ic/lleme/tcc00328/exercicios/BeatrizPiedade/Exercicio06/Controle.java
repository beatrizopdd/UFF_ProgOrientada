package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.OperadorHandler.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Handler.ParticulaHandler.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;

public class Controle {
    
    public static ParticulaHandler handler = Controle.criaParticulaHandler();
    
    public static Particula criaEquacao(CalculadoraNPR calculadora, String[] expressao, int indice) {
        
        Particula nova = handler.handle(calculadora, expressao[indice]);

        // Se não é um elemento terminal
        if (nova.getClass() != Numero.class && nova.getClass() != Variavel.class) {
            nova.setEsquerda(criaEquacao(calculadora, expressao, indice-2));
            nova.setDireita(criaEquacao(calculadora, expressao, indice-1)); 
        }
        
        return nova;

    }
    
    public static Variavel buscaVariavel(CalculadoraNPR calculadora, String particula) {
        
        for (Variavel variavel: calculadora.getListaVariaveis())
            if (variavel != null && variavel.getNome().equals(particula))
                return variavel;
        
        return null;
    }
    
    public static ParticulaHandler criaParticulaHandler() {
        
        ParticulaHandler constante = new ConstanteHandler(null);
        ParticulaHandler variavel = new VariavelHandler(constante);
        ParticulaHandler operador = new OperandoHandler(variavel);
        
        return operador;
        
    }
    
    public static OperadorHandler criaOperandoHandler() {
        
        OperadorHandler potenciacao = new PotenciacaoHandler(null);
        OperadorHandler divisao = new DivisaoHandler(potenciacao);
        OperadorHandler multiplicacao = new MultiplicacaoHandler(divisao);
        OperadorHandler subtracao = new SubtracaoHandler(multiplicacao);
        OperadorHandler adicao = new AdicaoHandler(subtracao);
        
        return adicao;
        
    }
    
    
}
