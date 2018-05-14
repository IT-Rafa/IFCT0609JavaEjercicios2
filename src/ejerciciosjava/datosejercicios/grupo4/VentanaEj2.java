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
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sistemas
 */
public class VentanaEj2 extends JFrame implements ActionListener {
//ATRIBUTOS
    //Logica
    private double
            radio=0,
            altura=0;

            
    //- Declaramos elementos de la ventana
    //Dentro de JFrame
    private JLabel tituloJLabel = new JLabel("Cilindro");
    private JPanel inputJPanel = new JPanel();
    private JPanel buttonsJPanel = new JPanel();
    private JPanel outputJPanel = new JPanel();

    // - Dentro de JFrame - inputJPanel
    private JPanel inRadioJPanel = new JPanel();
    private JPanel inAltJPanel = new JPanel();

    // - Dentro de JFrame - inputJPanel - inRadioJPanel
    private JLabel radioJLabel = new JLabel("Radio: ");
    private JTextField radioJTextField = new JTextField();

    // - Dentro de JFrame - inputJPanel - inAltJPanel
    private JLabel alturaJLabel = new JLabel("Altura: ");
    private JTextField alturaJTextField = new JTextField();

    // - Dentro de JFrame - buttonsJPanel
    private JPanel calcularBtnJPanel = new JPanel();
    private JPanel resetBtnJPanel = new JPanel();
    
     // - Dentro de JFrame - buttonsJPanel - calcularBtnJPanel
    private JButton calcularBtn = new JButton("Calcular");
 
    // - Dentro de JFrame - buttonsJPanel - resetBtnJPanel
    private JButton resetBtn = new JButton("Reiniciar");

    // - Dentro de JFrame - outputJPanel
    private JPanel outVolJPanel = new JPanel();
    private JPanel outAreaJPanel = new JPanel();

    // - Dentro de JFrame - outputJPanel - outVolJPanel
    private JLabel volumenJLabel = new JLabel("Volumen");
    private JTextField volumenJTextField = new JTextField();

    // - Dentro de JFrame - outputJPanel - outAreaJPanel
    private JLabel areaJLabel = new JLabel("Area");
    private JTextField areaJTextField = new JTextField();

//FIN ATRIBUTOS
// METODOS - (constructor más abajo por comodidad)
    private void organizarElementos() {
        //Disposicion JFrame
        this.setLayout(new BorderLayout(5, 5));
        //Añadimos elementos al JFrame
        this.add(tituloJLabel, BorderLayout.NORTH);
        this.add(inputJPanel, BorderLayout.WEST);
        this.add(buttonsJPanel, BorderLayout.EAST);
        this.add(outputJPanel, BorderLayout.SOUTH);

        //Disposicion inputJPanel
        inputJPanel.setLayout(new BoxLayout(inputJPanel, BoxLayout.Y_AXIS));
        //Añadimos elementos al JFrame - inputJPanel
        inputJPanel.add(Box.createVerticalGlue());
        inputJPanel.add(inRadioJPanel);
        inputJPanel.add(inAltJPanel);

        //Disposicion inRadioJPanel por defecto FlowLayout
        //Añadimos elementos al JFrame - inputJPanel - inRadioJPanel
        inRadioJPanel.add(radioJLabel);
        inRadioJPanel.add(radioJTextField);

        //Disposicion inAltJPanel por defecto FlowLayout
        //Añadimos elementos al JFrame - inputJPanel - inAltJPanel
        inAltJPanel.add(alturaJLabel);
        inAltJPanel.add(alturaJTextField);

        //Disposicion buttonsJPanel
        buttonsJPanel.setLayout(new BoxLayout(buttonsJPanel, BoxLayout.Y_AXIS));
        //Añadimos elementos al JFrame - buttonsJPanel
        buttonsJPanel.add(Box.createVerticalGlue());
        buttonsJPanel.add(calcularBtnJPanel);
        buttonsJPanel.add(resetBtnJPanel);
        
        //Añadimos elementos al JFrame - buttonsJPanel - calcularBtnJPanel
        calcularBtnJPanel.add(calcularBtn);
        
        //Añadimos elementos al JFrame - buttonsJPanel - resetBtnJPanel
        resetBtnJPanel.add(resetBtn);

        //Disposicion outputJPanel por defecto FlowLayout
        //Añadimos elementos al JFrame - outputJPanel
        outputJPanel.add(outVolJPanel);
        outputJPanel.add(outAreaJPanel);

        //Disposicion outVolJPanel
        outVolJPanel.setLayout(new BoxLayout(outVolJPanel, BoxLayout.Y_AXIS));
        //Añadimos elementos al JFrame - outputJPanel - outVolJPanel
        outVolJPanel.add(volumenJLabel);
        outVolJPanel.add(volumenJTextField);

        //Disposicion outAreaJPanel
        outAreaJPanel.setLayout(new BoxLayout(outAreaJPanel, BoxLayout.Y_AXIS));
        //Añadimos elementos al JFrame - outputJPanel - outAreaJPanel
        outAreaJPanel.add(areaJLabel);
        outAreaJPanel.add(areaJTextField);

    }
//CONSTRUCTOR

