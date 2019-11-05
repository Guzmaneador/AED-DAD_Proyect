package Modelo;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Guzman
 */
public class PoolConexiones {
    private BasicDataSource poolConexiones;

    public PoolConexiones() {
        poolConexiones = new BasicDataSource();
        poolConexiones.setUrl("jdbc:mysql://192.168.56.101:3306/empresa?autoReconnect=true&useSSL=true");
        poolConexiones.setUsername("munchi");
        poolConexiones.setPassword("linux");
    }
    
public BasicDataSource getPoolConexion(){
    return poolConexiones;
}
}