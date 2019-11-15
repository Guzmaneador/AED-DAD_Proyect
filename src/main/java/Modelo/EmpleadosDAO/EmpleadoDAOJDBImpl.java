package Modelo.EmpleadosDAO;

import Modelo.DepartamentosDAO.DepartamentoDAOJDBCImpl;
import Modelo.PoolConexiones;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;




/**
 *
 * @author Guzman
 */
public class EmpleadoDAOJDBImpl implements EmpleadoDAO{
    Connection conexion ;
    DataSource pool = new PoolConexiones().getPoolConexion();
    ResultSet resultado ;
    private final String SQL_SELECT_ALL= "SELECT * FROM empleados";
    private final String SQL_SELECT_EMPLEADO= "SELECT * FROM empleados WHERE nombre=?";
    private final String SQL_SELECT_EMPLEADO_ID= "SELECT * FROM empleados WHERE id=?";
    private final String SQL_UPDATE_PASSWORD="UPDATE login SET password=AES_ENCRYPT('NoLoVesJeJe', ?) WHERE nif=?";
    private final String SQL_UPDATE = "UPDATE empleados SET nif=?, nombre=?, tipo=?, oficio=?, fecha_alta=?, salario=?, id=? WHERE nif=?";
    private final String SQL_UPDATE_NOMBRE= "UPDATE empleados SET nombre=? WHERE nif=?";
    private final String SQL_DELETE = "DELETE FROM empleados WHERE nif=?";
    private final String SQL_INSERT = "Insert INTO empleados VALUES (?,?,?,?,?,?,?);";
    private final String SQL_INSERT_PASSWORD = "INSERT INTO login VALUES (?,AES_ENCRYPT('NoLoVesJeJe', ?));";
    private final String SQL_PROCEDURE_aumentarSalario= "{call aumentarSalario (?,?)}";


    public EmpleadoDAOJDBImpl() {
    }
    
    public void updateNombre(String nif,String nombre){
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE_NOMBRE);
            miPreStatment.setString(2, nombre);
            miPreStatment.setString(1, nif);
            System.out.println(miPreStatment);
            miPreStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateNombre(String nif,String nombre,String password){
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE_NOMBRE);
            miPreStatment.setString(1, nombre);
            miPreStatment.setString(2, nif);
            System.out.println(miPreStatment);
            miPreStatment.executeUpdate();
            
