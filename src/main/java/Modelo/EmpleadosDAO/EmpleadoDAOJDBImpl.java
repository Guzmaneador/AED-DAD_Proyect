package Modelo.EmpleadosDAO;

import Modelo.PoolConexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;




/**
 *
 * @author Guzman
 */
public class EmpleadoDAOJDBImpl implements EmpleadoDAO{
    Connection conexion ;
    DataSource pool = new PoolConexiones().getPoolConexion();
    private final String SQL_SELECT_EMPLEADOS= "SELECT nombre FROM empleados";
    private final String SQL_SELECT_PASSWORD="SELECT nif FROM empleados WHERE id=?";
    private final String SQL_UPDATE = "UPDATE empleados SET nif=? nombre=? tipo=? oficio=? fecha_alta=? salario=? id=? WHERE nombre=?";

//    public EmpleadoDAOJDBImpl() throws SQLException {
//    }
    
    
    

    
    public String update(EmpleadoVO empleado) throws SQLException {
        conexion = pool.getConnection();
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
       miPreStatment.setString(1, empleado.getNif());
       miPreStatment.setString(2, empleado.getNombre());
       miPreStatment.setString(3, empleado.getTipo());
       miPreStatment.setString(4, empleado.getOficio());
       miPreStatment.setString(5, empleado.getFechaAlta());
       miPreStatment.setString(6, String.valueOf(empleado.getSalario()));
       miPreStatment.setString(7, Integer.toString(empleado.getId()));

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
  

}