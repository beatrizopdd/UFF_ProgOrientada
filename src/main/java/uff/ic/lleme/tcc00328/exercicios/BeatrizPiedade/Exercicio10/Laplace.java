
public class Laplace() {

  private int determinante;
  private int[][] matriz;

  public Laplace(int[][] matriz) {
    determinante = 0;
    this.matriz = matriz;
  }

  public int calcula() {
    int somatorio = matriz[0][0]*matriz[1][1] - matriz[0][1]*matriz[1][0];
    return somatorio;
  } 
  
  public void r() {
    
    
  }


  
}
