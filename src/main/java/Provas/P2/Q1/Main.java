package Provas.P2.Q1;

public class Main {
    
    public static Dicionario dicionario = new Dicionario();
    
    public static void main(String[] args) {
        
        // incluir palavras a partir da classe Dicionário
        Palavra p1 = new Palavra("livro", "lˈi.vɾu");
        p1.setSignificado("coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são unidos por meio de cola, costura etc., formando um volume que se recobre com capa resistente.");
        p1.setSignificado("obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].");
        dicionario.incluir(p1);
        
        Palavra p2 = new Palavra("obra", "ˈɔ.bɾɐ");
        p2.setSignificado("aquilo que resulta de um trabalho, de uma ação.");
        p2.setSignificado("obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].");
        dicionario.incluir(p2);
        
        Palavra p3 = new Palavra("ação", "ɐ.sˈɐ̃w");
        p3.setSignificado("aquilo que resulta de um trabalho, de uma ação.");
        dicionario.incluir(p3);

        dicionario.incluir(p2);

        // listar suas grafias e significados a partir da classe Dicionário
        dicionario.listar("livro");
        dicionario.listar("obra");
        dicionario.listar("ação");
        dicionario.listar("peixe");
        
        // uma mesma palavra pode pertencer a mais de uma coleção de palavras sinônimas
        System.out.println("Sinônimos de livro:");
        p1.listarSinonimos();
        
        System.out.println("Sinônimos de obra:");
        p2.listarSinonimos();
        
        System.out.println("Sinônimos de ação:");
        p3.listarSinonimos();
        
    }
}
