/* Ejercicio 2 - Arreglos de objetos
 * Marinés García - 23391
 * Clase
 */

import java.util.*; 

public class Cliente {
    Scanner nombre;
    Scanner huespedes;
    int regulares;
    int frecuentes;
    int vip;
    Scanner tiempo;

    // int info;
    // Scanner code;
    
    public Cliente(Scanner nombre, Scanner huespedes, Scanner tiempo){
        this.nombre = nombre;
        this.huespedes = huespedes;
        this.tiempo = tiempo; 
        //this.info = info;
    }
    
    //Setters
    public void setNombre(){
        System.out.println("\nIngresa tu nombre: ");
        String nombreLine = nombre.nextLine();

    }

    public void getHuespedes(Scanner huespedes){
        System.out.println("\nIngresa la cantidad de personas que se estarán alojando: ");
        int huespedesLine = Integer.parseInt(huespedes.next());

        if (huespedesLine >5){
            System.out.println("No se puedes hospedar más de 5 personas por habitación. ");
            return;
        }
    }

    // public void setInfo(){
    //     System.out.println("Para su seguridad, ingrese su código o carné: ");
    //     int codigo = Integer.parseInt(code.nextLine());
    //     Cliente[] info = new Cliente[codigo];
    // }

    public void getTiempo(Scanner tiempo){
        System.out.println("\nIngresa la cantidad de veces que haz visitado Binary Lodge: ");
    }

    public void setRegulares(int regulares){
        this.regulares = regulares;
    }

    public void setFrecuentes(int frecuentes){
        this.frecuentes = frecuentes;
    }

    public void setVip(int vip){
        this.vip = vip;
    }
        
    //Getters
    public int getRegulares(){
        return this.regulares;
    }

    public int getFrecuentes(){
        return this.frecuentes;
    }

    public int getVip(){
        return this.vip;
    }


    // public int getInfo(){
    //     return this.info;
    // }
}

// //Lista de espera
// class ListaEspera{

//         static class Nodo{
//             Cliente client;
//             Nodo siguiente;

//             public Nodo(Cliente client){
//                 this.client = client;
//                 this.siguiente = null;
//             }
//         }

//         Nodo incio;
//         public ListaEspera(){
//             incio = null;
//         }

//         //Agrega cliente en posición adecuada
//         public void agregarCliente(Cliente client){
//             Nodo nuevoNodo = new Nodo(client);

//             if(incio == null || client.prioridad < incio.client.prioridad){
//                 nuevoNodo.siguiente = incio;
//                 incio = nuevoNodo;
//             } else{
//                 Nodo actual = incio;
//                 while(actual.siguiente != null && actual.siguiente.client.prioridad <= client.prioridad){
//                     actual = actual.siguiente;
//                     }
//                 nuevoNodo.siguiente = actual.siguiente;
//                 actual.siguiente=nuevoNodo;
//             }
//         } 

//         //Por prioridad
//         public void atenderCliente(){
//             while(incio != null){
//                 Cliente client = incio.client;
//                 incio = incio.siguiente;
//                 System.out.println("Atendiendo a " + client.nombre);
//                 }
//             }   
        
//         // public void setToString(int info){
//         //     this.info = info;
//         // }
//         // public int ToString(){
//         //     return this.info; 
//         // }
//     }
