/*Christian Gael Lara Martinez
* 06/03/2023
* Juego "Gato" Final
* */
import java.util.Scanner;
public class GatoFinalCL {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
     System.out.println("¡Hola! Bienvenido al Juego.");
     System.out.println("Escribe 9 caracteres ------ Solo --> X, O, _  -------: ");
 String cadenaCaracteres = teclado.nextLine();

 if (cadenaCaracteres.length() != 9) {
            System.out.println("Verifica la cantidad de caracteres digitada.");
            return;
        }
 for (int i = 0; i < cadenaCaracteres.length(); i++) {
            char c = cadenaCaracteres.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Estan permitidos estos caracteres: X, O, _");
                System.out.println("Intenta de nuevo");
                return;
            }
        }
 System.out.println("───────");
 System.out.println("│     │");
            System.out.println("│" + cadenaCaracteres.charAt(0) + " " + cadenaCaracteres.charAt(1) + " " + cadenaCaracteres.charAt(2) + "│");
 System.out.println("│     │");
 System.out.println("───────");
 System.out.println("│     │");
            System.out.println("│" + cadenaCaracteres.charAt(3) + " " + cadenaCaracteres.charAt(4) + " " + cadenaCaracteres.charAt(5) + "│");
 System.out.println("│     │");
 System.out.println("───────");
 System.out.println("│     │");
                 System.out.println("│" + cadenaCaracteres.charAt(6) + " " + cadenaCaracteres.charAt(7) + " " + cadenaCaracteres.charAt(8) + "│");
 System.out.println("│     │");
 System.out.println("───────");
 System.out.println("El juego ha terminado.");
    }
}