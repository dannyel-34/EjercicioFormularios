/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Validation {
    
    public void solotexto(char letra, java.awt.event.KeyEvent evt) {
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && letra != KeyEvent.VK_BACKSPACE && letra != ' ') {
            JOptionPane.showMessageDialog(null, "Solo se permiten letras!!!");
            evt.consume();
        }
    }
   
    public void solonumeros(char num, java.awt.event.KeyEvent evt) {
        if ((num < '0' || num > '9') && (num != KeyEvent.VK_BACKSPACE || num == ' ')) {
            JOptionPane.showMessageDialog(null, "Solo se permiten números!!!");
            evt.consume();
        }
    }
    
}
