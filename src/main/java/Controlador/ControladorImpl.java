package Controlador;

import Modelo.EmpleadosDAO.EmpleadoDAOJDBImpl;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.Modelo;
import Vista.Login.Empleado.EmpleadosGUI;
import Vista.Vista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guzman
 */
public class ControladorImpl implements Controlador {
    EmpleadoVO empleado;
    Modelo modelo;
    Vista vista;
    
    public ControladorImpl(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    @Override
    public void iniciar(){
        try {
            modelo.start(vista.getComandosSQLInicio());
            login();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void login() throws SQLException{
        empleado=modelo.login(vista.solicitarLogin());
        if(empleado.isLogeado()){
          analizarTipo();  
        }else{
            login();
        }
    }
    private void analizarTipo() throws SQLException{
        switch (empleado.getTipo()) {
            case "Empleado":
                EmpleadosGUI EmplGui = new EmpleadosGUI(empleado);
                EmplGui.setVisible(true);
                EmplGui.setLocationRelativeTo(null);
                
                break;
            case "Administrativo":
//                administrativoRadioButton.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    @Override
    public void actualizarEmpleado(EmpleadoVO empleado) throws SQLException{
        modelo.actualizarEmpleado(empleado);
    }
    public void actualizarEmpleado(EmpleadoVO empleado,String password) throws SQLException{
        modelo.actualizarEmpleado(empleado,password);
    }
    
    
   

}