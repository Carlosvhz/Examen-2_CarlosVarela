/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosvarela;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Administrador implements Serializable{
    
    private ArrayList<Usuario> Usuarios = new ArrayList();
    private ArrayList<Album> albumes = new ArrayList();

    public Administrador() {
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }
    
    public Administrador Cargar(){
        Administrador administrador = null;
        FileInputStream fo = null;
        ObjectInputStream ob = null;
        try {
            File archivo = new File("./Datos.cmv");
            fo = new FileInputStream(archivo);
            ob = new ObjectInputStream(fo);
            administrador = (Administrador)ob.readObject();
        } catch (Exception e) {
            System.out.println("Error al cargar archivo");
            e.printStackTrace();
        }
        try {
            fo.close();
            ob.close();
        } catch (Exception e) {
            System.out.println("Error al hacer close en metodo cargar");
            e.printStackTrace();
        }
        return administrador;
    }
    
    public void Escribir(){
        Administrador administrador = new Administrador();
        administrador.setAlbumes(this.albumes);
        administrador.setUsuarios(this.Usuarios);
        FileOutputStream fo = null;
        ObjectOutputStream ob = null;
        File archivo = new File("./Datos.cmv");
            try {
                fo = new FileOutputStream(archivo);
                ob = new ObjectOutputStream(fo);
                ob.writeObject(administrador);
            } catch (Exception e) {
                System.out.println("Error al escribir objeto en metodo escribir");
                e.printStackTrace();
            }
            try {
                ob.close();
                fo.close();
            } catch (Exception e) {
                System.out.println("Error al hacer close en el metodo escribir");
                e.printStackTrace();
            }
    }
}
