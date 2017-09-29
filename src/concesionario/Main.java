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
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = Utilidades.pedirEntero("Escoje una opcion:");
            System.out.println("============================");
            System.out.println("Has escogido:");
            switch (opcion) {
                case 1:
                    System.out.println("1.Alta Coche:");
                    altaCoche();
                    break;
                case 2:
                    System.out.println("2.Modificar Coche");
                    break;
                case 3:
                    System.out.println("3.Borrar Coches");
                    break;
                case 4:
                    System.out.println("4.Mostrar Coches");
                    showCoche();
                    break;
                case 5:
                    System.out.println("5.Salir");
                    System.out.println("ADIOS");
                    System.out.println("========================");
                    break;
            }

            if (opcion <= 0 || opcion > 5) {
                System.out.println("Escoje una opcion dentro de los parametros");
            }

        } while (opcion != 5);

    }

    public static void mostrarMenu() {
        System.out.println("====== Menu Principal ======");
        System.out.println("1.Nuevo coche");
        System.out.println("2.Modificar coche");
        System.out.println("3.Borrar coche");
        System.out.println("4.Listado de coches");
        System.out.println("5.Salir");
    }

    public static void altaCoche() {
        String matricula = Utilidades.pedirCadena("Matricula");
        if (coches.contains(new Coche(matricula))) {
            System.out.println("Ya existe el coche!");
        } else {
            int cilindrada = Utilidades.pedirEntero("Cilindrada:");
            int potencia = Utilidades.pedirEntero("Potencia:");
            String motor = Utilidades.pedirCadena("Motor:");
            
            Coche nuevo = new Coche(matricula,cilindrada,potencia,motor);
            nuevo.setMatricula(matricula);
            nuevo.setCilindrada(cilindrada);
            nuevo.setPotencia(potencia);
            nuevo.setMotor(motor);
            coches.add(nuevo);
        }

    }
    
    public static void showCoche(){
    int numCoche = 1;
    for(Coche c : coches){
        System.out.println("===Coche numero:"+numCoche+" | "+c);
        numCoche++;
    }
    }

}
