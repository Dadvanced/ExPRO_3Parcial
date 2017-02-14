package ex18dlgp3;

/**
 * Examen 3er parcial
 *
 * @author David León Galisteo
 */
public class Ex18dlgp3 {

  public static void main(String[] args) {
    Tique t1 = new Tique(10, 5);
    Tique t2 = new Tique(14, 30);
    Tique t3 = new Tique(15, 00);
    t1.paga(11, 00);
    t3.paga(17, 45);
    t2.paga(18, 20);
    System.out.printf("Recaudación: %.2f euros.", Tique.getRecaudacion());
  }
  
}
