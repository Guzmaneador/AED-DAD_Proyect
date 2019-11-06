package Modelo;

import Modelo.EmpleadosDAO.EmpleadoVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public interface Modelo {
    public void start(ArrayList<String> comandosSQL) throws SQLException;
    public EmpleadoVO login(ArrayList<String> userPass)throws SQLException;
    public void actualizarEmpleado(EmpleadoVO empleado) throws SQLException;
    public void actualizarEmpleado(EmpleadoVO empleado,String password) throws SQLException;
}
