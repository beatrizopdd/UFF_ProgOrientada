package Provas.P2.Q1;

import java.util.*;

public class Sinonimos {
    
    // Sinônimos são coleções de palavras com um mesmo significado
    private ArrayList<Palavra> palavras = new ArrayList();
    private String significado;
    
    public Sinonimos() {
    }
    
    public Sinonimos(String significado) {
        this.significado = significado;
    }
    
    public void addPalavra(Palavra palavra) {
        palavras.add(palavra);
    }
    
    public String getSignificado() {
        return significado;
    }
    
    public void ler() {
        System.out.println("'"+significado+"'");
        for (Palavra palavra: palavras)
            System.out.println("- " + palavra.getGrafia());
        System.out.println();
    }
    
}
