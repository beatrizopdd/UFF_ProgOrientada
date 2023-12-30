package Provas.P2.Q1;

import java.util.*;

public class Sinonimos {
    
    // Sinônimos são coleções de palavras com um mesmo significado
    private ArrayList<Palavra> palavras = new ArrayList();
    private String significado;
    
    public Sinonimos(String significado) {
        this.significado = significado;
    }
    
    // extras
    public String getSignificado() {
        return significado;
    }
    
    public void addPalavra(Palavra palavra) {
        palavras.add(palavra);
    }
}
