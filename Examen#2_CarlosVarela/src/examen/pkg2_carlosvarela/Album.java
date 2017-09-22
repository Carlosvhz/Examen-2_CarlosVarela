/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosvarela;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Album implements Serializable{
    
    private String nombre, artista;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public void añadirCancion (Cancion cancion){
        this.canciones.add(cancion);
    }

    @Override
    public String toString() {
        return "Album: "+nombre+"| Artista: "+artista;
    }
    
    
}
