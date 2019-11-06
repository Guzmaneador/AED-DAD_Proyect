package Controlador;

import Modelo.EmpleadosDAO.EmpleadoVO;
import java.sql.SQLException;

/**
 *
 * @author Guzman
 */
public interface Controlador {
    public void iniciar();
    public void actualizarEmpleado(EmpleadoVO empleado) throws SQLException;
    public void login() throws SQLException;
}
