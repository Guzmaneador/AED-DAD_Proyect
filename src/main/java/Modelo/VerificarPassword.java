package Modelo;

/**
 *
 * @author Guzman
 */
public class VerificarPassword {
    
    
    public void verificar(String password){
        boolean cumpleRequesitos=true;
        
    }
    public boolean verificarLongitud(String password){
        if (password.length()<8)
            return false;
        else 
            return true;
    }
    
    public boolean verificarCaracteres(String password){
        
        
        return true;
    }

}