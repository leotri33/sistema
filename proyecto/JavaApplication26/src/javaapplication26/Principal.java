/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

/**
 *
 * @author pc
 */
public class Principal {
    public static void main(String[] args) {
        // Mostrar el formulario 'vehiculo'
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehiculo().setVisible(true); // Llama al formulario
            }
        });
    }
    
}
