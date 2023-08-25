/* Ejercicio 2 - Arreglos de objetos
 * Marinés García - 23391
 * Main
 */

import java.util.Scanner;
import java.util.Arrays;

public class Hotel {
    public static void main(String[] args){

        //Declaración Variables
        boolean salir = true;
        int estandar = 3;
        int delux = 10 ;
        int suites = 5;

        Scanner otra = new Scanner(System.in);
        int x = 1;
        Cliente[] arrayCliente = new Cliente[x];

        //Ingreso
        System.out.println("\n<<< Bienvenido a Binary Lodge, el único hotel que te complace. >>> ");
        System.out.println("\n===¡Siga las instrucciones para reservar una habitación!===");

        while(salir){

            //Datos huéspedes
            Scanner scanNombre = new Scanner(System.in);
            Scanner scanHuespedes = new Scanner(System.in);
            Scanner scanTiempo = new Scanner(System.in);

            Cliente clientes = new Cliente(scanNombre, scanHuespedes, scanTiempo);

            clientes.setNombre();
            clientes.getHuespedes(scanHuespedes);
            clientes.getTiempo(scanTiempo);
            int tiempoLine = Integer.parseInt(scanTiempo.next());

            //Guarda info usuario en []
            for(int i = 0; i < arrayCliente.length; i++){
                arrayCliente[i] = new Cliente(scanNombre, scanHuespedes, scanTiempo);
                } 
                
                
                //Mismo tipo []
            String[] arrayClienteString = new String[arrayCliente.length];
            for(int j = 0; j < arrayCliente.length; j++){
                arrayClienteString[j] = String.valueOf(arrayCliente);
                }
            System.out.println(Arrays.toString(arrayCliente)); //#Cliente

            //Tipo de cliente
            if (tiempoLine <= 5){
                estandar --;
                System.out.print("\n Habitaciones disponibles: " + estandar + "\n"); 

                //Lista de espera estándar
                if(estandar == 0){
                    System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera...");
                    Empleado2 estEmpleado2 = new Empleado2();
                    estEmpleado2.getCantidadEst();

                    //Cambia tipo
                    String[] arrayEstString = new String[estEmpleado2.getCantidadEst().length];
                    for(int j = 0; j < estEmpleado2.getCantidadEst().length; j++){
                    arrayEstString[j] = String.valueOf(estEmpleado2.getCantidadEst());
                            }
                    
                    //Concatena []
                    String[] asignar = new String[arrayClienteString.length + arrayEstString.length];     
                    int cont = 0;
                    for(cont = 0; cont<arrayClienteString.length; cont++){
                        asignar[cont] = arrayClienteString[cont];
                        }

                    for(int a = 0; a< arrayEstString.length; a++){
                            asignar[cont] = arrayEstString[a];
                            cont++; 
                        }

                } else{
                    System.out.println("\n===Cliente Regular=== \nSu habitación tendrá un precio de $75.00 por noche.");
                    }

            } else if (tiempoLine > 5 && tiempoLine <=10){
                delux--;
                System.out.print("\n Habitaciones disponibles: " + delux + "\n"); 

                //Lista de espera Delúx
                if(delux == 0){
                    System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera...");
                    Empleado2 deluEmpleado2 = new Empleado2();
                    deluEmpleado2.getCantidadDel();

                    //Cambia tipo
                    String[] arrayDelString = new String[deluEmpleado2.getCantidadDel().length];
                    for(int j = 0; j < deluEmpleado2.getCantidadEst().length; j++){
                        arrayDelString[j] = String.valueOf(deluEmpleado2.getCantidadEst());
                    }

                    //Concatena []
                    String[] asignar = new String[arrayClienteString.length + arrayDelString.length];     
                    int cont = 0;
                    for(cont = 0; cont<arrayClienteString.length; cont++){
                        asignar[cont] = arrayClienteString[cont];
                    }

                    for(int a = 0; a< arrayDelString.length; a++){
                        asignar[cont] = arrayDelString[a];
                        cont++; 
                        }
                    } else{
                            System.out.println("\n===Cliente Frecuente=== \nSu habitación tendrá un precio de $215.00 por noche.");
                        }

            } else{
                suites--;
                System.out.print("\n Habitaciones disponibles: " + suites + "\n"); 
                
                //Lista de espera Suites
                if(suites == 0){
                    Empleado2 suiEmpleado2 = new Empleado2();
                    suiEmpleado2.getCantidadSui();
                    System.out.println("Ya no hay habitaciones disponibles. Se encontrará en lista de espera...");
                    
                    //Cambia tipo
                    String[] arraySuiString = new String[suiEmpleado2.getCantidadDel().length];
                    for(int j = 0; j < suiEmpleado2.getCantidadEst().length; j++){
                        arraySuiString[j] = String.valueOf(suiEmpleado2.getCantidadEst());
                        }

                    //Concatena[]
                    String[] asignar = new String[arrayClienteString.length + arraySuiString.length];     
                        int cont = 0;
                    for(cont = 0; cont<arrayClienteString.length; cont++){
                            asignar[cont] = arrayClienteString[cont];
                    }

                    for(int a = 0; a< arraySuiString.length; a++){
                        asignar[cont] = arraySuiString[a];
                        cont++; 
                    }
                            
                } else{
                    System.out.println("\n===Cliente VIP=== \nSu habitación tendrá un precio de $350.00 por noche.");
                    }
            }
            System.out.println("\n¿Desea hacer otra reservación? (Si/No): ");
            String otras = otra.nextLine(); 

            if(otras.equals("No")){ 
                    System.out.println("Gracias por reservar con Binary Lodge, ¡nos vemos pronto!");
                    salir = false;
                } else{
                    continue;
                    }
            otra.close();        
        }
    }
}
