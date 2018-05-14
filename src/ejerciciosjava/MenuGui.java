/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import ejerciciosjava.datosejercicios.Ejercicios;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author it-ra
 */
public class MenuGui extends javax.swing.JFrame {

	DefaultComboBoxModel listaGrupos = new javax.swing.DefaultComboBoxModel(Ejercicios.getListadoGrupos());
	int grupo;
	int ej;
	/**
	 * Creates new form MainWindow
	 */
	public MenuGui() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ejecutarBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciadojTextArea = new javax.swing.JTextArea();
        salirBoton = new javax.swing.JButton();
        grupoEjComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEjerciciosJList = new javax.swing.JList<>();
        grupoEjTxtField = new javax.swing.JTextField();
        numEjTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicios Java - IFCT0609");
        setLocationByPlatform(true);

        ejecutarBoton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ejecutarBoton.setText("Ejecutar");
        ejecutarBoton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        ejecutarBoton.setMaximumSize(new java.awt.Dimension(80, 40));
        ejecutarBoton.setMinimumSize(new java.awt.Dimension(80, 40));
        ejecutarBoton.setPreferredSize(new java.awt.Dimension(80, 40));
        ejecutarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBotonActionPerformed(evt);
            }
        });

        enunciadojTextArea.setColumns(20);
        enunciadojTextArea.setLineWrap(true);
        enunciadojTextArea.setRows(5);
        enunciadojTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(enunciadojTextArea);

        salirBoton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        salirBoton.setText("Salir");
        salirBoton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        salirBoton.setMaximumSize(new java.awt.Dimension(80, 40));
        salirBoton.setMinimumSize(new java.awt.Dimension(80, 40));
        salirBoton.setPreferredSize(new java.awt.Dimension(80, 40));
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });

        grupoEjComboBox.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        grupoEjComboBox.setModel(listaGrupos);
        grupoEjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoEjComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Grupos ejercicios");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("EJERCICIOS JAVA - IFCT0609");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Número: ");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Grupo:");

        listaEjerciciosJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaEjerciciosJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEjerciciosJListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaEjerciciosJList);

        grupoEjTxtField.setEditable(false);
        grupoEjTxtField.setBackground(new java.awt.Color(214, 217, 223));
        grupoEjTxtField.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        grupoEjTxtField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        grupoEjTxtField.setText("-");
        grupoEjTxtField.setBorder(null);

        numEjTxtField.setEditable(false);
        numEjTxtField.setBackground(new java.awt.Color(214, 217, 223));
        numEjTxtField.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        numEjTxtField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numEjTxtField.setText("-");
        numEjTxtField.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numEjTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grupoEjTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupoEjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ejecutarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grupoEjTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numEjTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grupoEjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ejecutarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
		System.exit(0);
    }//GEN-LAST:event_salirBotonActionPerformed

    private void grupoEjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoEjComboBoxActionPerformed
        grupo=grupoEjComboBox.getSelectedIndex()+1;
		grupoEjTxtField.setText(Ejercicios.getListadoGrupos()[grupo-1]);
		DefaultComboBoxModel myModel = new javax.swing.DefaultComboBoxModel(Ejercicios.getListaEnunCortoByGroup(grupo));
		listaEjerciciosJList.setModel(myModel);
		
    }//GEN-LAST:event_grupoEjComboBoxActionPerformed

    private void listaEjerciciosJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEjerciciosJListMouseClicked
        ej=listaEjerciciosJList.getSelectedIndex();
		enunciadojTextArea.setText(Ejercicios.getEj(grupo, ej).getEnunLargo());
		numEjTxtField.setText(String.valueOf(ej));
    }//GEN-LAST:event_listaEjerciciosJListMouseClicked

    private void ejecutarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBotonActionPerformed
        Ejercicios.getEj(grupo, ej).EjecutaGui();
    }//GEN-LAST:event_ejecutarBotonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void init() {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MenuGui().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejecutarBoton;
    private javax.swing.JTextArea enunciadojTextArea;
    private javax.swing.JComboBox<String> grupoEjComboBox;
    private javax.swing.JTextField grupoEjTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaEjerciciosJList;
    private javax.swing.JTextField numEjTxtField;
    private javax.swing.JButton salirBoton;
    // End of variables declaration//GEN-END:variables
}