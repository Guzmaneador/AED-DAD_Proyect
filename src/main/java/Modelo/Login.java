package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;

/**
 *
 * @author Guzman
 */
public class Login {
    String usuario,contraseña;
    String nif,tipo;
    String SQL_SELECT_EMPLEADOS= "SELECT nombre, tipo FROM empleados";
    String SQL_SELECT_NIF="SELECT nif FROM `empleados` WHERE nombre=?";

    String SQL_COMPARE_PASSWORD="SELECT AES_DECRYPT(password, ?) FROM login WHERE nif=?";
    ResultSet resultado ;
    Connection conexion;
//    DataSource pool = new PoolConexiones().getPoolConexion();

    public Login(ArrayList<String> userPass,Connection conexion) throws SQLException {
        this.usuario = userPass.get(0);
        this.contraseña = userPass.get(1);
        this.conexion = ConexionMySQL.getConexion();

        /*
        Modelo devuelve un objeto EmpleadosVO de tipo empleado el cual trata la interfa
        Cambia los valores de de este en caso de que ek usuario los modifique 
        y le manda dicho obejoto al la clase EmpleadosDAO
        */
        
    }
    public String  analizarDatos() throws SQLException{
        if(verificarUser()){
            obtenerNif();
            if(compararPassword()){
                System.out.println("--USUARIO LOGEADO--");
                return usuario;
            }else{
                System.out.println("Datos Incorrectos2");
                return "";
            }
        }else{
            System.out.println("Datos incorrectos");
            return "";
        }
    }
    
    public boolean verificarUser() throws SQLException{
        boolean existe = false;
        Statement  miStatement =conexion.createStatement();
        resultado = miStatement.executeQuery(SQL_SELECT_EMPLEADOS);
        while (resultado.next()){
            if(resultado.getString("nombre").equals(usuario)){
                tipo=resultado.getString("tipo");
                existe=true;
                break;       
            }
        } 
        return existe;    
    }
    public void obtenerNif() throws SQLException{
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_SELECT_NIF);
       miPreStatment.setString(1, usuario);
       resultado=miPreStatment.executeQuery();
       if(resultado.next())
        nif=resultado.getString("nif");
       
    }

    public boolean compararPassword() throws SQLException{
        String clave= "";
       boolean contraseñaCorrecta =false;
       PreparedStatement miPreStatment= conexion.prepareCall(SQL_COMPARE_PASSWORD);
       miPreStatment.setString(1, contraseña);

       miPreStatment.setString(2, nif);

       
       resultado=miPreStatment.executeQuery();
       ResultSetMetaData rsmd = resultado.getMetaData();
       if(resultado.next())
              clave=resultado.getString(rsmd.getColumnName(1));
       if(clave != null)    
                   contraseñaCorrecta= true;



        return contraseñaCorrecta;
     
    }

}

