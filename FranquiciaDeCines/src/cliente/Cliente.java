/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import butaca.Butaca;
import java.util.UUID;

/**
 *
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Cliente {
    private String id;
    private String nombre;
    private String pelicula;

    public Cliente() {
        this.id = null;
        this.pelicula = null;
    }

    public Cliente(String nombre, Butaca asiento, String pelicula) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id= " + id + ", nombre= " + nombre + ", pelicula= " + pelicula + '}';
    }
    
    
}
