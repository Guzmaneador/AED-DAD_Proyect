
package Vista.Login.Administrativos;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.ModeloImpl;
import Vista.VistaImpl;
import java.util.ArrayList;
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
        DepartamentoVO departamento;
        ArrayList<EmpleadoVO> listaEmpleados;
        int id ;

    public AdministrativosGUI(ArrayList<Integer> listaDepartamento,EmpleadoVO empleado) {
        initComponents();
        modificarDepartamentoPanel.setVisible(false);
        modificarEmpleadoPanel.setVisible(false);
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
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        salarioField = new javax.swing.JLabel();
        crearEmpleadoButton = new javax.swing.JButton();
        borrarEmpleadoButton = new javax.swing.JButton();
        actualizarEmpleadoButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        actualizarButton = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
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

        modificarEmpleadoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fechaAltaTextField.setText("aaaa-mm-dd");

        administrativoRadioButton.setText("Administrativo");

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

        jLabel4.setText("jLabel4");

        crearEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/addUser-x1.png"));
        crearEmpleadoButton.setText("Crear");
        crearEmpleadoButton.setDisplayedMnemonicIndex(4);
        crearEmpleadoButton.setIconTextGap(0);

        borrarEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/delete-x1.png"));
        borrarEmpleadoButton.setText("Borrar");

        actualizarEmpleadoButton.setIcon(new ImageIcon("src/main/java/Vista/Png/update-x1.png"));
        actualizarEmpleadoButton.setText("Actualizar");
        actualizarEmpleadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarEmpleadoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modificarEmpleadoPanelLayout = new javax.swing.GroupLayout(modificarEmpleadoPanel);
        modificarEmpleadoPanel.setLayout(modificarEmpleadoPanelLayout);
        modificarEmpleadoPanelLayout.setHorizontalGroup(
            modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizarEmpleadoButton)
                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(altaLabel)
                            .addComponent(nifLabel)
                            .addComponent(nombreLabel1)
                            .addComponent(oficioLabel)
                            .addComponent(tipoLabel)
                            .addComponent(salarioLabel)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addComponent(idLabel1)
                                .addGap(10, 10, 10)))
                        .addGap(108, 108, 108)
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addComponent(empleadoRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(administrativoRadioButton))
                            .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fechaAltaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(nombreEmpleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                        .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(modificarEmpleadoPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(crearEmpleadoButton)))
                                .addGap(18, 18, 18)
                                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(borrarEmpleadoButton)
                                    .addComponent(jLabel4))))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        modificarEmpleadoPanelLayout.setVerticalGroup(
            modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarEmpleadoPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreLabel1)
                    .addComponent(nombreEmpleadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nifTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nifLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarEmpleadoPanelLayout.createSequentialGroup()
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oficioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oficioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoRadioButton)
                            .addComponent(administrativoRadioButton)
                            .addComponent(tipoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaAltaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(altaLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(salarioField)
                    .addComponent(salarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modificarEmpleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarEmpleadoButton)
                    .addComponent(crearEmpleadoButton)
                    .addComponent(borrarEmpleadoButton))
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

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
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarEmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(modificarEmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
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

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        crearButton.setText("Crear");

        borrarButton.setText("Borrar");

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
                        .addComponent(actualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarButton)))
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
                    .addComponent(actualizarButton)
                    .addComponent(crearButton)
                    .addComponent(borrarButton))
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
                .addContainerGap(116, Short.MAX_VALUE))
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
            .addGap(0, 456, Short.MAX_VALUE)
        );

        empresasTabbedPane.addTab("Usuario", jPanel3);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

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
                    .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empresasTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departamentoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoComboBoxActionPerformed
        if(((String)departamentoComboBox.getSelectedItem()).equals("Crear")){
            actualizarButton.setVisible(false);
            borrarButton.setVisible(false);
            crearButton.setVisible(true);
            modificarDepartamentoPanel.setVisible(true);
            idSpinner.setValue(0);
        nombreTextField.setText("");
        ubicacionTextField.setText("");

        }else if(!((String)departamentoComboBox.getSelectedItem()).equals("...")){
            crearButton.setVisible(false);
            actualizarButton.setVisible(true);
            borrarButton.setVisible(true);            
            departamento=controlador.obtenerDepartamento(Integer.parseInt((String)departamentoComboBox.getSelectedItem()));
            cargarDatosDepartamento();
        }else{
            modificarDepartamentoPanel.setVisible(false);
        }
    }//GEN-LAST:event_departamentoComboBoxActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        actualizarDatosDepartamentos();
        controlador.actualizarDepartamento(departamento,id);
    }//GEN-LAST:event_actualizarButtonActionPerformed

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
            actualizarButton.setVisible(false);
            borrarButton.setVisible(false);
            crearButton.setVisible(true);
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
            crearButton.setVisible(false);
            actualizarButton.setVisible(true);
            borrarButton.setVisible(true);   
            modificarEmpleadoPanel.setVisible(true);
            rellenarFormularioEmpleado();
        }else{
            modificarEmpleadoPanel.setVisible(false);
        }
    }//GEN-LAST:event_dniComboBoxActionPerformed

    private void actualizarEmpleadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarEmpleadoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarEmpleadoButtonActionPerformed
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
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton actualizarEmpleadoButton;
    private javax.swing.JRadioButton administrativoRadioButton;
    private javax.swing.JLabel altaLabel;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton borrarEmpleadoButton;
    private javax.swing.JButton crearButton;
    private javax.swing.JButton crearEmpleadoButton;
    private javax.swing.JComboBox<String> departamentoComboBox;
    private javax.swing.JTable depatamentosTable;
    private javax.swing.JComboBox<String> dniComboBox;
    private javax.swing.JLabel dniUser;
    private javax.swing.JRadioButton empleadoRadioButton;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logoUser;
    private javax.swing.JPanel modificarDepartamentoPanel;
    private javax.swing.JPanel modificarEmpleadoPanel;
    private javax.swing.JLabel nifLabel;
    private javax.swing.JTextField nifTextField;
    private javax.swing.JTextField nombreEmpleadoTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JLabel nombreUser;
    private javax.swing.JLabel oficioLabel;
    private javax.swing.JTextField oficioTextField;
    private javax.swing.JLabel salarioField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel ubicacionLabel;
    private javax.swing.JTextField ubicacionTextField;
    // End of variables declaration//GEN-END:variables
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
    private void rellenarFormularioEmpleado() {
            for (EmpleadoVO empleado : listaEmpleados) {
                if(empleado.getNif().equals(dniComboBox.getSelectedItem())){
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
    
}
