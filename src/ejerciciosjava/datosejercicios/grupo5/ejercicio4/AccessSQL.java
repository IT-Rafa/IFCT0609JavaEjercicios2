/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sistemas
 */
public class AccessSQL {
 
    public static void main(String[] args) {
        testMySQLDriver();
        try {
            String url = "jdbc:mysql://localhost:3306/prueba";
            String usuario = "root";
            String password = "";

            try (Connection connection = DriverManager.getConnection(url, usuario, password); Statement statement = connection.createStatement(); ResultSet rs = statement.executeQuery("SELECT * FROM persona")) {
                
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    Date fecha = rs.getDate("fecha");
                    System.out.println(String.format("%d, %s, %s, %s", id, nombre, apellido, fecha));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private static void testMySQLDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println("Error. No se cargo DB DRIVER");
        }

    }

}
