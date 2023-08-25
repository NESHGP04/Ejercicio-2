/* Ejercicio 2 - Arreglos de objetos
 * Marinés García - 23391
 * Clase
 */

//ACLARACIÓN: Se usará como clase para Lista de Espera que los empleados podrán ver

import java.util.Arrays;
import java.util.stream.IntStream;

public class Empleado2 {
    int[]estand = new int[10];
    int[]del = new int[10];
    int[]sui = new int[6];

    //Setters
    public void setCantidadEst(){
        System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera..."); 
        for(int i = 0; i < estand.length; i++){
            estand[i] = i+1;
            if(estand[i] > estand.length){
                System.out.println("\nYa no hay cupo en la lista de espera, regrese para otra oportunidad. ¡Lo esperamos!");
                break;
                }
        }
    }

    public void setCantidadDel(){
        System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera...");
                    
        for(int i = 0; i< del.length; i++){
            del[i] = i+1;
                if(del[i] > del.length){
                System.out.println("\nYa no hay cupo en la lista de espera, regrese para otra oportunidad. ¡Lo esperamos!");
                break;
                }
            }
    }

    public void setCantidadSui(){
        System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera...");
                    
        for(int i = 0; i< sui.length; i++){
            sui[i] = i+1;
                if(sui[i] > sui.length){
                    System.out.println("\nYa no hay cupo en la lista de espera, regrese para otra oportunidad. ¡Lo esperamos!");
                    break;
                }
            }
    }

    //Getters
    public int[] getCantidadEst(){
        return estand;
    }

    public int[] getCantidadDel(){
        return del;
    }

    public int[] getCantidadSui(){
        return sui; 
    }

    //Concatenar []
    public static int[] join(int[] a, int[] estand){
        return IntStream.concat(Arrays.stream(a), Arrays.stream(estand)).toArray();
    }

}
