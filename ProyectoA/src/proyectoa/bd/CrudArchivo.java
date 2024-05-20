/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoa.bd;

import guiA.datos.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

    public static void crearUsuario(Object datos, String nombreArchivo)throws Exception{
        ObjectOutputStream guardarObjeto = null;
        try {
          File archivoRuta = new File(rutaBase);
         if(!archivoRuta.exists()){
          archivoRuta.mkdir();
          }
         File archivo = new File(rutaBase, nombreArchivo+".dat");
           if(!archivo.exists()){
             archivo.createNewFile();
            }
         FileOutputStream guardarArchivo=new FileOutputStream(archivo);
         guardarObjeto=new ObjectOutputStream(guardarArchivo);
         guardarObjeto.writeObject(datos);
        } catch (FileNotFoundException ex) {
            throw new Exception("El archivo no exite");
        } catch (IOException ex) {
            throw new Exception("Error al guardar los datos");
        }finally{
            try{
                guardarObjeto.close();
            }catch(IOException ex){
                Logger.getLogger(CrudArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}