            conexion = pool.getConnection();
            PreparedStatement miPreStatment2= conexion.prepareCall(SQL_UPDATE_PASSWORD);
            miPreStatment2.setString(1, password);
            miPreStatment2.setString(2, nif);
            miPreStatment2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String update(EmpleadoVO empleado,String nif) throws SQLException {
        conexion = pool.getConnection();
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
       miPreStatment.setString(1, empleado.getNif());
       miPreStatment.setString(2, empleado.getNombre());
       miPreStatment.setString(3, empleado.getTipo());
       miPreStatment.setString(4, empleado.getOficio());
       miPreStatment.setDate(5, empleado.getFechaAltaDate());
       miPreStatment.setDouble(6, empleado.getSalario());
       miPreStatment.setInt(7, empleado.getId());
       miPreStatment.setString(8, nif);
       System.out.println(miPreStatment);
       miPreStatment.executeUpdate();
       return "Empleado Actualizado correctamente";
    }
/*
    Sobre craga de metodos al tener diferente firma en la cual una incluira la contraseña y en la otra no
    */
    public String update (EmpleadoVO empleado, String nif ,String password) throws SQLException {
        conexion = pool.getConnection();
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
       miPreStatment.setString(1, empleado.getNif());
       miPreStatment.setString(2, empleado.getNombre());
       miPreStatment.setString(3, empleado.getTipo());
       miPreStatment.setString(4, empleado.getOficio());
       miPreStatment.setDate(5, empleado.getFechaAltaDate());
       miPreStatment.setDouble(6, empleado.getSalario());
       miPreStatment.setInt(7, empleado.getId());
       miPreStatment.setString(8, nif);
        System.out.println(miPreStatment);
       miPreStatment.executeUpdate();
       
       conexion = pool.getConnection();
       PreparedStatement miPreStatment2= conexion.prepareCall(SQL_UPDATE_PASSWORD);
       miPreStatment2.setString(1, password);
       miPreStatment2.setString(2, empleado.getNif());
       miPreStatment2.executeUpdate();
       return "Empleado Actualizado correctamente";
    }
    
    
    public EmpleadoVO optenerEmpleado(String nombre) throws SQLException {
       conexion = pool.getConnection();
       EmpleadoVO empleado;
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_EMPLEADO);
       miPreStatment.setString(1, nombre);
       resultado=miPreStatment.executeQuery();
       if(resultado.next()){
           empleado = new EmpleadoVO(resultado.getString("nif"),resultado.getString("nombre"),resultado.getString("tipo"),resultado.getString("oficio"),resultado.getDate("fecha_alta"),resultado.getDouble("salario"),resultado.getInt("id"));
           return empleado;
       }else{
            throw new UnsupportedOperationException("Error al hacer la caonsulta optenerEmpleado"); //To change body of generated methods, choose Tools | Templates.
       }
    }
    

    @Override
    public ArrayList<EmpleadoVO> listaEmpleadosVO() {
        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList<>();
        try {
            conexion = pool.getConnection();
            Statement miStatement = conexion.createStatement();
            resultado= miStatement.executeQuery(SQL_SELECT_ALL);
            while (resultado.next()){
                listaEmpleados.add(new EmpleadoVO(resultado.getString("nif"),resultado.getString("nombre"),resultado.getString("tipo"),resultado.getString("oficio"),resultado.getDate("fecha_alta"),resultado.getDouble("salario"),resultado.getInt("id")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEmpleados; 
    }
    
    @Override
    public void borarEmpleado(String nif){
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_DELETE);
            miPreStatment.setString(1, nif);
            System.out.println(miPreStatment);
            miPreStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void crearEmpleado(EmpleadoVO empleado,String password){
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_INSERT);
            miPreStatment.setString(1, empleado.getNif());
            miPreStatment.setString(2, empleado.getNombre());
            miPreStatment.setString(3, empleado.getTipo());
            miPreStatment.setString(4, empleado.getOficio());
            miPreStatment.setDate(5, empleado.getFechaAltaDate());
            miPreStatment.setDouble(6, empleado.getSalario());
            miPreStatment.setInt(7, empleado.getId());
            System.out.println(miPreStatment);
            miPreStatment.executeUpdate();
            
            conexion = pool.getConnection();
            PreparedStatement miPreStatment2= conexion.prepareCall(SQL_INSERT_PASSWORD);
            miPreStatment2.setString(1, empleado.getNif());
            miPreStatment2.setString(2, password);
            System.out.println(miPreStatment2);
            miPreStatment2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void actualizarSalario(double salario, String dni){
        try {
            conexion = pool.getConnection();
            CallableStatement cst = conexion.prepareCall(SQL_PROCEDURE_aumentarSalario);
             cst.setDouble(1, salario);
             cst.setString(2, dni);
//             cst.registerOutParameter(3, java.sql.Types.VARCHAR);
            cst.execute();
////            String dato = cst.getString(3);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<EmpleadoVO> selecionarEmpleadosPorId(int id){
        ArrayList<EmpleadoVO> listaEmpleados = new ArrayList<>();
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_EMPLEADO_ID);
            miPreStatment.setInt(1, id);
            System.out.println(miPreStatment);
            resultado = miPreStatment.executeQuery();
            while (resultado.next()){
                listaEmpleados.add(new EmpleadoVO(resultado.getString("nif"),resultado.getString("nombre"),resultado.getString("tipo"),resultado.getString("oficio"),resultado.getDate("fecha_alta"),resultado.getDouble("salario"),resultado.getInt("id")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOJDBImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaEmpleados;
    }
    
  

}