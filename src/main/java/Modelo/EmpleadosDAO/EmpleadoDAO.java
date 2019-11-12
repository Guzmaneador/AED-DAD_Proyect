package Modelo.EmpleadosDAO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public interface EmpleadoDAO {
    public ArrayList<EmpleadoVO> listaEmpleadosVO() ;
    public void borarEmpleado(String nif) throws SQLException;
    
}