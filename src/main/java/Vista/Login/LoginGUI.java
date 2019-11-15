/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Login;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.ModeloImpl;
import Vista.VistaImpl;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author munchi
 */
public class LoginGUI extends javax.swing.JFrame {
    Controlador controlador = new ControladorImpl(new ModeloImpl(),new VistaImpl());
             int contador =3;

    /**
     * Creates new form NewJFrame
     */
    public LoginGUI() {
        initComponents();
        ImageIcon icon = new ImageIcon("icon/escudo.png");
        setIconImage(icon.getImage());
//            Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("src/main/java/Vista/Png/escudo.png"));
//            setIconImage(icon);
//new ImageIcon(getClass().getResource("/icon/escudo.png")).getImage()
        Panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        okButtom = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userTextField = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        notificarLabel = new javax.swing.JLabel();
        notificarLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel.setBackground(new java.awt.Color(51, 153, 255));

        okButtom.setIcon(new ImageIcon("src/main/java/Vista/Png/touch-x1.png"));
        okButtom.setText("Iniciar Sesion");
        okButtom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        okButtom.setIconTextGap(-3);
        okButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtomActionPerformed(evt);
            }
        });

        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        tituloLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setIcon(new ImageIcon("src/main/java/Vista/Png/login-x1.png"));
        tituloLabel.setText("PANEL DE INCIO DE SESION");

        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setIcon(new ImageIcon("src/main/java/Vista/Png/face-x1.png"));
        userLabel.setText("User:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new ImageIcon("src/main/java/Vista/Png/key-x1.png"));
        jLabel3.setText("Password:");

        jButton1.setIcon(new ImageIcon("src/main/java/Vista/Png/close-x2.png"));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new ImageIcon("src/main/java/Vista/Png/close-x1.png"));
        jButton1.setRolloverIcon(new ImageIcon("src/main/java/Vista/Png/close-x1.png"));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        notificarLabel.setForeground(new java.awt.Color(255, 0, 0));

        notificarLabel2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(okButtom)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(userLabel)
                                .addGap(18, 18, 18)
                                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(notificarLabel))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(notificarLabel2)))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel)
                .addGap(12, 12, 12)
                .addComponent(notificarLabel)
                .addGap(12, 12, 12)
                .addComponent(notificarLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel))
                .addGap(37, 37, 37)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(okButtom)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void okButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtomActionPerformed
        if(contador==1){
            JOptionPane.showMessageDialog(null, "Has superado el numero maximo de intentos!!", "Guzmi dice adios :)", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        contador--;
        notificarLabel.setText("*Usuario o contraseña Incorrectos");
        notificarLabel2.setText("->Tiene "+String.valueOf(contador)+" intentos.");

        try {
            controlador.login(solicitarLogin());
        } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okButtomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel notificarLabel;
    private javax.swing.JLabel notificarLabel2;
    private javax.swing.JButton okButtom;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
    public ArrayList<String>  solicitarLogin(){
        ArrayList <String> userPass= new ArrayList();        
        userPass.add(userTextField.getText());
        userPass.add(new String (passwordField.getPassword()));
        return userPass;
        
    }
}
