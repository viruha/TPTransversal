
package tptransversal.data;

import java.sql.Connection;


public class InscripcionData {
    
        private Connection con = null;

    public InscripcionData(Conexion con) {
        this.con = con.conectar();
    }
    
    
}
