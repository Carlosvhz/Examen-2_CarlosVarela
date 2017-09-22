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
public class Usuario {
    
    private String nombre, username, password;
    private int edad;
    private ArrayList<Cancion> favoritos = new ArrayList();
    private ArrayList<PlayList> playLists = new ArrayList();

    public Usuario(String nombre, String username, String password, int edad) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public ArrayList<Cancion> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Cancion> favoritos) {
        this.favoritos = favoritos;
    }

    public ArrayList<PlayList> getPlayLists() {
        return playLists;
    }

    public void setPlayLists(ArrayList<PlayList> playLists) {
        this.playLists = playLists;
    }
    
    
}
