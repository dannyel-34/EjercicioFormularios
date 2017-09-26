/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Daniel P.Calle
 * @version 18-09-2017/1.0
 */
public class Conectadb {

    Connection link = null;

    public Connection Conectar() {

        try {

            //Cargamos el Driver de MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //Localhost: es la ubicacion de la base de datos,
            //db es el nombre de la base de datos en la cual hacemos conexion
            link = DriverManager.getConnection("jdbc:mysql://localhost/dbExample", "root", "");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
            System.out.println("Conexión exitosa!");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "No se puedo conectar ala base de datos", "Error"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.printf("No se pudo conectar ala base de datos" +ex.getMessage());
        }

        return link;

    }

    /**
     * public void conexion() { try { Class.forName("com.mysql.jdbc.Driver");
     * conexion =
     * DriverManager.getConnection("jdbc:mysql://localhost/java?user=luzpaez&password=");
     * System.out.println("Conexión exitosa!"); } catch (Exception e) {
     * System.out.printf(e.getMessage()); } }
     */
}
