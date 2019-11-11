package Vista.Login.Empleado;

import Controlador.*;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.ModeloImpl;
import Vista.VistaImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munchi
 */
public class EmpleadosGUI extends javax.swing.JFrame {

    /**
     * Creates new form EmpleadosGUI
     */
    EmpleadoVO empleado;
    Controlador controlador = new ControladorImpl(new ModeloImpl(),new VistaImpl());
    public EmpleadosGUI(EmpleadoVO empleado) {
        initComponents();
        passwordPanel.setVisible(false);
        nCoicidenLabel.setVisible(false);
        this.empleado=empleado;
        rellenarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    <mapping resource="modelo/Equipo.hbm.xml"/>
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tituloLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        nifLabel = new javax.swing.JLabel();
        oficioLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        altaLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        nifTextField = new javax.swing.JTextField();
        oficioTextField = new javax.swing.JTextField();
        empleadoRadioButton = new javax.swing.JRadioButton();
        administrativoRadioButton = new javax.swing.JRadioButton();
        passwordCheckBox = new javax.swing.JCheckBox();
        fechaAltaTextField = new javax.swing.JTextField();
        salarioTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        nCoicidenLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setText("DATOS EMPLEADO");

        nombreLabel.setText("Nombre: ");

        nifLabel.setText("NIF: ");

        oficioLabel.setText("Oficio: ");

        tipoLabel.setText("Tipo: ");

        altaLabel.setText("Fecha Alta: ");

        salarioLabel.setText("Salario: ");

        idLabel.setText("ID: ");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        nifTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nifTextFieldActionPerformed(evt);
            }
        });

        oficioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oficioTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(empleadoRadioButton);
        empleadoRadioButton.setText("Empleado");

        buttonGroup1.add(administrativoRadioButton);
        administrativoRadioButton.setText("Administrativo");

        passwordCheckBox.setText("Cambiar Contraseña");
        passwordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckBoxActionPerformed(evt);
            }
        });

        fechaAltaTextField.setText("aaaa-mm-dd");

        passwordPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nCoicidenLabel.setText("*No coiciden ");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(passwordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(nCoicidenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nCoicidenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altaLabel)
                                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nifLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oficioLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salarioLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nombreTextField)
                                                .addGap(10, 10, 10))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empleadoRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(administrativoRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fechaAltaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(salarioTextField)
                                            .addComponent(idTextField)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordCheckBox)
                                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nifLabel)
                    .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oficioLabel)
                    .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(empleadoRadioButton)
                    .addComponent(administrativoRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(altaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(salarioLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechaAltaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nifTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nifTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nifTextFieldActionPerformed

    private void oficioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oficioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oficioTextFieldActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void passwordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckBoxActionPerformed
        if(passwordCheckBox.isSelected())
            passwordPanel.setVisible(true);
        else
            passwordPanel.setVisible(false);
            nCoicidenLabel.setVisible(false);    
    }//GEN-LAST:event_passwordCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(passwordCheckBox.isSelected()){
                if(compararPassword()){
                    actualizarDatosEmpleado();
                    controlador.actualizarEmpleado(empleado,new String (passwordField1.getPassword()));
                    nCoicidenLabel.setVisible(false);
                }else{
                    nCoicidenLabel.setVisible(true);
                }              
            }else{
                actualizarDatosEmpleado();
                controlador.actualizarEmpleado(empleado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmpleadosGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton administrativoRadioButton;
    private javax.swing.JLabel altaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton empleadoRadioButton;
    private javax.swing.JTextField fechaAltaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nCoicidenLabel;
    private javax.swing.JLabel nifLabel;
    private javax.swing.JTextField nifTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel oficioLabel;
    private javax.swing.JTextField oficioTextField;
    private javax.swing.JCheckBox passwordCheckBox;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JTextField salarioTextField;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    private void rellenarFormulario() {
        nombreTextField.setText(empleado.getNombre());
        nifTextField.setText(empleado.getNif());
        oficioTextField.setText(empleado.getOficio());
        switch (empleado.getTipo()) {
            case "Empleado":
                empleadoRadioButton.setSelected(true);
                break;
            case "Administrativo":
                administrativoRadioButton.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        fechaAltaTextField.setText(empleado.getFechaAlta());
        salarioTextField.setText(String.valueOf(empleado.getSalario()));
        idTextField.setText(Integer.toString(empleado.getId()));
    }
    private void actualizarDatosEmpleado(){
        empleado.setNif(nifTextField.getText());
        empleado.setNombre(nombreTextField.getText());
        empleado.setOficio(oficioTextField.getText());
    }
    private boolean compararPassword(){
        boolean coinciden = false;
        if(new String(passwordField1.getPassword()).equals(new String (passwordField2.getPassword())))
            coinciden=true;
        
        return coinciden;
            
    }
}
