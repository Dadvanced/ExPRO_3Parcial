package ex18dlgp4;

/**
 * Examen 3er parcial
 *
 * @author David León Galisteo
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex18dlgp4 {

  public static void main(String[] args) {
    HashMap<String, String> m = new HashMap<>();

    m.put("ordenador", "computer");
    m.put("gato", "cat");
    m.put("rojo", "red");
    m.put("árbol", "tree");
    m.put("pingüino", "penguin");
    m.put("sol", "sun");
    m.put("agua", "water");
    m.put("viento", "wind");
    m.put("siesta", "siesta");
    m.put("arriba", "up");
    m.put("ratón", "mouse");
    m.put("estadio", "arena");
    m.put("calumnia", "aspersion");
    m.put("aguacate", "avocado");
    m.put("cuerpo", "body");
    m.put("concurso", "contest");
    m.put("cena", "dinner");
    m.put("salida", "exit");
    m.put("lenteja", "lentil");
    m.put("cacerola", "pan");
    m.put("pastel", "pie");
    m.put("membrillo", "quince");
    m.put("caliente", "hot");
    m.put("candente", "hot");
    m.put("abrasador", "hot");
    m.put("ardiente", "hot");
    m.put("computadora", "computer");
    m.put("frio", "cold");
    m.put("gelido", "cold");
    m.put("congelado", "freeze");
    m.put("congelador", "freeze");
    m.put("amable", "kind");
    m.put("simpatico", "kind");
    m.put("encantador", "kind");

    ///////////////////////////////////////VARIABLES/////////////////////////////////////////////////////
    Scanner n = new Scanner(System.in);
    String palabra = "";

    String valorABuscar = "";
    String significado = ""; //usaremos ésta variable cuando queramos añadir un nuevo significado
    int option = 0;
    boolean exitSubmenu = false; //usaremos éste booleano para controlar la salida de un submenu
    boolean cerrar = false; //usaremos éste boolean para cerrar el programa
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    System.out.println("Bienvenido al buscador de sinónimos.");
    while (!cerrar) {
      System.out.println("Por favor, introduzca una palabra en español (pulse INTRO para salir: ");
      System.out.println("Palabra: ");
      palabra = n.nextLine();

      if (m.containsKey(palabra)) {
        valorABuscar = m.get(palabra);
///////////////////// si la clave a buscar existe en el diccionario, imprimirá sus valores///////
        for (Map.Entry sinonimo : m.entrySet()) {
          if (valorABuscar.equals(sinonimo.getValue())) {
            System.out.println(sinonimo);
          }
        }

      } else if (valorABuscar.equals("")) {
        cerrar = true;
      } else {
        System.out.print("Lo siento, no conozco esa palabra.");
        System.out.println("Puede usted añadir esa nueva palabra al diccionario añadiendo un significado.");

        while (!exitSubmenu) {
          System.out.println("Pulse 1 si desea añadirla o 2 si desea salir");

          option = Integer.parseInt(n.nextLine());

          switch (option) {
            case 1:
              System.out.println("Escriba el significado en inglés de la palabra " + valorABuscar);
              significado = n.nextLine();

              m.put(valorABuscar, significado);
              break;

            case 2:
              exitSubmenu = true;
              break;

            default:
              System.out.println("Opción incorrecta");
          }//switch

        }//while

      }//else
    }
  }
}
