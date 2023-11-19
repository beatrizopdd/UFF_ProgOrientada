package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio10;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Matriz M0 = new Matriz(1);
        Matriz M1 = new Matriz(2);
        Matriz M2 = new Matriz(3);
        Matriz M3 = new Matriz(3);
        Matriz M4 = new Matriz(3);
        Matriz M5 = new Matriz(3);
        Matriz M6 = new Matriz(3);
        
        int[][] r0 = {{50}};
        int[][] r1 = {{1, 5}, {2, 3}};
        int[][] r2 = {{1, 4, 7}, {8, 2, 5}, {6, 9, 3}};
        int[][] r3 = {{1, 9, 5}, {3, 7, 8}, {10, 4, 2}};
        int[][] r4 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] r5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r6 = {{0, 1, 2}, {1, 2, 0}, {2, 0, 1}};
        
        // dentro do setMatriz a classe Matriz chama o cálculo do determinante
        M0.setMatriz(r0);
        M1.setMatriz(r1);
        M2.setMatriz(r2);
        M3.setMatriz(r3);
        M4.setMatriz(r4);
        M5.setMatriz(r5);
        M6.setMatriz(r6);
        
        // det(M0) = 50
        System.out.println("det(M0) = " + M0.getDeterminante());
        
        // det(M1) = -7
        System.out.println("det(M1) = " + M1.getDeterminante());
        
        // det(M2) = 405
        System.out.println("det(M2) = " + M2.getDeterminante());
        
        // det(M3) = 358
        System.out.println("det(M3) = " + M3.getDeterminante());
        
        // det(M4) = 1
        System.out.println("det(M4) = " + M4.getDeterminante());
        
        // det(M5) = 0
        System.out.println("det(M5) = " + M5.getDeterminante());
        
        // det(M6) = -9
        System.out.println("det(M6) = " + M6.getDeterminante());
    }
}
