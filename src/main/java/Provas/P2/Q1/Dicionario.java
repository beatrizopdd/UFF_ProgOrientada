package Provas.P2.Q1;

import java.util.*;

public class Dicionario {
    
    private ArrayList<Palavra> palavras = new ArrayList();

    // incluir palavra no dicionário
    public void incluir(String grafia, String[][] significados, String fonetica) {
        // se não está no dicionário
        if (Controle.buscaPalavra(this, grafia) == null) {
            // cria a palavra
            Palavra novaPalavra = new Palavra(grafia, fonetica);
            // adiciona significado e busca sinonimos
            Controle.buscaSinonimo(this, novaPalavra, significados);
            // inclui no dicionario
            palavras.add(novaPalavra);
            
        } else
            System.out.println("Está no dicionário!\n");
    }
    
    // listar grafias e significados
    public void listar() {
        for (Palavra palavra: palavras) {
            System.out.println(palavra.getGrafia());
            int indice = 1;
            for (Sinonimos sinonimo: palavra.getSinonimos()) {
                System.out.println("Significado " + indice++);
                System.out.println("   - " + sinonimo.getSignificado());
            }
            System.out.println();
        }
    }
    
    // extras
    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }
}
