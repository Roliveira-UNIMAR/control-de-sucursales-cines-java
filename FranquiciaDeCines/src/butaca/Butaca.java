/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package butaca;

import cliente.Cliente;

/**
 *
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Butaca {
    private int nColumna;
    private int nFila;
    private Cliente cliente;

    public Butaca() {
        this.nColumna = 0;
        this.nFila = 0;
        this.cliente = null;
    }
    
    public Butaca(int nColumna, int nFila, Cliente cliente) {
        this.nColumna = nColumna;
        this.nFila = nFila;
        this.cliente = cliente;
    }

    public void setButaca(int nColumna, int nFila, Cliente cliente) {
        this.nColumna = nColumna;
        this.nFila = nFila;
        this.cliente = cliente;
    }

    public int getColumna() {
        return this.nColumna;
    }

    public int getFila() {
        return this.nFila;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Butaca{" + "nColumna= " + nColumna + ", nFila= " + nFila + ", cliente= " + cliente.getNombre() + '}';
    }
    
    
    
}
