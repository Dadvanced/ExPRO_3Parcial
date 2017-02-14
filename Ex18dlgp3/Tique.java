package ex18dlgp3;

/**
 *
 * @author David León Galisteo
 */
public class Tique {
  private int horas;
  private int minutos;
  private int numeroTique = 1; //es el número de tiquet del objeto
  private static int numTique = 1; //es el número de tiquet total de la clase
  private static double recaudacion;
  
  ////////////////////////////GETTER Y SETTER////////////////////////////////////
  public int getHoras() {
    return this.horas;
  }
  
  public int getMinutos() {
    return this.minutos;
  }
  
  public int getNumeroTique() {
    return this.numeroTique;
  }
  
  public static int getNumTique() {
    return Tique.numTique;
  }  
  
  public static int setNumTique(int n) {
    return Tique.numTique += n;
  }
  
  public static double getRecaudacion() {
    return Tique.recaudacion;
  }
  
  public static double setRecaudacion(double n) {
    return Tique.recaudacion += n;
  }
  
  ////////////////////////////////CONSTRUCTOR/////////////////////////////
  public Tique(int h, int m) {
    this.horas = h;
    this.minutos = m;
    this.numeroTique = Tique.getNumTique();
    Tique.setNumTique(1);
  }
  
  //////////////////////////////////////////////MÉTODOS/////////////////////////////
  
  public void paga(int h, int m) {
    double minutosAPagar = -1;
    double horasAPagar = 0;
    double totalAPagar = 0;
    
    if (m == 0) {
      m = 60;
    }
    
    minutosAPagar = (m - this.minutos) * 0.02;
    
    if (h - this.horas == 1) {
      horasAPagar = 0;
    } else {
      horasAPagar = (h - this.horas) * 1.2;        //1,2 € es lo que se paga en 1 hora.
    }
    
    totalAPagar = minutosAPagar + horasAPagar;
    
    System.out.printf("Tique Nº" + this.numeroTique + ". Debe pagar  %.2f euros. Gracias\n", totalAPagar);
    
    Tique.setRecaudacion(totalAPagar);
  }
  
}
