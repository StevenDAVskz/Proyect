/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/bd_usuario";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        try {

            Class.forName(JDBC_DRIVER);


            System.out.println("Conectando a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);


            if (conn != null) {
                System.out.println("¡Conexión exitosa!");

                
            } else {
                System.out.println("Error en la conexión.");
            }
            String sql = "SELECT * FROM usuarios";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            //Consulta
            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                System.out.println("Nombre: " + nombre);
                String id = resultSet.getString("ID");
                System.out.println("ID: " + id);
                String email = resultSet.getString("Email");
                System.out.println("Email: " + email);
                String contraseña = resultSet.getString("Contraseña");
                System.out.println("Contraseña: " + contraseña);
                String genero = resultSet.getString("Genero");
                System.out.println("Genero: " + genero);
            }

        } catch (SQLException | ClassNotFoundException se) {


        }
         finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                }
            }
        }
    }
}
