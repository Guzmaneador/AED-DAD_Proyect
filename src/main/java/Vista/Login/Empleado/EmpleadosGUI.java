package Vista.Login.Empleado;

import Controlador.*;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.ModeloImpl;
import Vista.Login.LoginGUI;
import Vista.VistaImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        ImageIcon icon = new ImageIcon("icon/escudo.png");
        setIconImage(icon.getImage());
        passwordPanel.setVisible(false);
        nCoicidenLabel.setVisible(false);
        this.empleado=empleado;
        rellenarFormulario();
        ocultarDatos();
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
        passwordCheckBox = new javax.swing.JCheckBox();
        passwordPanel = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        nCoicidenLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        salarioTextField = new javax.swing.JLabel();
        nifTextField = new javax.swing.JLabel();
        oficioTextField = new javax.swing.JLabel();
        fechaAltaTextField = new javax.swing.JLabel();
        idTextField = new javax.swing.JLabel();
        tipoTextField = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        passwordCheckBox.setText("Cambiar Contraseña");
        passwordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckBoxActionPerformed(evt);
            }
        });

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

        jButton2.setText("jButton2");

        jMenu1.setText("Herramientas");

        jMenuItem1.setText("Datos Modificable");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Datos del usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
                                    .addComponent(salarioLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(nombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addGap(110, 110, 110))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fechaAltaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(salarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordCheckBox)
                                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nifLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nifTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oficioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oficioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoLabel)
                    .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(altaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaAltaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    controlador.actualizarEmpleado(empleado,empleado.getNif(),new String (passwordField1.getPassword()));
                    nCoicidenLabel.setVisible(false);
                }else{
                    nCoicidenLabel.setVisible(true);
                }              
            }else{
                actualizarDatosEmpleado();
                controlador.actualizarEmpleado(empleado,empleado.getNif());
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ocultarDatos();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        LoginGUI miLogin =  new LoginGUI();
        miLogin.setVisible(true);
        miLogin.setLocationRelativeTo(null);//hace que La ventana salga Centrada
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        JOptionPane.showMessageDialog(null, "Aplicacion creada por Guzman Martinez Santos de 2ºDAM.\n Proyecto de las asignatura de AED y DAD en CIFP Cesar Manrrique");
    }//GEN-LAST:event_jMenu2MouseClicked

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
    private javax.swing.JLabel altaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fechaAltaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel nCoicidenLabel;
    private javax.swing.JLabel nifLabel;
    private javax.swing.JLabel nifTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel oficioLabel;
    private javax.swing.JLabel oficioTextField;
    private javax.swing.JCheckBox passwordCheckBox;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JLabel salarioTextField;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tipoTextField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    private void rellenarFormulario() {
        nombreTextField.setText(empleado.getNombre());
        nifTextField.setText(empleado.getNif());
        oficioTextField.setText(empleado.getOficio());
        switch (empleado.getTipo()) {
            case "Empleado":
                tipoTextField.setText("Empleado");
                break;
            case "Administrativo":
                tipoTextField.setText("Administrativo");
                break;
            default:
                throw new AssertionError();
        }
        fechaAltaTextField.setText(empleado.getFechaAlta());
        salarioTextField.setText(String.valueOf(empleado.getSalario()));
        idTextField.setText(Integer.toString(empleado.getId()));
    }
    private void actualizarDatosEmpleado(){
        empleado.setNombre(nombreTextField.getText());
    }
    private boolean compararPassword(){
        boolean coinciden = false;
        if(new String(passwordField1.getPassword()).equals(new String (passwordField2.getPassword())))
            coinciden=true;
        
        return coinciden;
            
    }
    public void ocultarDatos(){
        fechaAltaTextField.setVisible(false);
        altaLabel.setVisible(false);
        idTextField.setVisible(false);
        idLabel.setVisible(false);
        nifTextField.setVisible(false);
        nifLabel.setVisible(false);
        oficioTextField.setVisible(false);
        oficioLabel.setVisible(false);
        tipoTextField.setVisible(false);
        tipoLabel.setVisible(false); 
        salarioTextField.setVisible(false);
        salarioLabel.setVisible(false);
    }
    public void mostrarDatos(){
        fechaAltaTextField.setVisible(true);
        altaLabel.setVisible(true);
        idTextField.setVisible(true);
        idLabel.setVisible(true);
        nifTextField.setVisible(true);
        nifLabel.setVisible(true);
        oficioTextField.setVisible(true);
        oficioLabel.setVisible(true);
        tipoTextField.setVisible(true);
        tipoLabel.setVisible(true);
        salarioTextField.setVisible(false);
        salarioLabel.setVisible(false);
    }
    
    
}
