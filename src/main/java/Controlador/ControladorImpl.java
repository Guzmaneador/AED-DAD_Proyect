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
    public void login() throws SQLException{
        empleado=modelo.login(vista.solicitarLogin());
        if(empleado.isLogeado()){
          analizarTipo();  
        }else{
            login();
        }
    }
    public void analizarTipo() throws SQLException{
        switch (empleado.getTipo()) {
            case "Empleado":
                EmpleadosGUI EmplGui = new EmpleadosGUI(empleado);
                break;
            case "Administrativo":
//                administrativoRadioButton.setSelected(true);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
   

}