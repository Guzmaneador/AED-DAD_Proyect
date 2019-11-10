package Modelo.DepartamentosDAO;

import Modelo.PoolConexiones;
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
public class DepartamentoDAOJDBCImpl implements DepartamentoDAO{
    Connection conexion ;
    DataSource pool = new PoolConexiones().getPoolConexion();
    ResultSet resultado ;
    
    private final String SQL_INSERT = "INSERT INTO departamentos (id,nombre,ubicacion) VALUES (?,?,?)";
    private final String SQL_UPDATE = "UPDATE departamentos SET id=? nombre=? ubicacion=? WHERE id=?";
    private final String SQL_DELETE = "DELETE FROM departamentos WHERE id=?";
    private final String SQL_SELECT_ALL= "SELECT * FROM departamentos";
    private final String SQL_SELECT_ID= "SELECT id FROM departamentos";
    private final String SQL_SELECT_DEPARTAMENTOS= "SELECT * FROM departamentos WHERE id=?";
    private Connection miConexion;
    private PreparedStatement miPreparedStatement;
    private ResultSet miResultSet;
    private int filas;

    public DepartamentoDAOJDBCImpl() {
    }
    
   public int insertar (int id, String nombre, String ubicacion){
       return 2;
   }
   public int actualizar(int id, String nombre, String ubicacion){
       return 2;
   }
    

    @Override
    public String insertar(DepartamentoVO departamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(DepartamentoVO departamento,int id) {
        try {
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_UPDATE);
            miPreStatment.setString(1, Integer.toString(departamento.getId()));
            miPreStatment.setString(2, departamento.getNombre());
            miPreStatment.setString(3, departamento.getUbicacion());
            miPreStatment.setString(4, Integer.toString(id));
            System.out.println(miPreStatment);
            miPreStatment.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Actualizado correctamente";
    }

    @Override
    public ArrayList<Integer> listaDepartamentos() {
        ArrayList<Integer> listaDepartamentos = new ArrayList<>();
        try {
            conexion = pool.getConnection();
            Statement miStatement = conexion.createStatement();
            resultado= miStatement.executeQuery(SQL_SELECT_ID);
            while (resultado.next()){
                listaDepartamentos.add(resultado.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDepartamentos; 
    }
    @Override
    public ArrayList<DepartamentoVO> listaDepartamentosVO() {
        ArrayList<DepartamentoVO> listaDepartamentoVO = new ArrayList<>();
        try {
            conexion = pool.getConnection();
            Statement miStatement = conexion.createStatement();
            resultado= miStatement.executeQuery(SQL_SELECT_ALL);
            while (resultado.next()){
                listaDepartamentoVO.add(new DepartamentoVO(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("ubicacion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDepartamentoVO;
        
    }

    @Override
    public DepartamentoVO dameDepartamentoId(int id) {
        try {
            DepartamentoVO departamento;
            conexion = pool.getConnection();
            PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_DEPARTAMENTOS);
            miPreStatment.setString(1, Integer.toString(id));
            resultado=miPreStatment.executeQuery();
            if(resultado.next()){
            departamento= new DepartamentoVO(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("ubicacion"));     
            return departamento;
            }else throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


            
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
    
}