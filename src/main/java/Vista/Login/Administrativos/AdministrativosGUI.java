
package Vista.Login.Administrativos;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.ModeloImpl;
import Vista.Login.Empleado.EmpleadosGUI;
import Vista.Login.LoginGUI;
import Vista.VistaImpl;
import static java.lang.Thread.sleep;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author munchi
 */
public class AdministrativosGUI extends javax.swing.JFrame {
        Controlador controlador = new ControladorImpl(new ModeloImpl(),new VistaImpl());
        DepartamentoVO empresa;
        EmpleadoVO empleado;
        EmpleadoVO empleadoTratado;
        DepartamentoVO departamento;
        ArrayList<EmpleadoVO> listaEmpleados;
        ArrayList<DepartamentoVO> listaDepartamentosVO ;
        int id ;

    public AdministrativosGUI(ArrayList<Integer> listaDepartamento,EmpleadoVO empleado) {
        initComponents();
        modificarDepartamentoPanel.setVisible(false);
        modificarEmpleadoPanel.setVisible(false);
        passwordPanel.setVisible(false);
        passwordPanel1.setVisible(false);
        nCoicidenLabel.setVisible(false);
        ImageIcon icon = new ImageIcon("icon/escudo.png");
        setIconImage(icon.getImage());
        ocultarDatos();
        cargarDepartamentos(listaDepartamento);
        crearDepartamentosTabla();
        this.empleado=empleado;
        cargarDatosEmpleados();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        empresasTabbedPane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        nombreTextField1 = new javax.swing.JTextField();
        nombreLabel2 = new javax.swing.JLabel();
        nifLabel1 = new javax.swing.JLabel();
        nifTextField1 = new javax.swing.JLabel();
        oficioLabel1 = new javax.swing.JLabel();
        oficioTextField1 = new javax.swing.JLabel();
        tipoLabel1 = new javax.swing.JLabel();
        tipoTextField1 = new javax.swing.JLabel();
        altaLabel1 = new javax.swing.JLabel();
        fechaAltaTextField1 = new javax.swing.JLabel();
        salarioLabel1 = new javax.swing.JLabel();
        salarioTextField1 = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        idTextField1 = new javax.swing.JLabel();
        actualizarEmpleadoButton1 = new javax.swing.JButton();
        masInfoCheckBox = new javax.swing.JCheckBox();
        passwordCheckBox1 = new javax.swing.JCheckBox();
        passwordPanel1 = new javax.swing.JPanel();
        passwordField3 = new javax.swing.JPasswordField();
        passwordField4 = new javax.swing.JPasswordField();
        nCoicidenLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        modificarEmpleadoPanel = new javax.swing.JPanel();
        idTextField = new javax.swing.JTextField();
        fechaAltaTextField = new javax.swing.JTextField();
        administrativoRadioButton = new javax.swing.JRadioButton();
        empleadoRadioButton = new javax.swing.JRadioButton();
        oficioTextField = new javax.swing.JTextField();
        nifTextField = new javax.swing.JTextField();
        nombreEmpleadoTextField = new javax.swing.JTextField();
        nombreLabel1 = new javax.swing.JLabel();
        nifLabel = new javax.swing.JLabel();
        oficioLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        altaLabel = new javax.swing.JLabel();
        salarioLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        porcentajeSpinner = new javax.swing.JSpinner();
        resultSaldoLabel = new javax.swing.JLabel();
        salarioField = new javax.swing.JLabel();
        crearEmpleadoButton = new javax.swing.JButton();
        borrarEmpleadoButton = new javax.swing.JButton();
        actualizarEmpleadoButton = new javax.swing.JButton();
        calcularButtom = new javax.swing.JButton();
        passwordCheckBox = new javax.swing.JCheckBox();
        passwordPanel = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        nCoicidenLabel = new javax.swing.JLabel();
        generaPasswordButton = new javax.swing.JButton();
        newPasswordLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        empleadosTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        dniComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        departamentoComboBox = new javax.swing.JComboBox<>();
        modificarDepartamentoPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        ubicacionLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        ubicacionTextField = new javax.swing.JTextField();
        idSpinner = new javax.swing.JSpinner();
        actualizarDepartamentoButton = new javax.swing.JButton();
        crearDepartamentoButton = new javax.swing.JButton();
        borrarDepartamentoButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        departamentoTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        empleadosDepartamentoTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nombreDepartamentoComboBox = new javax.swing.JComboBox<>();
        dniUser = new javax.swing.JLabel();
        nombreUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logoUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tituloLabel.setText("DATOS EMPLEADO");

        nombreTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextField1ActionPerformed(evt);
            }
        });

        nombreLabel2.setText("Nombre: ");

        nifLabel1.setText("NIF: ");

        oficioLabel1.setText("Oficio: ");

        tipoLabel1.setText("Tipo: ");

        altaLabel1.setText("Fecha Alta: ");

        salarioLabel1.setText("Salario: ");

        idLabel2.setText("ID: ");

        actualizarEmpleadoButton1.setIcon(new ImageIcon("src/main/java/Vista/Png/update-x1.png"));
        actualizarEmpleadoButton1.setText("Actualizar");
        actualizarEmpleadoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEmpleadoButton1ActionPerformed(evt);
            }
        });

        masInfoCheckBox.setText("Mostrar mas Informacion");
        masInfoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masInfoCheckBoxActionPerformed(evt);
            }
        });

        passwordCheckBox1.setText("Cambiar Contraseña");
        passwordCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckBox1ActionPerformed(evt);
            }
        });

        passwordPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nCoicidenLabel1.setText("*No coiciden ");

        javax.swing.GroupLayout passwordPanel1Layout = new javax.swing.GroupLayout(passwordPanel1);
        passwordPanel1.setLayout(passwordPanel1Layout);
        passwordPanel1Layout.setHorizontalGroup(
            passwordPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(passwordPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(passwordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(nCoicidenLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        passwordPanel1Layout.setVerticalGroup(
            passwordPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nCoicidenLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(masInfoCheckBox)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altaLabel1)
                            .addComponent(nombreLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nifLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oficioLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salarioLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipoLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(nombreTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                                .addGap(376, 376, 376))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(salarioTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(oficioTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nifTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(fechaAltaTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordCheckBox1))
                        .addGap(351, 351, 351))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(actualizarEmpleadoButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masInfoCheckBox)
                .addGap(4, 4, 4)
                .addComponent(tituloLabel)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel2)
                    .addComponent(nombreTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nifLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nifTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oficioLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oficioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoLabel1)
                    .addComponent(tipoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(altaLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaAltaTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salarioLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salarioTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(passwordCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(actualizarEmpleadoButton1)
                .addGap(29, 29, 29))
        );

        empresasTabbedPane.addTab("Usuario", jPanel3);

        modificarEmpleadoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fechaAltaTextField.setText("aaaa-mm-dd");
        fechaAltaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaAltaTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(administrativoRadioButton);
        administrativoRadioButton.setText("Administrativo");

        buttonGroup1.add(empleadoRadioButton);
        empleadoRadioButton.setText("Empleado");

        oficioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oficioTextFieldActionPerformed(evt);
            }
        });

        nifTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nifTextFieldActionPerformed(evt);
            }
        });

        nombreEmpleadoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoTextFieldActionPerformed(evt);
            }
        });

        nombreLabel1.setText("Nombre: ");

        nifLabel.setText("NIF: ");

        oficioLabel.setText("Oficio: ");

        tipoLabel.setText("Tipo: ");

        altaLabel.setText("Fecha Alta: ");

        salarioLabel.setText("Salario: ");

        idLabel1.setText("ID: ");

        porcentajeSpinner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                porcentajeSpinnerFocusLost(evt);
            }
        });
        porcentajeSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porcentajeSpinnerMouseClicked(evt);
            }
        });

        resultSaldoLabel.setText("%");

        crearEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/addUser-x1.png"));
        crearEmpleadoButton.setText("Crear");
        crearEmpleadoButton.setDisplayedMnemonicIndex(4);
        crearEmpleadoButton.setIconTextGap(0);
        crearEmpleadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEmpleadoButtonActionPerformed(evt);
            }
        });

        borrarEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/delete-x1.png"));
        borrarEmpleadoButton.setText("Borrar");
        borrarEmpleadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEmpleadoButtonActionPerformed(evt);
            }
        });

        actualizarEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/update-x1.png"));
        actualizarEmpleadoButton.setText("Actualizar");
        actualizarEmpleadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEmpleadoButtonActionPerformed(evt);
            }
        });

        calcularButtom.setText("Calcular");
        calcularButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtomActionPerformed(evt);
            }
        });

        passwordCheckBox.setText("Cambiar Contraseña");
        passwordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordCheckBoxActionPerformed(evt);
            }
        });

        passwordPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        nCoicidenLabel.setText("*No coiciden ");

        generaPasswordButton.setText("Generar");
        generaPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaPasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nCoicidenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(passwordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(passwordField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generaPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nCoicidenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(generaPasswordButton))
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout modificarEmpleadoPanelLayout = new javax.swing.GroupLayout(modificarEmpleadoPanel);
        modificarEmpleadoPanel.setLayout(modificarEmpleadoPanelLayout);
        modificarEmpleadoPanelLayout.setHorizontalGroup(
            modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(altaLabel)
                                    .addComponent(oficioLabel)
                                    .addComponent(tipoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                        .addComponent(empleadoRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(administrativoRadioButton))
                                    .addComponent(fechaAltaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addComponent(actualizarEmpleadoButton)
                                .addGap(87, 87, 87)
                                .addComponent(crearEmpleadoButton))
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nifLabel)
                                    .addComponent(nombreLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreEmpleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(borrarEmpleadoButton)
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(salarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porcentajeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resultSaldoLabel)
                                .addGap(84, 84, 84)
                                .addComponent(calcularButtom))
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(passwordCheckBox))
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(idLabel1)
                                .addGap(22, 22, 22)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        modificarEmpleadoPanelLayout.setVerticalGroup(
            modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarEmpleadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmpleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel1))
                .addGap(10, 10, 10)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nifLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oficioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoRadioButton)
                    .addComponent(administrativoRadioButton)
                    .addComponent(tipoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaAltaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porcentajeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultSaldoLabel)
                    .addComponent(salarioField)
                    .addComponent(salarioLabel)
                    .addComponent(calcularButtom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarEmpleadoButton)
                    .addComponent(crearEmpleadoButton)
                    .addComponent(borrarEmpleadoButton))
                .addContainerGap())
        );

        empleadosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(empleadosTable);

        jLabel5.setText("Selecione un DNI:");

        dniComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarEmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(dniComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dniComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarEmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        empresasTabbedPane.addTab("Empleados", jPanel1);

        jLabel1.setText("Selecione el departamento:");

        departamentoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoComboBoxActionPerformed(evt);
            }
        });

        modificarDepartamentoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        idLabel.setText("Id:");

        nombreLabel.setText("Nombre:");

        ubicacionLabel.setText("Ubicacion:");

        actualizarDepartamentoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/update-x1.png"));
        actualizarDepartamentoButton.setText("Actualizar");
        actualizarDepartamentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDepartamentoButtonActionPerformed(evt);
            }
        });

        crearDepartamentoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/addUser-x1.png"));
        crearDepartamentoButton.setText("Crear");

        borrarDepartamentoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/delete-x1.png"));
        borrarDepartamentoButton.setText("Borrar");

        javax.swing.GroupLayout modificarDepartamentoPanelLayout = new javax.swing.GroupLayout(modificarDepartamentoPanel);
        modificarDepartamentoPanel.setLayout(modificarDepartamentoPanelLayout);
        modificarDepartamentoPanelLayout.setHorizontalGroup(
            modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarDepartamentoPanelLayout.createSequentialGroup()
                                .addComponent(ubicacionLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ubicacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(nombreLabel))
                                    .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(idLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(actualizarDepartamentoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crearDepartamentoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarDepartamentoButton)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        modificarDepartamentoPanelLayout.setVerticalGroup(
            modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarDepartamentoPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubicacionLabel)
                    .addComponent(ubicacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarDepartamentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarDepartamentoButton)
                    .addComponent(crearDepartamentoButton)
                    .addComponent(borrarDepartamentoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        departamentoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(departamentoTable);

        empleadosDepartamentoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(empleadosDepartamentoTable);

        jLabel2.setText("Empleados del departamento:");

        nombreDepartamentoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDepartamentoComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(37, 37, 37)
                            .addComponent(departamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(modificarDepartamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nombreDepartamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(departamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(modificarDepartamentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreDepartamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        empresasTabbedPane.addTab("Departamentos", jPanel2);

        jButton1.setIcon(new ImageIcon("src/main/java/Vista/Png/cancel-x1.png"));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new ImageIcon("src/main/java/Vista/Png/cancel-x2.png"));
        jButton1.setSelectedIcon(new ImageIcon("src/main/java/Vista/Png/cancel-x2.png"));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new ImageIcon("src/main/java/Vista/Png/logOut-x1.png"));
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new ImageIcon("src/main/java/Vista/Png/logOut-x2.png"));
        jButton2.setSelectedIcon(new ImageIcon("src/main/java/Vista/Png/logOut-x2.png"));
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new ImageIcon("src/main/java/Vista/Png/info-x1.png"));
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new ImageIcon("src/main/java/Vista/Png/info-x2.png"));
        jButton3.setSelectedIcon(new ImageIcon("src/main/java/Vista/Png/info-x2.png"));
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        logoUser.setIcon(new ImageIcon("src/main/java/Vista/Png/login-x1.png"));

        jMenu5.setText("Herramientas");

        jMenuItem2.setText("Datos Modificable");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("Datos del usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Cerrar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Info");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empresasTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empresasTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departamentoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoComboBoxActionPerformed
        if(((String)departamentoComboBox.getSelectedItem()).equals("Crear")){
            actualizarDepartamentoButton.setVisible(false);
            borrarDepartamentoButton.setVisible(false);
            crearDepartamentoButton.setVisible(true);
            modificarDepartamentoPanel.setVisible(true);
            idSpinner.setValue(0);
        nombreTextField.setText("");
        ubicacionTextField.setText("");

        }else if(!((String)departamentoComboBox.getSelectedItem()).equals("...")){
            crearDepartamentoButton.setVisible(false);
            actualizarDepartamentoButton.setVisible(true);
            borrarDepartamentoButton.setVisible(true);            
            departamento=controlador.obtenerDepartamento(Integer.parseInt((String)departamentoComboBox.getSelectedItem()));
            cargarDatosDepartamento();
            cargarTablaEmpleadosDepartamento(controlador.selecionarEmpleadosPorIdControlador((int)departamentoComboBox.getSelectedItem()));
        }else{
            modificarDepartamentoPanel.setVisible(false);
        }
    }//GEN-LAST:event_departamentoComboBoxActionPerformed

    private void actualizarDepartamentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDepartamentoButtonActionPerformed
        actualizarDatosDepartamentos();
        controlador.actualizarDepartamento(departamento,id);
    }//GEN-LAST:event_actualizarDepartamentoButtonActionPerformed

    private void oficioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oficioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oficioTextFieldActionPerformed

    private void nifTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nifTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nifTextFieldActionPerformed

    private void nombreEmpleadoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoTextFieldActionPerformed

    private void dniComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniComboBoxActionPerformed
        if(((String)dniComboBox.getSelectedItem()).equals("Crear")){
            actualizarEmpleadoButton.setVisible(false);
            borrarEmpleadoButton.setVisible(false);
            crearEmpleadoButton.setVisible(true);
            modificarEmpleadoPanel.setVisible(true);
            calcularButtom.setVisible(false);
            resultSaldoLabel.setVisible(false);
            salarioField.setVisible(false);
            passwordCheckBox.setVisible(false);
            passwordPanel.setVisible(true);
            nombreTextField.setText("");
                    nifTextField.setText("");
                    oficioTextField.setText("");
                            empleadoRadioButton.setSelected(false);
                            administrativoRadioButton.setSelected(false);
                    fechaAltaTextField.setText("");
                    salarioField.setText("");
                    idTextField.setText("");

        }else if(!((String)dniComboBox.getSelectedItem()).equals("...")){
            crearEmpleadoButton.setVisible(false);
            actualizarEmpleadoButton.setVisible(true);
            borrarEmpleadoButton.setVisible(true);   
            modificarEmpleadoPanel.setVisible(true);
            rellenarFormularioEmpleado();
        }else{
            modificarEmpleadoPanel.setVisible(false);
        }
    }//GEN-LAST:event_dniComboBoxActionPerformed

    private void actualizarEmpleadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEmpleadoButtonActionPerformed
        if(!camposVacios()){
            String nif = empleadoTratado.getNif();
            try {
                if(passwordCheckBox.isSelected()){
                    if(compararPassword()){
                        
                        actualizarDatosEmpleado();

                        if(!(resultSaldoLabel.getText().equals("%"))){
                            empleadoTratado.setSalario(0);
                            controlador.actualizarEmpleado(empleadoTratado,nif,new String (passwordField1.getPassword()));
                            controlador.actualizarSalarioControlador(Double.parseDouble(resultSaldoLabel.getText()),empleadoTratado.getNif());
                        }else{
                            controlador.actualizarEmpleado(empleadoTratado,nif,new String (passwordField1.getPassword()));
                        }
                            nCoicidenLabel.setVisible(false);
                    }else{
                        nCoicidenLabel.setVisible(true);
                    }              
                }else{
                   if(!(resultSaldoLabel.getText().equals("%"))){
                        empleadoTratado.setSalario(0);
                        controlador.actualizarEmpleado(empleadoTratado,nif);
                        controlador.actualizarSalarioControlador(Double.parseDouble(resultSaldoLabel.getText()),empleadoTratado.getNif());
                    }else{
                        controlador.actualizarEmpleado(empleadoTratado,nif);
                    }
                        nCoicidenLabel.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmpleadosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "No te pases de listo :|", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_actualizarEmpleadoButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginGUI miLogin =  new LoginGUI();
        miLogin.setVisible(true);
        miLogin.setLocationRelativeTo(null);//hace que La ventana salga Centrada
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void porcentajeSpinnerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_porcentajeSpinnerFocusLost
        double porcentaje = empleadoTratado.getSalario()*(Integer.parseInt(porcentajeSpinner.getValue().toString())*100);
        System.out.println(porcentaje);
        resultSaldoLabel.setText(String.valueOf(empleadoTratado.getSalario()+porcentaje));
    }//GEN-LAST:event_porcentajeSpinnerFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechaAltaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaAltaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaAltaTextFieldActionPerformed

    private void porcentajeSpinnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porcentajeSpinnerMouseClicked
       double porcentaje = empleadoTratado.getSalario()*(Integer.parseInt(porcentajeSpinner.getValue().toString())*100);
        System.out.println(porcentaje);
        resultSaldoLabel.setText(String.valueOf(empleadoTratado.getSalario()+porcentaje));
    }//GEN-LAST:event_porcentajeSpinnerMouseClicked

    private void calcularButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtomActionPerformed
        double porcentaje = empleadoTratado.getSalario()*(Double.parseDouble(porcentajeSpinner.getValue().toString())/100);
        System.out.println(porcentaje);
        resultSaldoLabel.setText(String.valueOf(empleadoTratado.getSalario()+porcentaje));
    }//GEN-LAST:event_calcularButtomActionPerformed

    private void passwordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckBoxActionPerformed
        if(passwordCheckBox.isSelected())
        passwordPanel.setVisible(true);
        else
        passwordPanel.setVisible(false);
        nCoicidenLabel.setVisible(false);
    }//GEN-LAST:event_passwordCheckBoxActionPerformed

    private void borrarEmpleadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEmpleadoButtonActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea borrar\n el usuario con DNI: "+empleadoTratado.getNif()+"?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            controlador.borrarEmpleadoControlador(empleadoTratado.getNif());
        }
    }//GEN-LAST:event_borrarEmpleadoButtonActionPerformed

    private void crearEmpleadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEmpleadoButtonActionPerformed
        if(!camposVacios()){
            
            if(compararPassword()){
                    actualizarDatosNuevoEmpleado();
                     if(!comprobarDNI(empleadoTratado.getNif())){
                        controlador.crearEmpleadoControlador(empleadoTratado,new String (passwordField1.getPassword()));
                        nCoicidenLabel.setVisible(false);
                     }else{
                        JOptionPane.showMessageDialog(null, "Este usuario ya existe en el sistema", "No te pases de listo :|", JOptionPane.WARNING_MESSAGE); 
                     }
                }else{
                    nCoicidenLabel.setVisible(true);
                }
        }else{
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios", "No te pases de listo :|", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_crearEmpleadoButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Aplicacion creada por Guzman Martinez Santos de 2ºDAM.\n Proyecto de las asignatura de AED y DAD en CIFP Cesar Manrrique");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombreTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextField1ActionPerformed

    private void actualizarEmpleadoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEmpleadoButton1ActionPerformed
       
            if(passwordCheckBox1.isSelected()){
                if(compararPassword2()){
//                    actualizarDatosEmpleado();
                    controlador.updateNombreControlador(nombreTextField1.getText(),empleado.getNif(),new String (passwordField1.getPassword()));
                    nCoicidenLabel1.setVisible(false);
                }else{
                    nCoicidenLabel1.setVisible(true);
                }              
            }else{
//                actualizarDatosEmpleado();
                controlador.updateNombreControlador(nombreTextField1.getText(),empleado.getNif());
            }
        
    }//GEN-LAST:event_actualizarEmpleadoButton1ActionPerformed

    private void masInfoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masInfoCheckBoxActionPerformed
        if(masInfoCheckBox.isSelected())
            mostrarDatos();
        else
            ocultarDatos();
    }//GEN-LAST:event_masInfoCheckBoxActionPerformed

    private void passwordCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordCheckBox1ActionPerformed
        if(passwordCheckBox1.isSelected())
        passwordPanel1.setVisible(true);
        else
        passwordPanel1.setVisible(false);
        nCoicidenLabel1.setVisible(false);
    }//GEN-LAST:event_passwordCheckBox1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ocultarDatos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        LoginGUI miLogin =  new LoginGUI();
        miLogin.setVisible(true);
        miLogin.setLocationRelativeTo(null);//hace que La ventana salga Centrada
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        JOptionPane.showMessageDialog(null, "Aplicacion creada por Guzman Martinez Santos de 2ºDAM.\n Proyecto de las asignatura de AED y DAD en CIFP Cesar Manrrique");
    }//GEN-LAST:event_jMenu6MouseClicked

    private void generaPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaPasswordButtonActionPerformed
        String newPassword = generarPassword();
        newPasswordLabel.setText(newPassword);
        passwordField1.setText(newPassword);
        passwordField2.setText(newPassword);
    }//GEN-LAST:event_generaPasswordButtonActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void nombreDepartamentoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDepartamentoComboBoxActionPerformed
               String nombre = (String)nombreDepartamentoComboBox.getSelectedItem();
                 if(!((String)nombreDepartamentoComboBox.getSelectedItem()).equals("...")){
                  for (DepartamentoVO departamento : listaDepartamentosVO) {
                      if(departamento.getNombre().equals(nombre)){
                          cargarTablaEmpleadosDepartamento(controlador.selecionarEmpleadosPorIdControlador(departamento.getId()));
                      }
                  }
                 }
               
    }//GEN-LAST:event_nombreDepartamentoComboBoxActionPerformed
