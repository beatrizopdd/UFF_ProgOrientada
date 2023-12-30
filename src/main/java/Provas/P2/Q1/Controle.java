package Provas.P2.Q1;

import java.util.*;

public class Controle {
    
    // incluir palavra no dicionário
    public static Palavra buscaPalavra(Dicionario dicionario, String grafia) {
        for (Palavra palavra: dicionario.getPalavras()) {
            if (palavra.getGrafia().equals(grafia))
                return palavra;
        }
        return null;
    }
    
    public static void buscaSinonimo(Dicionario dicionario, Palavra palavra, String[][] significados) {
        
        List<Integer> achado = new ArrayList();
        for (Palavra p: dicionario.getPalavras()) {
            for (Sinonimos s: p.getSinonimos()) {
                for (int i = 0; i < significados.length; i++) {
                    if (s.getSignificado().equals(significados[i][1])) {
                        palavra.addSinonimo(s);
                        s.addPalavra(palavra);
                        achado.add(i);
                    }
                }
            }
        }
            
        if (achado.size() < significados.length) {
            for (int i = 0; i < significados.length; i++) {
                    if (!achado.contains(i)) {
                        if (significados[i][0] == "substantivo") {
                            Substantivo novoSinonimo = new Substantivo(significados[i][1]);
                            palavra.addSinonimo(novoSinonimo);
                            novoSinonimo.addPalavra(palavra);
                        } else {
                            Verbo novoSinonimo = new Verbo(significados[i][1]);
                            palavra.addSinonimo(novoSinonimo);
                            novoSinonimo.addPalavra(palavra);
                        }
                    }
            }
        }
        
        
        
    }
}
