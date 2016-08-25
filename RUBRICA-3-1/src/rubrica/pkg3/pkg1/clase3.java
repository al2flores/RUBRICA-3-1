/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica.pkg3.pkg1;

/**
 *
 * @author Al2
 */
public static void Insertar()throws IOException{
        if (OpcionMiPila == 1) {
       System.out.print("\nDigite una Opción para la pila 1: ");
       String dato = entrada.readLine();
       Crear(dato);
        }
        if (OpcionMiPila == 2) {
       System.out.print("\nDigite una Opción para la pila 2 ");
       String dato = entrada.readLine();
       Crearaux(dato);
        }
    }

//metodo con error  
