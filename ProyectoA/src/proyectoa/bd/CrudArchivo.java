/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoa.bd;

import guiA.datos.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author LENOVO
 */
public class CrudArchivo {
    public static String rutaBase=System.getProperty("user.home")+File.separator+"bd";

 public static void crearUsuario(Object datos, String nombreArchivo) throws IOException {
    ObjectOutputStream guardarObjeto = null;
    try {
        File archivoRuta = new File(rutaBase);
        if (!archivoRuta.exists()) {
            archivoRuta.mkdir();
        }

        File archivo = new File(rutaBase, nombreArchivo);
        if (archivo.exists()) {
            throw new IOException("El archivo ya existe");
        }

        FileOutputStream guardarArchivo = new FileOutputStream(archivo);
        guardarObjeto = new ObjectOutputStream(guardarArchivo);
        guardarObjeto.writeObject(datos);
    } finally {
        if (guardarObjeto != null) {
            guardarObjeto.close();
        }
    }
}
 


public static Object buscarObjeto(String nombreArchivo) throws IOException, ClassNotFoundException {
    ObjectInputStream leerObjeto = null;
    Object objetoEncontrado = null;
    try {
        File archivo = new File(rutaBase, nombreArchivo + ".dat");
        if (!archivo.exists()) {
            throw new IOException("El archivo no existe");
        }

        FileInputStream leerArchivo = new FileInputStream(archivo);
        leerObjeto = new ObjectInputStream(leerArchivo);
        objetoEncontrado = leerObjeto.readObject();
    } finally {
        if (leerObjeto != null) {
            leerObjeto.close();
        }
    }
    return objetoEncontrado;
}

 public static void cargarUsuarios() {
        try {
            // Buscar los usuarios en el archivo y asignarlos al mapa de usuarios
            Usuario.usuariosNuevos = (HashMap<String, Usuario>) buscarObjeto("Usuarios");
        } catch (IOException | ClassNotFoundException e) {
            // Manejar el error si no se pueden cargar los usuarios
            System.err.println("Error al cargar usuarios: " + e.getMessage());
            e.printStackTrace();
        }
    }


   


}