/*
 * Examen 3er parcial
 * @author David León Galisteo
 * 
 */
package ex18dlgp2;

public class Ex18dlgp2 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar un array de números aleatorios y posteriormente");
    System.out.println("un número formado por todos los dígitos de ese array.");
    System.out.println();
    
    int[] array1 = new int[5];
    int[] array2 = new int[10];
    
    System.out.print("Array 1: ");
    for (int i = 0; i < 5; i++) {
      array1[i] = (int)(Math.random()*9);  
      System.out.print(array1[i] + " ");
  }
    
    System.out.println();
    System.out.print("Array 2: ");
    for (int i = 0; i < 10; i++) {
      array2[i] = (int)(Math.random()*9);
      System.out.print(array2[i] + " ");
    }
    
    System.out.println();
    long numero1 = convierteArrayEnNumero(array1);
    long numero2 = convierteArrayEnNumero(array2);
    
    System.out.println("Número resultante del primer array: " + numero1);
    System.out.println("Número resultante del segundo array: " + numero2);
   
  }
  
  
  public static long convierteArrayEnNumero(int[] n) {
    long numero = 0;
    
    for (int i = 0; i < n.length; i++) {
      numero += n[i];
      numero *= 10;
    }
    numero /= 10; //con ésta línea eliminamos de forma SENCILLA el último "numero *= 10"
    
    return numero;
  }

}
