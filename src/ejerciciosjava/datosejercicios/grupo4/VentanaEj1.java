/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo4;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;


/**
 *
 * @author Sistemas
 */
public class VentanaEj1 extends JFrame implements ActionListener {
//ATRIBUTOS - Declaramos elementos de la ventana

    private JButton botonAzul;       // boton con una determinada accion
    private JButton botonRojo;       // boton con una determinada accion

    //CONSTRUCTOR
    public VentanaEj1() {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuar la ventana
        intElemVentana();     // llamada Método para inicializar elementos
        organizarElementos(); // llamada Método para organizar (añadir) los elementos
    }

    //METODOS PARA ORGANIZAR CONSTRUCTOR
    private void confVentana() {
        //Diseño organizacion componentes
        FlowLayout frameLayout = new FlowLayout(FlowLayout.CENTER,40,40);
        this.setLayout(frameLayout);
        
        //Diseño ventana general
        this.setTitle("Ejercicio 1 Swing ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(350,200));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(150,135));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj1  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }

    private void intElemVentana() {
        // Inicializamos elementos
        botonRojo = new JButton();
        botonAzul = new JButton();

        // Configuracion elementos
        botonRojo.setPreferredSize(new Dimension(100, 40));  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonRojo.setBackground(java.awt.Color.red);
        botonRojo.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonRojo.setBorder(new LineBorder(Color.WHITE, 2, true));
        
        botonAzul.setPreferredSize(new Dimension(100, 40));  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonAzul.setBackground(java.awt.Color.blue);
        botonAzul.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonAzul.setBorder(new LineBorder(Color.WHITE, 2, true));
    }

    private void organizarElementos() {
        // Añadimos los elementos a la ventana
        this.add(botonRojo);
        this.add(botonAzul);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == botonRojo) {
            System.out.println("Boton Rojo pulsado");
            this.getContentPane().setBackground(java.awt.Color.red);
        }
        if (ae.getSource() == botonAzul) {
            System.out.println("Boton azul pulsado");
            this.getContentPane().setBackground(java.awt.Color.blue);
        }
    }

}
