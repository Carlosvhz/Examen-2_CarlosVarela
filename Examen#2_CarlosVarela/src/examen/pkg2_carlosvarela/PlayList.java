/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosvarela;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class PlayList {
    
    private ArrayList<Cancion> Canciones = new ArrayList();
    private String nombre;
    
    public PlayList() {
    }

    public PlayList(String nombre, ArrayList canciones){
        this.nombre = nombre;
        this.Canciones = canciones;
    }
    
    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList<Cancion> Canciones) {
        this.Canciones = Canciones;
    }
    
    public void añadirCancion(Cancion cancion){
        this.Canciones.add(cancion);
    }

    @Override
    public String toString() {
        return "PlayList: "+nombre;
    }
    
    
}
