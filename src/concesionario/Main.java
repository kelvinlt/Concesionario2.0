/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import utilidades.Utilidades;

/**
 *
 * @author DAM
 */
public class Main {
    private static ArrayList<Coche> coches;
        public static void main(String[] args) {
            coches = new ArrayList<>();
            int opcion=0;
            
            do{
            mostrarMenu();
            opcion = Utilidades.pedirEntero("Escoje una opcion:");
            if(opcion <=0||opcion>5){
                System.out.println("Escoje una opcion dentro de los parametros");
            }
            
            }while(opcion !=5);
            
            
    }
    public static void mostrarMenu(){
        System.out.println("====== Menu Principal ======");
        System.out.println("1.Nuevo coche");
        System.out.println("2.Modificar coche");
        System.out.println("3.Borrar coche");
        System.out.println("4.Listado de coches");
        System.out.println("5.Salir");
    }
    
}
