
package guia4_ej12;

import java.util.Scanner;

/**
 * Pedir dos números,
 * crear un procedimiento EsMultiplo que valide que el primero sea múltiplo del segundo
 * e imprima si son o no múltiplos
 * @author Wendy
 */
public class Guia4_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo número");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
    }
    
    public static void EsMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    } 
}
