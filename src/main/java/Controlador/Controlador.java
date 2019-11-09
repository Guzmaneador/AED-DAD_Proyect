package Controlador;

import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoVO;
import java.sql.SQLException;

/**
 *
 * @author Guzman
 */
public interface Controlador {
    public void iniciar();
    public void actualizarEmpleado(EmpleadoVO empleado) throws SQLException;
    public void actualizarEmpleado(EmpleadoVO empleado,String password) throws SQLException;
    public void login() throws SQLException;
    public DepartamentoVO obtenerDepartamento(int id);
}
