package tptransversal.data;


import tptransversal.modelo.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AlumnoData {
    private Connection con = null;

    public AlumnoData(Conexion con) {
        this.con = con.conectar();
    }
        
    public void guardarAlumno(Alumno al){
        String query = "INSERT INTO `alumno`(`dni`, `nombre`, `apellido`, `fechaDeNacimiento`, `estado`) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps =  con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, al.getDni());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getApellido());
            ps.setDate(4, Date.valueOf(al.getFechaDeNacimiento()));
            ps.setBoolean(5, al.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                al.setIdAlumno(rs.getInt(1));
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID del alumno");
            ps.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                

        
        
    }
    
    
}
