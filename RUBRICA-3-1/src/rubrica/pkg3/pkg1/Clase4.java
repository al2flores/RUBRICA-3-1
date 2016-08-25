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
public static void Crear(String dato)throws IOException{
      if ((Pila1.length-1)==CimaPila1){
        System.out.println("Capacidad de la pila al limite\n\n\n");
        Imprimir();
      }else{
           CimaPila1++;
           }
      Agregar(dato);
    }  
}

// metodo con erro 