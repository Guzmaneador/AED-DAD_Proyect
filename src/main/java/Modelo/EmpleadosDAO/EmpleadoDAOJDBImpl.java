package Modelo.EmpleadosDAO;

import Modelo.PoolConexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;




/**
 *
 * @author Guzman
 */
public class EmpleadoDAOJDBImpl implements EmpleadoDAO{
    Connection conexion ;
    DataSource pool = new PoolConexiones().getPoolConexion();
    ResultSet resultado ;
    private final String SQL_SELECT_EMPLEADO= "SELECT * FROM empleados WHERE nombre=?";
    private final String SQL_UPDATE_PASSWORD="UPDATE login SET password=AES_ENCRYPT('NoLoVesJeJe', ?) WHERE nif=?";
    private final String SQL_UPDATE = "UPDATE empleados SET nif=?, nombre=?, tipo=?, oficio=?, fecha_alta=?, salario=?, id=? WHERE nombre=?";

    public EmpleadoDAOJDBImpl() {
    }
    
    
    public String update(EmpleadoVO empleado) throws SQLException {
        conexion = pool.getConnection();
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
       miPreStatment.setString(1, empleado.getNif());
       miPreStatment.setString(2, empleado.getNombre());
       miPreStatment.setString(3, empleado.getTipo());
       miPreStatment.setString(4, empleado.getOficio());
       miPreStatment.setDate(5, empleado.getFechaAltaDate());
       miPreStatment.setDouble(6, empleado.getSalario());
       miPreStatment.setInt(7, empleado.getId());
       miPreStatment.setString(8, empleado.getNombre());
       System.out.println(miPreStatment);
       miPreStatment.executeUpdate();
       return "Empleado Actualizado correctamente";
    }
/*
    Sobre craga de metodos al tener diferente firma en la cual una incluira la contraseña y en la otra no
    */
    public String update (EmpleadoVO empleado,String password) throws SQLException {
        conexion = pool.getConnection();
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
       miPreStatment.setString(1, empleado.getNif());
       miPreStatment.setString(2, empleado.getNombre());
       miPreStatment.setString(3, empleado.getTipo());
       miPreStatment.setString(4, empleado.getOficio());
       miPreStatment.setDate(5, empleado.getFechaAltaDate());
       miPreStatment.setDouble(6, empleado.getSalario());
       miPreStatment.setInt(7, empleado.getId());
       miPreStatment.setString(8, empleado.getNombre());
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
  

}