/*
 * Examen 3er parcial
 * @author David León Galisteo
 * .
 */
package ex18dlg;

public class Ex18dlgp1 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 1.");
    System.out.println();

    int[][] array = new int[4][7];
    int [] numMax = new int[7]; //guardará los números máximos del array bidimensional
    int pares = 0;

    //Crea el array con número aleatorios
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 7; j++) {
        array[i][j] = (int) (Math.random() * 89) + 10;
        System.out.print(array[i][j] + " ");
        
        if (array[i][j] > numMax[j]) {
          numMax[j] = array[i][j];
        }
        
        if (array[i][j] % 2 == 0) {
          pares++;
        }
        
      }
      System.out.print("| " + pares);
      pares = 0;
      System.out.println();
    }
    
    System.out.println("_________________________");
    for (int i = 0; i < 7; i++) {
      System.out.print(numMax[i] + " ");
    }
    
    
    
  }

}