    public VentanaEj2() {
        super();              // usamos el contructor de la clase padre JFrame
        confVentana();        // llamada Método para configuar la ventana
        configElements();     // llamada Método para inicializar elementos
        organizarElementos(); // llamada Método para organizar (añadir) los elementos
    }

    //METODOS PARA ORGANIZAR CONSTRUCTOR
    private void confVentana() {

        //Diseño ventana general
        this.setTitle("Ejercicio 2 Swing ");                // Definimos titulo a la ventana
        this.setSize(new Dimension(500, 300));               // Definimos tamaño de ventana (ancho, alto)
        this.setMinimumSize(new Dimension(340, 240));        // Definimos tamaño mínimo de ventana
        this.setLocationRelativeTo(null);                   // Centrar la ventana en la pantalla
        this.setResizable(true);                            // VentanaEj2  sea redimiensionable
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso

    }

    private void configElements() {
        int alto=this.getSize().height;
        int ancho=this.getSize().width;
        // Configuracion elementos
       
        tituloJLabel.setFont(new Font("Dialog", 1, 24));
        tituloJLabel.setHorizontalAlignment(JLabel.CENTER);
        tituloJLabel.setVerticalAlignment(JLabel.CENTER);
        tituloJLabel.setForeground(new Color(0, 102, 0));

        radioJLabel.setPreferredSize(new Dimension(ancho/10, 40));
        radioJLabel.setHorizontalAlignment(JLabel.RIGHT);
        radioJTextField.setPreferredSize(new Dimension(100, 40));
        radioJTextField.addActionListener(this);
        
        alturaJLabel.setPreferredSize(new Dimension(ancho/10, 40));
        alturaJLabel.setHorizontalAlignment(JLabel.RIGHT);
        alturaJTextField.setPreferredSize(new Dimension(100, 40));
        alturaJTextField.addActionListener(this);  


        calcularBtn.setFont(new Font("Dialog", 1, 15));
        calcularBtn.setPreferredSize(new Dimension(100, 40));
        calcularBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        calcularBtn.addActionListener(this);  
        
        resetBtn.setFont(new Font("Dialog", 1, 15));
        resetBtn.setPreferredSize(new Dimension(100, 40));
        resetBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        resetBtn.addActionListener(this);  
        
        volumenJLabel.setPreferredSize(new Dimension(100, 15));
        volumenJTextField.setPreferredSize(new Dimension(100, 40));
        volumenJTextField.setEditable(false);
        
        areaJLabel.setPreferredSize(new Dimension(100, 15));
        areaJTextField.setPreferredSize(new Dimension(100, 40));
        areaJTextField.setEditable(false);

    }
    // MANEJADORES EVENTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == radioJTextField) {
            //Solo cuando le das a enter
            this.radio= Integer.parseInt(radioJTextField.getText());
        }
        if (ae.getSource() == alturaJTextField) {
            this.altura= Integer.parseInt(alturaJTextField.getText());
        }
        if (ae.getSource() == resetBtn) {
            //radio y altura a 0 y actualizar ventana
            volumenJTextField.setText(String.valueOf(0));
            areaJTextField.setText(String.valueOf(0));
        }
        if (ae.getSource() == calcularBtn) {
            //si radio y altura ok  actualizar ventana
            volumenJTextField.setText(String.valueOf(hallarVolumen(this.radio,this.altura)));
            areaJTextField.setText(String.valueOf(hallarArea(this.radio,this.altura)));

        }
    }
    private double hallarVolumen(double radio,double altura){
    return Math.PI*Math.pow(radio, 2)*altura;
    }
        private double hallarArea(double radio,double altura){
    return 2*Math.PI*radio*altura;
    }


}
