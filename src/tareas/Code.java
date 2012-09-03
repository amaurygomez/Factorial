/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;
import java.lang.Math.*;
/**
 *
 * @author Amaury
 */
public class Code {

    private static void Method() {
    double factorial = 1;
// El número elegido para el factorial es el 30
double numero=30;
while ( numero!=0) {
  factorial=factorial*numero;
  numero--;

    }
System.out.println(factorial);
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Code.Method();
    }
}
