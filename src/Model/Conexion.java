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
 * @author Usuario
 */
public class Conexion {

    Connection conexion;
    PreparedStatement stm;
    Statement stm2;

    private String codeGroup, numberGroup, name, itemSchoolTime, itemBloc, classRoom, itemDay, itemradio, itemHour;

    public void conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/java?user=luzpaez&password=");
            System.out.println("Conexión exitosa!");
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    }

    
    
    
    
}
