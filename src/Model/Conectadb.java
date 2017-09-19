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

    //nombre de la base de datos
    public String db = "dbExample";

    //URL del driver
    public String url = "jdbc:mysql://localhost/" + db;

    //user de la bd
    public String user = "root";

    //pass del user de la bd
    public String pass = "123";

    public Connection Conectar() {

        Connection link = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            System.out.println("Conexión exitosa!");
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.printf(ex.getMessage());
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
