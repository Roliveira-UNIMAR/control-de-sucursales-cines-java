/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala;

/**
 *
 * @author Rodrigo Oliveira - 29.655.609
 */
public class Sala {
    char[][] butacas;
    String[] peliculasProyectar;

    public Sala() {
        this.butacas = null;
        this.peliculasProyectar = null;
    }
    
    public Sala(int nColumnas, int nFilas) {
        this.butacas = new char[nColumnas][nFilas];
    }
    
    public Sala(int nColumnas, int nFilas, String[] pp) {
        this.butacas = new char[nColumnas][nFilas];
        this.peliculasProyectar = pp;
    }
    
    public void rellenarSala() {
        for (int i = 0; i < this.butacas.length; i++) {
            for (int j = 0; j < this.butacas[i].length; j++) {
                this.butacas[i][j] = ' ';
            }
        }
    }

    public char[][] getButacas() {
        return this.butacas;
    }

    public void setButaca(int nColumna, int nFila) {
        this.butacas[nColumna][nFila] = '*';
    }
    
    public boolean agotada() {
        for (int i = 0; i < this.butacas.length; i++) {
            for (int j = 0; j < this.butacas[i].length; j++) {
                if (this.butacas[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public String getPeliculasProyectar() {
        String string = "";
        for(int i = 0; i < peliculasProyectar.length; i++) {
            string = "pelicula" + (i+1) + ": " + peliculasProyectar[i] + "\n";
        }
        return string;
    }

    public void setPeliculasProyectar(String[] peliculasProyectar) {
        this.peliculasProyectar = peliculasProyectar;
    }
    
    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < this.butacas.length; i++) {
            for (int j = 0; j < this.butacas[i].length; j++) {
                string = string + "[" + this.butacas[i][j] + "] " ;
            }
            string = string + "\n";
        }
        string = string + "\n";
    return string;
    }
    
}
