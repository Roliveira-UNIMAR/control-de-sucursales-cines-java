/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal;

import sala.Sala;

/**
 *
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Sucursal {
    public Sala[] salas;
    public static String[] peliculas = {"Lightyear", "Minions: nace un villano", "Sonic 2", "Jurassic World: Dominion", "Top Gun: Maverick", "La ciudad perdida", "hThe Batman", "DC Liga De Súper-Mascotas", "The Black Phone", "Doctor Strange en el Multiverso de la Locura"};

    public Sucursal() {
        this.salas = null;
    }
    
    public Sucursal(Sala[] salas) {
        this.salas = salas;
    }
    
    
}
