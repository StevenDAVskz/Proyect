/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoa;

import guiA.datos.Usuario;
import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class facturasCrud {
    public static HashMap<String, Usuario> usuariosNuevos;
    
    public CrudArchivo( ){
        usuariosNuevos = new HashMap<>();
    }
    public static int crearUsuario(Usuario usuario)throws Exception{
        if(usuariosNuevos.containsKey(usuario.id)){
            String mensaje = "El usuario con ID "+ Usuario.id 
                              + " Ya existe";
            throw new Exception(mensaje);
        }
        usuariosNuevos.put(usuario.id, usuario);
        return usuariosNuevos.size();
    }
}
