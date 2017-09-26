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

    public String cadena = "";

    public boolean solotexto(char letra, java.awt.event.KeyEvent evt) {
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && letra != KeyEvent.VK_BACKSPACE && letra != ' ') {
            JOptionPane.showMessageDialog(null, "Solo se permiten letras!!!", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
            return true;
        }

        return false;

    }

    public boolean solonumeros(char num, java.awt.event.KeyEvent evt) {
        if ((num < '0' || num > '9') && (num != KeyEvent.VK_BACKSPACE || num == ' ')) {
            JOptionPane.showMessageDialog(null, "Solo se permiten números!!!", "Error", JOptionPane.ERROR_MESSAGE);
            evt.consume();
            return true;
        }
        return false;
    }

    public void validarCodigo(char letra, java.awt.event.KeyEvent evt, int t) {
        if (t < 3) {
            solotexto(letra, evt);
        } else if (t >= 2 && t < 3) {
            solonumeros(letra, evt);
        } else {
            evt.consume();
        }
    }

    public void validarNumAula(char letra, java.awt.event.KeyEvent evt, int t) {

        if ((!solonumeros(letra, evt))) {
            JOptionPane.showMessageDialog(null, "Solo texto", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

}
