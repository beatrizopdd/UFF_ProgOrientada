package Provas.P2.Q1;

import java.util.*;

public class Palavra {
    private String fonetica;
    private String grafia;
    private ArrayList<Sinonimos> sinonimos = new ArrayList();

    public Palavra(String grafia, String fonetica) {
        this.grafia = grafia;
        this.fonetica = fonetica;
    }
    
    // extras
    public String getGrafia() {
        return grafia;
    }
    
    public ArrayList<Sinonimos> getSinonimos() {
        return sinonimos;
    }
    
    public void addSinonimo(Sinonimos sinonimos) {
        this.sinonimos.add(sinonimos);
    }
}
