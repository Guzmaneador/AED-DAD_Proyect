package Controlador;

import Modelo.DepartamentosDAO.DepartamentoVO;
import Modelo.EmpleadosDAO.EmpleadoVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public interface Controlador {
    public void iniciar();
    public void actualizarEmpleado(EmpleadoVO empleado,String nif) throws SQLException;
    public void actualizarEmpleado(EmpleadoVO empleado,String nif,String password) throws SQLException;
    public void login(ArrayList<String> passUser) throws SQLException;
    public DepartamentoVO obtenerDepartamento(int id);
    public void actualizarDepartamento(DepartamentoVO departamento,int id);
    public ArrayList<DepartamentoVO> listaDepartamentosVOControlador();
    public ArrayList<EmpleadoVO> listaEmpleadosControlador();
    public void borrarEmpleadoControlador(String nif);
    public void crearEmpleadoControlador(EmpleadoVO empleado,String password);
    public void updateNombreControlador(String nif,String nombre);
    public void updateNombreControlador(String nif,String nombre,String password);
    public void actualizarSalarioControlador(Double salario,String dni);
    public ArrayList<EmpleadoVO> selecionarEmpleadosPorIdControlador(int id);
}
