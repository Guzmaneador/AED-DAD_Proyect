package Modelo;

import Modelo.DepartamentosDAO.*;
import Modelo.EmpleadosDAO.EmpleadoDAOJDBImpl;
import Modelo.EmpleadosDAO.EmpleadoVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Guzman
 */
public class ModeloImpl implements Modelo{
    private Connection conexion;
    EmpleadoDAOJDBImpl empleadoDao = new EmpleadoDAOJDBImpl();
    DepartamentoDAO departamentosDao = new DepartamentoDAOJDBCImpl();

    
    
    public void start(ArrayList<String> comandosSQL) throws SQLException{
        conexion = ConexionMySQL.getConexion();
        
        Statement crearDBTablas = conexion.createStatement();
        int resultadoUpdate;
        for (String comando : comandosSQL) {
                 resultadoUpdate = crearDBTablas.executeUpdate(comando);
//                 System.out.println(resultadoUpdate);
        }
        
//        conexion.close();
    }
    @Override
    public EmpleadoVO login(ArrayList<String> userPass)throws SQLException{
            /*En caso de que la clase login devuelva un nombre bacio devolvera 
            un objeto EmpleadoVo vacio y con el tipo logeado= false*/
            Login miLogin = new Login(userPass,conexion);  
            String nombre = miLogin.analizarDatos();
            if(!nombre.equals(""))
                return empleadoDao.optenerEmpleado(nombre);
            else
               return new EmpleadoVO(false);

    }
    
    public void actualizarEmpleado(EmpleadoVO empleado) throws SQLException{
        empleadoDao.update(empleado);
    }
    public void actualizarEmpleado(EmpleadoVO empleado,String password) throws SQLException{
        empleadoDao.update(empleado,password);
    }
    public ArrayList<Integer> dameDepartamentos(){
        return departamentosDao.listaDepartamentos();
    }
    public DepartamentoVO dameDepartamento(int id){
        return departamentosDao.dameDepartamentoId(id);
    }
    public void actualizarDepartamento(DepartamentoVO departamento,int id){
        departamentosDao.actualizar(departamento,id);
    }
    @Override
    public ArrayList<DepartamentoVO> listaDepartamentosVOModelo(){
        return departamentosDao.listaDepartamentosVO();
    }
    
    public ArrayList<EmpleadoVO> listaEmpleadoVOModelo(){
                return empleadoDao.listaEmpleadosVO();
   
    }
    

}