package ejerciciosjava.datosejercicios.grupo4;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.TitledBorder;

public class VentanaEj6 extends JFrame implements ActionListener {

    private static final long serialVersionUID = -3138839128831859741L;

    //ATRIBUTOS
    // - Elementos de ventana
    JPanel buttonsJPanel = new JPanel();
    JButton holaJButton = new JButton("Hola a todos");
    JButton bienvJButton = new JButton("Bienvenidos a mi página");

    JPanel checksJPanel = new JPanel();
    JCheckBox holaJCheckBox = new JCheckBox("Hola a todos");
    JCheckBox bienvJCheckBox = new JCheckBox("Bienvenidos a mi página");

    //CONSTRUCTORES
    public VentanaEj6() {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuracjion general de la ventana
        configElements();     // llamada Método para configuracion individual elementos
        organizarElementos(); // llamada Método para organizar y los elementos
    }

    //METODOS PARA EL CONSTRUCTOR
    private void confVentana() {
        //Diseño ventana general
        this.setTitle("Ejercicio 6 Swing ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(450, 200));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(450, 150));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj2  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }

    private void organizarElementos() {
        //En contenedor primario en vertical
        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)
        );
        
        this.add(buttonsJPanel);
        this.add(checksJPanel);

        //En ButtonsJPanel en horizontal
        buttonsJPanel.setLayout(new BoxLayout(buttonsJPanel, BoxLayout.X_AXIS));

        buttonsJPanel.add(Box.createHorizontalGlue());
        buttonsJPanel.add(holaJButton);
        buttonsJPanel.add(Box.createHorizontalGlue());
        buttonsJPanel.add(bienvJButton);
        buttonsJPanel.add(Box.createHorizontalGlue());
        
        //En checksJPanel en vertical
        checksJPanel.setLayout(new BoxLayout(checksJPanel, BoxLayout.PAGE_AXIS));
        checksJPanel.add(Box.createVerticalGlue());
        checksJPanel.add(holaJCheckBox);
        checksJPanel.add(Box.createVerticalGlue());
        checksJPanel.add(bienvJCheckBox);
        checksJPanel.add(Box.createVerticalGlue());

    }

    private void configElements() {
        //Configuración individual de elementos
        holaJButton.setPreferredSize(new Dimension(200, 50));
        holaJButton.addActionListener(this);

        bienvJButton.setPreferredSize(new Dimension(200, 50));
        bienvJButton.addActionListener(this);

    }

    //CONTROLADORES EVENTOS
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(holaJButton)) {
            holaJCheckBox.setSelected(true);
            bienvJCheckBox.setSelected(false);
        }
        if (e.getSource().equals(bienvJButton)) {
            holaJCheckBox.setSelected(false);
            bienvJCheckBox.setSelected(true);
        }

    }
}
