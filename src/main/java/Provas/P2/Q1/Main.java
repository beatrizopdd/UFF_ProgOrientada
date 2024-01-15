package Provas.P2.Q1;

public class Main {
    
    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();
        
        // palavras para incluir
        String g1 = "livro";
        String s1[][] = {{"substantivo", "coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são unidos por meio de cola, costura etc., formando um volume que se recobre com capa resistente."}, {"substantivo", "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.]."}};
        String f1 = "lˈi.vɾu";
        
        String g2 = "obra";
        String s2[][] = {{"substantivo", "aquilo que resulta de um trabalho, de uma ação."}, {"substantivo", "obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.]."}};
        String f2 = "ˈɔ.bɾɐ";
        
        String g3 = "ação";
        String s3[][] = {{"substantivo", "aquilo que resulta de um trabalho, de uma ação."}};
        String f3 = "ɐ.sˈɐ̃w";
        
        // incluir palavras a partir da classe Dicionário
        dicionario.incluir(g1, s1, f1);
        dicionario.incluir(g1, s1, f1);
        dicionario.incluir(g2, s2, f2);
        dicionario.incluir(g3, s3, f3);
        
        // listar grafias e significados
        dicionario.listar();
        
    }
}
