package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio06;

public class Main {
    
    
    
    public static void main(String[] args) {
        
        CalculadoraNPR calculadora;
        
        // 1) Transformar um string em uma representação orientada a objetos da expressão
        String linha = "2 _a * _b + _b *";
        calculadora = new CalculadoraNPR(linha);
        
        
        // 2) Inicialização das variáveis
        calculadora.addVariavel("_a", 5);
        calculadora.addVariavel("_b", 2);
        
        
        // 3) Listar variáveis
        calculadora.imprimeVariaveis();
        
        
        // 4) Calcular valor da expressão
        System.out.println("->> " + calculadora.getResultado() + "\n");
        
        
        calculadora.attVariavel("_b", 4);
        
        System.out.println("->> " + calculadora.getResultado() + "\n");
        
        calculadora.addVariavel("_c", 4);
        
        calculadora.attEquacao("_c _b * 3 +");
        System.out.println("->> " + calculadora.getResultado() + "\n");
       
    }
}
