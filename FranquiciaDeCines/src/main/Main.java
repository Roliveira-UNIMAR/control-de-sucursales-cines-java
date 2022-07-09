/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sala.Sala;
import sucursal.Sucursal;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sala salasPordefecto[] = new Sala[8];
        salasPordefecto[0] = new Sala(10, 3, new String[] {Sucursal.peliculas[0], Sucursal.peliculas[1]});
        salasPordefecto[1] = new Sala(10, 3, new String[] {Sucursal.peliculas[2], Sucursal.peliculas[3]});
        salasPordefecto[2] = new Sala(10, 2, new String[] {Sucursal.peliculas[4]});
        salasPordefecto[3] = new Sala(10, 2, new String[] {Sucursal.peliculas[5]});
        salasPordefecto[4] = new Sala(10, 2, new String[] {Sucursal.peliculas[6]});
        salasPordefecto[5] = new Sala(10, 2, new String[] {Sucursal.peliculas[7]});
        salasPordefecto[5] = new Sala(10, 2, new String[] {Sucursal.peliculas[8]});
        salasPordefecto[7] = new Sala(10, 3, new String[] {Sucursal.peliculas[9]});
        
        Sucursal sucursalPordefecto = new Sucursal(salasPordefecto);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Control de Sucursal de Cine");
        
        System.out.println("[1] Registrar usuarios espectadores");
        System.out.println("[2] Revisar si una funcion esta agotada");
        System.out.print("Escoje una opcion: ");
        int option = sc.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("\nEmpieza el registro: ");
                break;
        }
            
    }
    
}