//
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
//            java.util.logging.Logger.getLogger(AdministrativosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdministrativosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdministrativosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdministrativosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdministrativosGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDepartamentoButton;
    private javax.swing.JButton actualizarEmpleadoButton;
    private javax.swing.JButton actualizarEmpleadoButton1;
    private javax.swing.JRadioButton administrativoRadioButton;
    private javax.swing.JLabel altaLabel;
    private javax.swing.JLabel altaLabel1;
    private javax.swing.JButton borrarDepartamentoButton;
    private javax.swing.JButton borrarEmpleadoButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularButtom;
    private javax.swing.JButton crearDepartamentoButton;
    private javax.swing.JButton crearEmpleadoButton;
    private javax.swing.JComboBox<String> departamentoComboBox;
    private javax.swing.JTable departamentoTable;
    private javax.swing.JComboBox<String> dniComboBox;
    private javax.swing.JLabel dniUser;
    private javax.swing.JRadioButton empleadoRadioButton;
    private javax.swing.JTable empleadosDepartamentoTable;
    private javax.swing.JTable empleadosTable;
    private javax.swing.JTabbedPane empresasTabbedPane;
    private javax.swing.JTextField fechaAltaTextField;
    private javax.swing.JLabel fechaAltaTextField1;
    private javax.swing.JButton generaPasswordButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JSpinner idSpinner;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel idTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoUser;
    private javax.swing.JCheckBox masInfoCheckBox;
    private javax.swing.JPanel modificarDepartamentoPanel;
    private javax.swing.JPanel modificarEmpleadoPanel;
    private javax.swing.JLabel nCoicidenLabel;
    private javax.swing.JLabel nCoicidenLabel1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JLabel nifLabel;
    private javax.swing.JLabel nifLabel1;
    private javax.swing.JTextField nifTextField;
    private javax.swing.JLabel nifTextField1;
    private javax.swing.JComboBox<String> nombreDepartamentoComboBox;
    private javax.swing.JTextField nombreEmpleadoTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel nombreLabel2;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField nombreTextField1;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JLabel oficioLabel;
    private javax.swing.JLabel oficioLabel1;
    private javax.swing.JTextField oficioTextField;
    private javax.swing.JLabel oficioTextField1;
    private javax.swing.JCheckBox passwordCheckBox;
    private javax.swing.JCheckBox passwordCheckBox1;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPasswordField passwordField3;
    private javax.swing.JPasswordField passwordField4;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel passwordPanel1;
    private javax.swing.JSpinner porcentajeSpinner;
    private javax.swing.JLabel resultSaldoLabel;
    private javax.swing.JLabel salarioField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JLabel salarioLabel1;
    private javax.swing.JLabel salarioTextField1;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tipoLabel1;
    private javax.swing.JLabel tipoTextField1;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel ubicacionLabel;
    private javax.swing.JTextField ubicacionTextField;
    // End of variables declaration//GEN-END:variables
   public void calcularPorcentaje() throws InterruptedException{
       int n=1;
       while(n==1){
        double porcentaje = empleadoTratado.getSalario()*(Integer.parseInt(porcentajeSpinner.getValue().toString())*100);
        System.out.println(porcentaje);
        resultSaldoLabel.setText(String.valueOf(empleadoTratado.getSalario()+porcentaje));
        sleep(1000);
       }
       //((String)departamentoComboBox.getSelectedItem()).equals("Crear")
   }
    
    public void cargarDepartamentos(ArrayList<Integer> listaDepartamento){
        departamentoComboBox.addItem("...");
        ArrayList<Integer> listaDepartamentos = listaDepartamento;
            for (Integer departamento : listaDepartamentos) {
                departamentoComboBox.addItem(Integer.toString(departamento));
            }
        departamentoComboBox.addItem("Crear");
        nombreDepartamentoComboBox.addItem("...");
        listaDepartamentosVO = controlador.listaDepartamentosVOControlador();
            for (DepartamentoVO departamento : listaDepartamentosVO) {
                nombreDepartamentoComboBox.addItem(departamento.getNombre());
            }
        
        
    }
    public void cargarDatosDepartamento(){
        idSpinner.setValue(departamento.getId());
        nombreTextField.setText(departamento.getNombre());
        ubicacionTextField.setText(departamento.getUbicacion());
        modificarDepartamentoPanel.setVisible(true);
    }
    public void actualizarDatosDepartamentos(){
        id = departamento.getId();
        departamento.setId(Integer.parseInt(idSpinner.getValue().toString()));
        departamento.setNombre(nombreTextField.getText());
        departamento.setUbicacion(ubicacionTextField.getText());
        
    }
    public void crearDepartamentosTabla(){
        ArrayList<DepartamentoVO> listaDepartamentoVO;
        listaDepartamentoVO= controlador.listaDepartamentosVOControlador();
        DefaultTableModel modelo = (DefaultTableModel)departamentoTable.getModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ubicacion");
            for (DepartamentoVO departamentoVO : listaDepartamentoVO) {
                Object[] datos ={departamentoVO.getId(),departamentoVO.getNombre(),departamentoVO.getUbicacion()};
                modelo.addRow(datos);
            }      
    }
    //---------Empleado-------//
    public void cargarDatosEmpleados(){
        dniUser.setText(empleado.getNif());
        nifTextField1.setText(empleado.getNif());
        nombreUser.setText(empleado.getNombre());
        nombreTextField1.setText(empleado.getNombre());
        oficioTextField1.setText(empleado.getOficio());
        switch (empleado.getTipo()) {
            case "Empleado":
                tipoTextField1.setText("Empleado");
                break;
            case "Administrativo":
                tipoTextField1.setText("Administrativo");
                break;
            default:
                throw new AssertionError();
        }
        fechaAltaTextField1.setText(empleado.getFechaAlta());
        salarioTextField1.setText(String.valueOf(empleado.getSalario()));
        idTextField1.setText(Integer.toString(empleado.getId()));
        getListaEmpleados();
        cargarEmpleadosDni();
        crearEmpleadoTabla();
    }
    
    public void getListaEmpleados(){
        listaEmpleados= controlador.listaEmpleadosControlador();
    }
    public void cargarEmpleadosDni(){
        dniComboBox.addItem("...");
            for (EmpleadoVO empleado : listaEmpleados) {
                dniComboBox.addItem(empleado.getNif());
            }
        dniComboBox.addItem("Crear");
    }
    public void crearEmpleadoTabla(){
        DefaultTableModel modelo = (DefaultTableModel)empleadosTable.getModel();
        modelo.addColumn("mif");
        modelo.addColumn("Nombre");
        modelo.addColumn("tipo");
        modelo.addColumn("oficio");
        modelo.addColumn("salario");
        modelo.addColumn("id");
            for (EmpleadoVO empleado : listaEmpleados) {
                Object[] datos ={empleado.getNif(),empleado.getNombre(),empleado.getTipo(),empleado.getOficio(),empleado.getSalario(),empleado.getId()};
                modelo.addRow(datos);
            }      
    }
    private void rellenarFormularioEmpleado() {
            for (EmpleadoVO empleado : listaEmpleados) {
                if(empleado.getNif().equals(dniComboBox.getSelectedItem())){
                    empleadoTratado=empleado;
                    nombreEmpleadoTextField.setText(empleado.getNombre());
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
                    salarioField.setText(String.valueOf(empleado.getSalario()));
                    idTextField.setText(Integer.toString(empleado.getId()));
                    break;
                }
                
            }
        
    }
    private boolean compararPassword(){
        boolean coinciden = true;
        if(!(new String(passwordField1.getPassword()).equals(new String (passwordField2.getPassword())))){
            nCoicidenLabel.setText("No coiciden");
             coinciden=false;
        }
        if(!new String (passwordField2.getPassword()).matches("^[a-zA-Z0-9]{8,}$")){
            nCoicidenLabel.setText("La contraseña introducida no cumple los requesitos"); 
            coinciden= false;
        }
        return coinciden;           
    }
    private boolean compararPassword2(){

         boolean coinciden = true;
        if(!(new String(passwordField3.getPassword()).equals(new String (passwordField4.getPassword())))){
            nCoicidenLabel1.setText("No coiciden");
             coinciden=false;
        }
        if(!new String (passwordField3.getPassword()).matches("^[a-zA-Z0-9]{8,}$")){
            nCoicidenLabel1.setText("La contraseña introducida no cumple los requesitos"); 
            coinciden= false;
        }
        return coinciden; 
    }
    private void actualizarDatosEmpleado() {
            try {
                empleadoTratado.setNif(nifTextField.getText());
                empleadoTratado.setNombre(nombreEmpleadoTextField.getText());
                empleadoTratado.setOficio(oficioTextField.getText());
                if(empleadoRadioButton.isSelected())
                    empleadoTratado.setTipo("Empleado");
                else
                    empleadoTratado.setTipo("Administrativo");
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
                java.util.Date date = sdf1.parse(fechaAltaTextField.getText());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                empleadoTratado.setFechaAlta(sqlDate);
                if(!resultSaldoLabel.getText().equals("%"))
                    empleadoTratado.setSalario(Double.parseDouble(resultSaldoLabel.getText())); 
                empleadoTratado.setId(Integer.parseInt(idTextField.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(AdministrativosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void actualizarDatosNuevoEmpleado() {
        empleadoTratado = new EmpleadoVO();
            try {
                empleadoTratado.setNif(nifTextField.getText());
                empleadoTratado.setNombre(nombreEmpleadoTextField.getText());
                empleadoTratado.setOficio(oficioTextField.getText());
                if(empleadoRadioButton.isSelected())
                    empleadoTratado.setTipo("Empleado");
                else
                    empleadoTratado.setTipo("Administrativo");
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
                java.util.Date date = sdf1.parse(fechaAltaTextField.getText());
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                empleadoTratado.setFechaAlta(sqlDate);    
                empleadoTratado.setSalario(Double.parseDouble(porcentajeSpinner.getValue().toString())); 
                empleadoTratado.setId(Integer.parseInt(idTextField.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(AdministrativosGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public boolean camposVacios(){
        boolean vacio = false;
        if(nifTextField.getText().length()==0)
            vacio=true;
        if(nombreEmpleadoTextField.getText().length()==0)
            vacio=true;
        if(oficioTextField.getText().length()==0)
            vacio=true;
        if(fechaAltaTextField.getText().length()==0)
            vacio=true;
        if(idTextField.getText().length()==0)
            vacio=true;
        if(passwordCheckBox.isSelected()){
            if(passwordField1.getText().length()==0)
                vacio=true;
            if(passwordField2.getText().length()==0)
                vacio=true;
        }
        return vacio;
    }
    public void ocultarDatos(){
        fechaAltaTextField1.setVisible(false);
        altaLabel1.setVisible(false);
        idTextField1.setVisible(false);
        idLabel2.setVisible(false);
        nifTextField1.setVisible(false);
        nifLabel1.setVisible(false);
        oficioTextField1.setVisible(false);
        oficioLabel1.setVisible(false);
        tipoTextField1.setVisible(false);
        tipoLabel1.setVisible(false); 
        salarioTextField1.setVisible(false);
        salarioLabel1.setVisible(false);
    }
    public void mostrarDatos(){
        fechaAltaTextField1.setVisible(true);
        altaLabel1.setVisible(true);
        idTextField1.setVisible(true);
        idLabel1.setVisible(true);
        nifTextField1.setVisible(true);
        nifLabel1.setVisible(true);
        oficioTextField1.setVisible(true);
        oficioLabel1.setVisible(true);
        tipoTextField1.setVisible(true);
        tipoLabel1.setVisible(true);
        salarioTextField1.setVisible(false);
        salarioLabel1.setVisible(false);
    }
    public String generarPassword(){
        String password="";
        Random r = new Random();
        int n1= r.nextInt(9)+0;
        int n2= r.nextInt(9)+0;
        int n3= r.nextInt(9)+0;
        int n4= r.nextInt(9)+0;
        password += String.valueOf(n4)+String.valueOf(n3)+String.valueOf(n2)+String.valueOf(n1);
        System.out.println("password");
        return password;
    }
    public boolean comprobarDNI(String dni){
         boolean existe = false;
            for (EmpleadoVO empleado : listaEmpleados) {
                if(dni.equals(empleado.getNif())){
                    existe=true;
                    break;
                }
            }
            
            return existe;
    }
    public void cargarTablaEmpleadosDepartamento(ArrayList <EmpleadoVO> empleadosList){
        DefaultTableModel modelo2 = (DefaultTableModel)empleadosDepartamentoTable.getModel();
        modelo2.addColumn("nif");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("tipo");
        modelo2.addColumn("oficio");
        modelo2.addColumn("salario");
        modelo2.addColumn("id");
            for (EmpleadoVO empleado : empleadosList) {
                Object[] datos ={empleado.getNif(),empleado.getNombre(),empleado.getTipo(),empleado.getOficio(),empleado.getSalario(),empleado.getId()};
                modelo2.addRow(datos);
            }
        
    }
    
    
}
//DELIMITER $$
//  CREATE PROCEDURE `aumentarSalario` (IN total DOUBLE,IN dni varchar(9))
//  BEGIN
//  UPDATE empleados SET salario = total WHERE nif= dni;
//END $$