/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patrondecorator.vista;

import com.mycompany.patrondecorator.modelo.Iviaje;
import com.mycompany.patrondecorator.modelo.planAmazingHawaii;
import com.mycompany.patrondecorator.modelo.planFamilia;
import com.mycompany.patrondecorator.modelo.planNature;
import com.mycompany.patrondecorator.modelo.planPearlHarbor;
import com.mycompany.patrondecorator.modelo.planViajeBasico;
import java.util.Scanner;

/**
 *
 * @author ledya
 */
public class mainDecorador {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("--------------------------------------");

       System.out.println("¡Bienvenido a Limitless Travel!");
       System.out.println("--------------------------------------");
       System.out.println("Seleccione el tipo de paquete turístico que desea configurar:");
       System.out.println("1. Paquete por persona");
       System.out.println("2. Paquete familiar");
       System.out.println("--------------------------------------");
       System.out.print("Elija una opción: ");

       int opcion = scanner.nextInt();

       Iviaje paquete = new planViajeBasico();

       switch (opcion) {
           case 1:
               paquete = configurarPaquetePorPersona(paquete);
               break;
           case 2:
               paquete = configurarPaqueteFamiliar(paquete);
               break;
           default:
               System.out.println("Opción no válida");
               break;
       }

       System.out.println("Su paquete turístico elegido es:");
       System.out.println("--------------------------------------");
       System.out.println(paquete.getDescripcion());
       System.out.println("Duracion: "+paquete.obtenerDuracion()+" dias");
       System.out.println("Precio: $" + paquete.obtenerPrecio());
       System.out.println("--------------------------------------");
   }

   public static Iviaje configurarPaquetePorPersona(Iviaje paquete) {
       Scanner scanner = new Scanner(System.in);
       int opcion;

       do {
           System.out.println("Seleccione una actividad adicional:");
           System.out.println("--------------------------------------");
           System.out.println("1. Pearl Harbor");
           System.out.println("2. Nature");
           System.out.println("3. Amazing Hawaii");
           System.out.println("4. Finalizar");
           System.out.println("--------------------------------------");
           System.out.print("Elija una opción (1-4): ");
           opcion = scanner.nextInt();

           switch (opcion) {
               case 1:
                   paquete = new planPearlHarbor(paquete) ;
                   break;
               case 2:
                   paquete = new planNature(paquete);
                   break;
               case 3:
                   paquete = new planAmazingHawaii(paquete);
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Opción no válida");
                   break;
           }
       } while (opcion != 4);

       return paquete;
   }

   public static Iviaje configurarPaqueteFamiliar(Iviaje paquete) {
    Scanner scanner = new Scanner(System.in);
    int opcion;
    int numIntegrantes;

    System.out.print("Ingrese el número de integrantes: ");
    numIntegrantes = scanner.nextInt();

    do {
        System.out.println("Seleccione una actividad adicional para la familia:");
        System.out.println("--------------------------------------");
        System.out.println("1. Pearl Harbor");
        System.out.println("2. Nature");
        System.out.println("3. Amazing Hawaii");
        System.out.println("4. Finalizar");
        System.out.println("--------------------------------------");
        System.out.print("Elija una opción (1-4): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                paquete = new planPearlHarbor(paquete);
                break;
            case 2:
                paquete = new planNature(paquete);
                break;
            case 3:
                paquete = new planAmazingHawaii(paquete);
                break;
            case 4:
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    } while (opcion != 4);

    
    paquete = new planFamilia(paquete, numIntegrantes);

    return paquete;
}

    
        
}
