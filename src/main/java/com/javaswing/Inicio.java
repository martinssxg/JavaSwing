/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.javaswing;

import com.javaswing.view.TelaPrincipal;

/**
 *
 * @author Jorge Lescura
 */
public class Inicio {

    public static void main(String[] args) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                
                
            }
        });
        
    }
}
