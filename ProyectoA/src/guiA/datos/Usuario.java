/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiA.datos;

import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
import java.io.Serializable;

public class Usuario implements Serializable {
    
     public Usuario() {
        if (usuariosNuevos == null) {
            usuariosNuevos = new HashMap<>();
        }
    }
    public static String id;
    public static String clave;
    public static String nombre;
    public static String genero;
     public static HashMap<String, Usuario> usuariosNuevos;
    
     
     
     public String getid(){
         return id ;
     }
     
     public  String getclave(){
         return clave;
     }
     
      public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }
       public static void setClave(String nombre) {
        Usuario.clave = clave;
    }
        public static void setGenero(String nombre) {
        Usuario.genero = genero;
    }
         public static void setId(String nombre) {
        Usuario.id = id;
    }
         
             
   
}


