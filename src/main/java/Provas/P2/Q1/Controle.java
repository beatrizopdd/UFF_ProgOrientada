package Provas.P2.Q1;

public class Controle {
    
    public static Palavra buscaPalavra(Dicionario dicionario, String grafia) {
        for (Palavra palavra: dicionario.getPalavras()) {
            if (palavra.getGrafia().equals(grafia))
                return palavra;
        }
        return null;
    }
    
    public static void buscaSinonimo(Palavra palavra, String significado) {
        int encontrado = 0;
        for (Palavra p: Main.dicionario.getPalavras())
            for (Sinonimos s: p.getSinonimos())
                if (s.getSignificado().equals(significado)) {
                    s.addPalavra(palavra);
                    palavra.addSinonimo(s);
                    encontrado = 1;
                }
        
        if (encontrado == 0) {
            Sinonimos novo = new Sinonimos(significado);
            novo.addPalavra(palavra);
            palavra.addSinonimo(novo);
        }
    }
}
