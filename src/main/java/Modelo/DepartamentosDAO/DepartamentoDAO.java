package Modelo.DepartamentosDAO;

import java.util.ArrayList;

/**
 *
 * @author Guzman
 */
public interface DepartamentoDAO {
    
    public String insertar(DepartamentoVO departamento);
    public String borrar(int id);
    public String actualizar (DepartamentoVO departamento);
    public ArrayList<Integer> listaDepartamentos();
    public DepartamentoVO dameDepartamentoId(int id);
    
    
}