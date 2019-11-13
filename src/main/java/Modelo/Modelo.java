package Modelo;

import Modelo.DepartamentosDAO.DepartamentoVO;
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
    public void actualizarEmpleado(EmpleadoVO empleado,String nif) throws SQLException;
    public void actualizarEmpleado(EmpleadoVO empleado,String nif,String password) throws SQLException;
    public ArrayList<Integer> dameDepartamentos();
    public DepartamentoVO dameDepartamento(int id);
    public void actualizarDepartamento(DepartamentoVO departamento,int id);
    public ArrayList<DepartamentoVO> listaDepartamentosVOModelo();
    public ArrayList<EmpleadoVO> listaEmpleadoVOModelo();
    public void borrarEmpleadoModelo(String nif);
    public void crearEmpleadoModelo(EmpleadoVO empleado,String password);
    
}
