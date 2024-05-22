/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoa;

import guiA.datos.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class FacturasCrud {
    public static HashMap<String, Usuario> usuariosNuevos = new HashMap<>();
    
    
    
    
    public static int crearUsuario(Usuario usuario)throws Exception{
        if(usuariosNuevos.containsKey(Usuario.id)){
            String mensaje = "El usuario con ID "+ Usuario.id 
                              + " Ya existe";
            throw new Exception(mensaje);
        }
        usuariosNuevos.put(Usuario.id, usuario);
        return usuariosNuevos.size();
    }
    
    public static Usuario buscarUsuario(String id) throws Exception{
         if(!usuariosNuevos.containsKey(id)){
            String mensaje = "El Usuario con Codigo "+ id 
                              + " NO existe";
            throw new Exception(mensaje);
        }
         return usuariosNuevos.get(id);
    }
      public static Usuario buscarclave(String clave) throws Exception{
         if(!usuariosNuevos.containsKey(clave)){
            String mensaje = "Clave Incorrecta"
                              + " Por favor verificar";
            throw new Exception(mensaje);
        }
         return usuariosNuevos.get(clave);
    }
      
      public List<Usuario> obtenerTodos() throws Exception{
        if(usuariosNuevos.isEmpty()){
            String mensaje = "La BD de negociantes está vacía";
            throw new Exception(mensaje);
        }
        var negociantes = usuariosNuevos.values();
        List<Usuario> litaDeNegociantes = new ArrayList<>(negociantes);
        return litaDeNegociantes;
    }
}

