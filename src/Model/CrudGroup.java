/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CrudGroup {
    
    Conexion c = new Conexion();
    
    private String codeGroup, numberGroup, name, itemSchoolTime, itemBloc, classRoom, itemDay, itemradio, itemHour;
    
    public void insertar(int code, int numcode, String name, String item1, String item2,
            int numroom, String itemrbs, String item3, String item4) throws SQLException {
        
        c.stm = c.conexion.prepareStatement("INSERT INTO GRUPO (codigo,numCodigo,nombre,jornada,bloque,numaula,dia,hora) VALUES (?,?,?,?,?)");
        c.stm.setInt(1, code);
        c.stm.setInt(2, numcode);
        c.stm.setString(3, name);
        c.stm.setString(4, item1);
        c.stm.setString(5, item2);
        c.stm.setInt(6, numroom);
        c.stm.setString(7, itemrbs);
        c.stm.setString(7, item3);
        c.stm.setString(7, item4);
        c.stm.execute();
        JOptionPane.showMessageDialog(null, "Los datos fueron guardados con éxito!");
    }
    
    public void imprimir() throws SQLException{
        c.stm2 = c.conexion.createStatement();
        ResultSet rs = c.stm2.executeQuery("SELECT codigo, nombre FROM GRUPO");
        System.out.println("Codigo \t nombre");
        
        while(rs.next()){
            System.out.println(rs.getString("codigo") + "\t" + rs.getString("nombre"));
        }
    }
    
    public void read(int i) throws SQLException{
        ResultSet rs = c.stm2.executeQuery("SELECT * FROM GRUPO WHERE CODIGO ='"+i+"'");
        
        while(rs.next()){
            codeGroup = rs.getString("codigo");
            numberGroup = rs.getString("numCodigo");
            
        }
    }
    
}
