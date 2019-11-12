package Controlador;

import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoDAOJDBImpl;
import Modelo.EmpleadosDAO.EmpleadoVO;
import Modelo.Modelo;
import Vista.Login.Administrativos.AdministrativosGUI;
import Vista.Login.Empleado.EmpleadosGUI;
import Vista.Login.LoginGUI;
import Vista.Vista;
import java.sql.SQLException;
import java.util.ArrayList;
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
    LoginGUI logGui;
    
    public ControladorImpl(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    @Override
    public void iniciar(){
        try {
            modelo.start(vista.getComandosSQLInicio());
              logGui = new LoginGUI();
              logGui.setVisible(true);
              logGui.setLocationRelativeTo(null);
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void login(ArrayList<String> passUser) throws SQLException{
        empleado=modelo.login(passUser);
        if(empleado.isLogeado()){
          analizarTipo();  
        }else{
//            login();
        }
    }
    private void analizarTipo() throws SQLException{
        switch (empleado.getTipo()) {
            case "Empleado":
                EmpleadosGUI EmplGui = new EmpleadosGUI(empleado);
//                logGui.dispose();
                EmplGui.setVisible(true);
                EmplGui.setLocationRelativeTo(null);
                
                
                break;
            case "Administrativo":
             AdministrativosGUI AdminGui = new AdministrativosGUI(obtenerDepartamentos(),empleado);
                AdminGui.setVisible(true);
                AdminGui.setLocationRelativeTo(null);
//                 logGui.setVisible(false);

                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    @Override
    public void actualizarEmpleado(EmpleadoVO empleado,String nif) throws SQLException{
        modelo.actualizarEmpleado(empleado,nif);
    }
    @Override
    public void actualizarEmpleado(EmpleadoVO empleado,String nif,String password) throws SQLException{
        modelo.actualizarEmpleado(empleado,nif,password);
    }
    
    public ArrayList<Integer> obtenerDepartamentos(){
       return modelo.dameDepartamentos();
    }
    @Override
    public DepartamentoVO obtenerDepartamento(int id){
       return modelo.dameDepartamento(id);
    }
    @Override
    public void actualizarDepartamento(DepartamentoVO departamento, int id){
        modelo.actualizarDepartamento(departamento,id);
        
    }
    @Override
    public ArrayList<DepartamentoVO> listaDepartamentosVOControlador(){
        return modelo.listaDepartamentosVOModelo();
    } 
    @Override
    public ArrayList<EmpleadoVO> listaEmpleadosControlador(){
                return modelo.listaEmpleadoVOModelo();  
    }
    
    @Override
    public void borrarEmpleadoControlador(String nif){
        modelo.borrarEmpleadoModelo(nif);
    }
    
    public void crearEmpleadoControlador(EmpleadoVO empleado){
        modelo.crearEmpleadoModelo(empleado);
    }
    
    
   

}