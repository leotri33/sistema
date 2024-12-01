/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author pc
 */
public class Conexion {
    public static void main(String[] args) {
        // Detalles de conexión
        String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10748641";
        String usuario = "sql10748641";
        String contrasena = "gfqJVt3NeG";

        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa a la base de datos");
            
            // Ejemplo de consulta (opcional)
            String sql = "SELECT * FROM vehiculo"; // Cambia 'tu_tabla' por el nombre de tu tabla
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.executeQuery();
            
            // Cierra la conexión
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}
