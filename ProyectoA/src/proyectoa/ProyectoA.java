/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoa;

import guiA.VentanaFacturas;
import guiA.VentanaPrincipal;
import java.util.Properties;

/**
 *
 * @author Estudiante
 */
public class ProyectoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal VentanaL = new VentanaPrincipal();
        VentanaL.setVisible(true);
        VentanaL.setLocationRelativeTo(null);
        Properties propiedades=System.getProperties();
        for(var p : propiedades.entrySet()){
            System.out.println(p.getKey()+" : "+p.getValue());
        }
    }
   
    
    
    
}
