package Provas.P2.Q1;

import java.util.*;

public class Palavra {
    private String fonetica;
    private String grafia;
    private ArrayList<Sinonimos> sinonimos = new ArrayList();
    
    public Palavra() {
    }
    
    public Palavra(String grafia, String fonetica) {
        this.grafia = grafia;
        this.fonetica = fonetica;
    }
    
    public void addSinonimo(Sinonimos sinonimos) {
        this.sinonimos.add(sinonimos);
    }
    
    public void setSignificado(String significado) {
        Controle.buscaSinonimo(this, significado);
    }
    
    public String getGrafia() {
        return grafia;
    }
    
    public ArrayList<Sinonimos> getSinonimos() {
        return sinonimos;
    }
    
    // listar grafia e significados
    public void ler() {
        System.out.println(grafia + " (" + fonetica + ") ");
        for (int i = 0; i < sinonimos.size(); i++)
            System.out.printf("significado %d: %s\n", i+1,sinonimos.get(i).getSignificado()); 
        System.out.println();
    }
    
    // listar sinonimos
    public void listarSinonimos(){
        for (Sinonimos sinonimo: sinonimos)
            sinonimo.ler();
    }
}
