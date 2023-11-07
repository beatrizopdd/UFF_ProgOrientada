package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06;

import java.util.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Interpreter.*;
import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06.Observer.*;

public class CalculadoraNPR {
    
    private AttCalculadora atualizador = new AttCalculadora(this);
    public static String[] particulas;
    public static Particula equacao;
    
    private static List<Variavel> listaVariaveis = new ArrayList();
    private static double resultado;
    
    public CalculadoraNPR(String linha) {
        particulas = linha.split(" ");
        atualizador.atualiza();
    }
    
    // metodos relacionados as variaveis
    public void imprimeVariaveis() {
        Janela.printVariaveis(listaVariaveis);
        System.out.println();
    }
    
    public List<Variavel> getListaVariaveis() {
        return listaVariaveis;
    }
    
    public void addVariavel(String nome, double valor) {
        Variavel busca = Controle.buscaVariavel(this, nome);
        if (busca == null) {
            busca = new Variavel(nome, valor);
            listaVariaveis.add(busca);
            atualizador.atualiza();
            
        } else if (Double.isNaN(busca.getValor()))
            attVariavel(nome, valor);
    }
    
    public void attVariavel(String nome, double valor) {
        for (int i = 0; i < listaVariaveis.size(); i++)
            if (listaVariaveis.get(i).getNome().equals(nome)) {
                listaVariaveis.get(i).attValor(valor);
                atualizador.atualiza();
            }
    }
    
    
    // metodos relacionados a equacao
    public void imprimeEquacao() {
        Janela.printEquacao(equacao);
        System.out.println();
    }
    
    public void attEquacao(String linha) {
        particulas = linha.split(" ");
        atualizador.atualiza();
    }
    
    
    // metodos relacionados ao resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double getResultado() {
        imprimeEquacao();
        return resultado;
    }
    
}
