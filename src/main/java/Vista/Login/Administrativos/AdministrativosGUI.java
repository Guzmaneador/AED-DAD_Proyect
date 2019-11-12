
package Vista.Login.Administrativos;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.ModeloImpl;
import Vista.Login.Empleado.EmpleadosGUI;
import Vista.VistaImpl;
import static java.lang.Thread.sleep;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
        int id ;

    public AdministrativosGUI(ArrayList<Integer> listaDepartamento,EmpleadoVO empleado) {
        initComponents();
        modificarDepartamentoPanel.setVisible(false);
        modificarEmpleadoPanel.setVisible(false);
        passwordPanel.setVisible(false);
        nCoicidenLabel.setVisible(false);
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
        depatamentosTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        dniUser = new javax.swing.JLabel();
        nombreUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logoUser = new javax.swing.JLabel();

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
                            .addComponent(actualizarEmpleadoButton)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nifLabel)
                                    .addComponent(nombreLabel1))
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreEmpleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                        .addComponent(crearEmpleadoButton)
                                        .addGap(138, 138, 138)
                                        .addComponent(borrarEmpleadoButton))))))
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
                        .addGap(81, 81, 81)
                        .addComponent(idLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordCheckBox)
                            .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
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
                .addContainerGap(28, Short.MAX_VALUE))
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

        depatamentosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(depatamentosTable);

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(241, Short.MAX_VALUE))
        );

        empresasTabbedPane.addTab("Departamentos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        empresasTabbedPane.addTab("Usuario", jPanel3);

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

        logoUser.setIcon(new ImageIcon("src/main/java/Vista/Png/login-x1.png"));

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(17, 17, 17)
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
        String nif = empleadoTratado.getNif();
        try {
            if(passwordCheckBox.isSelected()){
                if(compararPassword()){
                    actualizarDatosEmpleado();
                    controlador.actualizarEmpleado(empleadoTratado,nif,new String (passwordField1.getPassword()));
                    nCoicidenLabel.setVisible(false);
                }else{
                    nCoicidenLabel.setVisible(true);
                }              
            }else{
                actualizarDatosEmpleado();
                controlador.actualizarEmpleado(empleadoTratado,nif);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadosGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarEmpleadoButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
        controlador.borrarEmpleadoControlador(empleadoTratado.getNif());
    }//GEN-LAST:event_borrarEmpleadoButtonActionPerformed

    private void crearEmpleadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEmpleadoButtonActionPerformed
        actualizarDatosNuevoEmpleado();
        controlador.crearEmpleadoControlador(empleadoTratado);
    }//GEN-LAST:event_crearEmpleadoButtonActionPerformed
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
    private javax.swing.JRadioButton administrativoRadioButton;
    private javax.swing.JLabel altaLabel;
    private javax.swing.JButton borrarDepartamentoButton;
    private javax.swing.JButton borrarEmpleadoButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularButtom;
    private javax.swing.JButton crearDepartamentoButton;
    private javax.swing.JButton crearEmpleadoButton;
    private javax.swing.JComboBox<String> departamentoComboBox;
    private javax.swing.JTable depatamentosTable;
    private javax.swing.JComboBox<String> dniComboBox;
    private javax.swing.JLabel dniUser;
    private javax.swing.JRadioButton empleadoRadioButton;
    private javax.swing.JTable empleadosTable;
    private javax.swing.JTabbedPane empresasTabbedPane;
    private javax.swing.JTextField fechaAltaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JSpinner idSpinner;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoUser;
    private javax.swing.JPanel modificarDepartamentoPanel;
    private javax.swing.JPanel modificarEmpleadoPanel;
    private javax.swing.JLabel nCoicidenLabel;
    private javax.swing.JLabel nifLabel;
    private javax.swing.JTextField nifTextField;
    private javax.swing.JTextField nombreEmpleadoTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JLabel oficioLabel;
    private javax.swing.JTextField oficioTextField;
    private javax.swing.JCheckBox passwordCheckBox;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JSpinner porcentajeSpinner;
    private javax.swing.JLabel resultSaldoLabel;
    private javax.swing.JLabel salarioField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JLabel tipoLabel;
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
        DefaultTableModel modelo = (DefaultTableModel)depatamentosTable.getModel();
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
        nombreUser.setText(empleado.getNombre());
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
        boolean coinciden = false;
        if(new String(passwordField1.getPassword()).equals(new String (passwordField2.getPassword())))
             coinciden=true;       
        return coinciden;           
    }
    private void actualizarDatosEmpleado() {
            try {
                empleadoTratado.setNif(nifTextField.getText());
                empleadoTratado.setNombre(nombreTextField.getText());
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
                empleadoTratado.setNombre(nombreTextField.getText());
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
    
}
