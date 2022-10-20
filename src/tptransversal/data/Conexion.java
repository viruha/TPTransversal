
package tptransversal.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private String url;
    private String usuario;
    private String password;
    private Connection conexion;

    public Conexion(String url, String usuario, String password){
        this.url = url;
        this.usuario = usuario;
        this.password = password;
        //this.conexion = conexion;
        //Carga driver mariaDB
        //Class.forName("org.mariadb.jdbc.Driver");
    }
    
    public Connection conectar(){
        if(conexion == null)
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

