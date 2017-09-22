/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosvarela;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author carlo
 */
public class Reproducir extends Thread{
    
    public JLabel progreso;
    public Cancion cancion;
    public JDialog ventana;
    
    public Reproducir(JLabel progreso, Cancion cancion, JDialog ventana) {
        this.progreso = progreso;
        this.cancion = cancion;
        this.ventana = ventana;
    }

    
    public JLabel getProgreso() {
        return progreso;
    }

    public void setProgreso(JLabel progreso) {
        this.progreso = progreso;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
    
    @Override
    public void run(){
        int cont = cancion.getDuracion();
        while(cont>=0){
            progreso.setText(""+cont);
            cont--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reproducir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.ventana.dispose();
    }
}
