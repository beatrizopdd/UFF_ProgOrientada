package Provas.P2.Q1;

import java.util.*;

public class Dicionario {
    
    private ArrayList<Palavra> palavras = new ArrayList();
    
    public Dicionario() {
    }
    
    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }
    
    // incluir palavra no dicionário
    public void incluir(Palavra palavra) {
        if (Controle.buscaPalavra(this, palavra.getGrafia()) == null) {
            palavras.add(palavra);
        } else
            System.out.println("Está no dicionário!\n");
    }

    // listar grafias e significados
    public void listar(String grafia) {
        Palavra palavra = Controle.buscaPalavra(this, grafia);
        if (palavra != null) {
            palavra.ler();
        } else
            System.out.println("Não está no dicionário!\n");
    }
}
