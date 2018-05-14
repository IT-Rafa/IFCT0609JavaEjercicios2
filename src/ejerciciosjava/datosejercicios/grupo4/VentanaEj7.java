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
public class VentanaEj7 extends JFrame implements ActionListener {
//ATRIBUTOS

    //- Declaramos elementos de la ventana
    //Dentro de JFrame
    private JLabel titJLabel = new JLabel("Datos Alumno");

    private JPanel inputJPanel = new JPanel();

    private JPanel nomJPanel = new JPanel();
    private JLabel nombreJLabel = new JLabel("Nombre: ");
    private JTextField nombreJTxField = new JTextField("-");

    private JPanel apellJPanel = new JPanel();
    private JLabel apellJLabel = new JLabel("Apellidos: ");
    private JTextField apellJTxField = new JTextField("-");

    private JPanel sexJPanel = new JPanel();
    private JLabel sexJLabel = new JLabel("Sexo: ");
    private JRadioButton machoCheck = new JRadioButton("M");
    private JRadioButton hembraCheck = new JRadioButton("F");

    private JPanel buttonsJPanel = new JPanel();
    private JButton contJBtn = new JButton("Continuar");
    private JButton salirJBtn = new JButton("Salir");

//FIN ATRIBUTOS
// METODOS - (constructor más abajo por comodidad)
    private void organizarElementos() {
        //En contenedor primario en vertical
        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS)
        );
        this.add(Box.createRigidArea(new Dimension(20, 20)));
        this.add(titJLabel);
        this.add(Box.createVerticalGlue());
        this.add(inputJPanel);
        this.add(Box.createVerticalGlue());
        this.add(buttonsJPanel);
        this.add(Box.createVerticalGlue());

        //En inputJPanel  en vertical
        inputJPanel.setLayout(new BoxLayout(inputJPanel, BoxLayout.PAGE_AXIS));

        inputJPanel.add(nomJPanel);
        inputJPanel.add(apellJPanel);
        inputJPanel.add(sexJPanel);

        nomJPanel.add(Box.createHorizontalGlue());
        nomJPanel.add(nombreJLabel);
        nomJPanel.add(Box.createHorizontalGlue());
        nomJPanel.add(nombreJTxField);
        nomJPanel.add(Box.createHorizontalGlue());

        apellJPanel.add(apellJLabel);
        apellJPanel.add(Box.createHorizontalGlue());
        apellJPanel.add(apellJTxField);

        sexJPanel.setLayout(new BoxLayout(sexJPanel, BoxLayout.X_AXIS));

        sexJPanel.add(Box.createHorizontalGlue());
        sexJPanel.add(sexJLabel);
        sexJPanel.add(Box.createHorizontalGlue());
        sexJPanel.add(machoCheck);
        sexJPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        sexJPanel.add(hembraCheck);
        sexJPanel.add(Box.createHorizontalGlue());

        buttonsJPanel.setLayout(new BoxLayout(buttonsJPanel, BoxLayout.X_AXIS));

        buttonsJPanel.add(Box.createHorizontalGlue());
        buttonsJPanel.add(contJBtn);
        buttonsJPanel.add(Box.createHorizontalGlue());
        buttonsJPanel.add(salirJBtn);
        buttonsJPanel.add(Box.createHorizontalGlue());

    }
//CONSTRUCTOR

    public VentanaEj7() {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuar la ventana
        configElements();     // llamada Método para inicializar elementos
        organizarElementos(); // llamada Método para organizar (añadir) los elementos
    }

    //METODOS PARA ORGANIZAR CONSTRUCTOR
    private void confVentana() {

        //Diseño ventana general
        this.setTitle("Ejercicio 7 Swing ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(450, 320));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(450, 320));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj2  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }

    private void configElements() {
        // Configuracion elementos
        titJLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titJLabel.setFont(new Font("Dialog", 1, 25));
        titJLabel.setForeground(new Color(220, 0, 0));

        nombreJLabel.setFont(new Font("Dialog", 1, 18));
        nombreJLabel.setPreferredSize(new Dimension(100, 30));
        nombreJTxField.setFont(new Font("Dialog", 0, 15));
        nombreJTxField.setPreferredSize(new Dimension(150, 30));
        nombreJTxField.setAlignmentX(Component.LEFT_ALIGNMENT);

        apellJLabel.setFont(new Font("Dialog", 1, 18));
        apellJLabel.setPreferredSize(new Dimension(100, 30));
        apellJTxField.setFont(new Font("Dialog", 0, 15));
        apellJTxField.setPreferredSize(new Dimension(150, 30));
        apellJTxField.setAlignmentX(Component.LEFT_ALIGNMENT);

        sexJLabel.setFont(new Font("Dialog", 1, 18));

        machoCheck.setFont(new Font("Dialog", 0, 15));
        machoCheck.addActionListener(this);

        hembraCheck.setFont(new Font("Dialog", 0, 15));
        hembraCheck.addActionListener(this);

        contJBtn.addActionListener(this);
        contJBtn.setPreferredSize(new Dimension(150, 50));
        contJBtn.setForeground(new Color(0, 200, 0));
        contJBtn.setFont(new Font("Dialog", 1, 15));

        salirJBtn.addActionListener(this);
        salirJBtn.setPreferredSize(new Dimension(150, 50));
        salirJBtn.setForeground(new Color(220, 0, 0));
        salirJBtn.setFont(new Font("Dialog", 1, 15));

    }

    // MANEJADORES EVENTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == machoCheck) {
            hembraCheck.setSelected(false);
        }
        if (ae.getSource() == hembraCheck) {
            machoCheck.setSelected(false);
        }
        if (ae.getSource() == contJBtn) {
            if (machoCheck.isSelected() || hembraCheck.isSelected()) {
                this.setVisible(false);
                VentanaEj7_Salida ventanaNueva = new VentanaEj7_Salida(this);
                ventanaNueva.setVisible(true);
            } else {
                machoCheck.setForeground(Color.red);
                hembraCheck.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Se debe marcar alguna casilla");
            }
        }
        if (ae.getSource() == salirJBtn) {
            System.exit(0);
        }
    }

}
