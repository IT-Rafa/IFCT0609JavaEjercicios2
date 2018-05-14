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

/**
 *
 * @author Sistemas
 */
public class VentanaEj7_Salida extends JFrame implements ActionListener {
//ATRIBUTOS
    //Ventana que llamo a esta

    JFrame mainWindow;
    //- Declaramos elementos de la ventana
    //Dentro de JFrame
    private JLabel tit2JLabel = new JLabel("Datos enviados");

    private JPanel buttons2JPanel = new JPanel();
    private JButton volverJBtn = new JButton("Volver");
    private JButton cerrarJBtn = new JButton("Cerrar");

//FIN ATRIBUTOS
// METODOS - (constructor más abajo por comodidad)
    private void organizarElementos() {
        //En contenedor primario en vertical
        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)
        );
        this.add(Box.createRigidArea(new Dimension(20, 20)));
        this.add(tit2JLabel);
        this.add(Box.createVerticalGlue());
        this.add(buttons2JPanel);

        buttons2JPanel.setLayout(new BoxLayout(buttons2JPanel, BoxLayout.X_AXIS));

        buttons2JPanel.add(Box.createHorizontalGlue());
        buttons2JPanel.add(volverJBtn);
        buttons2JPanel.add(Box.createHorizontalGlue());
        buttons2JPanel.add(cerrarJBtn);
        buttons2JPanel.add(Box.createHorizontalGlue());

    }
//CONSTRUCTOR

    public VentanaEj7_Salida(JFrame ventana) {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuar la ventana
        configElements();     // llamada Método para inicializar elementos
        organizarElementos(); // llamada Método para organizar (añadir) los elementos
        mainWindow = ventana;
    }

    //METODOS PARA ORGANIZAR CONSTRUCTOR
    private void confVentana() {

        //Diseño ventana general
        this.setTitle("Ejercicio 7 Swing - salida ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(250, 200));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(240, 150));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj2  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }

    private void configElements() {
        // Configuracion elementos
        tit2JLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        tit2JLabel.setFont(new Font("Dialog", 1, 25));
        tit2JLabel.setForeground(new Color(220, 0, 0));

        
        
        volverJBtn.setPreferredSize(new Dimension(100, 50));
        volverJBtn.setForeground(new Color(0, 200, 0));
        volverJBtn.setFont(new Font("Dialog", 1, 15));
        volverJBtn.addActionListener(this);

        cerrarJBtn.setPreferredSize(new Dimension(100, 50));
        cerrarJBtn.setForeground(new Color(220, 0, 0));
        cerrarJBtn.setFont(new Font("Dialog", 1, 15));
        cerrarJBtn.addActionListener(this);

    }

    // MANEJADORES EVENTOS
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == volverJBtn) {
            mainWindow.setVisible(true);
            this.dispose();
        }
        if (ae.getSource() == cerrarJBtn) {
            System.exit(0);
        }
    }

}
