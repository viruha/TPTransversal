
package tptransversal.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    // completar los datos de conexion aca y conexion null
    private String url;
    private String usuario;
    private String password;
    private Connection conexion;

    // poner privado para singleton
    public Conexion(String url, String usuario, String password){
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }
    //poner static
    public Connection conectar(){
        if(conexion == null)
            //construir conexion vacia llamar constructor misma 
        {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url,usuario,password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }             
        
    return conexion;
    }
       
   

    
}

