
package ejerciciosjava.datosejercicios.grupo4;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VentanaEj5 extends JFrame implements ActionListener {
//ATRIBUTOS

    //- Declaramos elementos de la ventana
    //Dentro de JFrame
    private JPanel buttonsJPanel = new JPanel();
    private JPanel zonaTextoJPanel = new JPanel();
    private JButton ocultarBtn = new JButton("Ocultar");
    private JButton mostrarBtn = new JButton("Mostrar");
    private JTextArea zonaTexto = new JTextArea();

//FIN ATRIBUTOS
// METODOS - (constructor más abajo por comodidad)
    private void organizarElementos() {
        //Disposicion JFrame
        this.setLayout(new BorderLayout(100, 100));
        this.add(zonaTextoJPanel, BorderLayout.NORTH);
        zonaTextoJPanel.add(zonaTexto);
        this.add(buttonsJPanel, BorderLayout.SOUTH);
        buttonsJPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonsJPanel.add(ocultarBtn);
        buttonsJPanel.add(mostrarBtn);
    }
//CONSTRUCTOR

    public VentanaEj5() {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuar la ventana
        configElements();     // llamada Método para inicializar elementos
        organizarElementos(); // llamada Método para organizar (añadir) los elementos
    }

    //METODOS PARA ORGANIZAR CONSTRUCTOR
    private void confVentana() {

        //Diseño ventana general
        this.setTitle("Ejercicio 5 Swing ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(450, 320));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(450, 320));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj2  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }
    
    private void configElements() {

        // Configuracion elementos
        zonaTexto.setPreferredSize(new Dimension(400, 200));
        
        ocultarBtn.setFont(new Font("Dialog", 1, 15));
        ocultarBtn.setPreferredSize(new Dimension(100, 40));
        ocultarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        ocultarBtn.addActionListener(this);
        
        mostrarBtn.setFont(new Font("Dialog", 1, 15));
        mostrarBtn.setPreferredSize(new Dimension(100, 40));
        mostrarBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        mostrarBtn.addActionListener(this);
        
    }

    // MANEJADORES EVENTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mostrarBtn) {
            zonaTexto.setVisible(true);
        }
        if (ae.getSource() == ocultarBtn) {
            zonaTexto.setVisible(false);
        }
    }
    
}
