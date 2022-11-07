package tptransversal.data;

import tptransversal.modelo.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = ConexionS.conectar();

    public AlumnoData() {
        
    }

    public int guardarAlumno(Alumno al) {
        String query = "INSERT INTO `alumno`(`dni`, `nombre`, `apellido`, `fechaDeNacimiento`, `estado`) VALUES (?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, al.getDni());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getApellido());
            ps.setDate(4, Date.valueOf(al.getFechaDeNacimiento()));
            ps.setBoolean(5, al.getEstado());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se agrego el alumno");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar en la bd");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                al.setIdAlumno(rs.getInt(1));
                return al.getIdAlumno();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID del alumno");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public Alumno buscarAlumno(int id) {
        Alumno al = null;
        String sql = "SELECT * FROM `alumno` WHERE idalumno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al = new Alumno();
                al.setIdAlumno(rs.getInt("idalumno"));
                al.setDni(rs.getInt("dni"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                al.setFechaDeNacimiento(rs.getDate("fechaDeNacimiento").toLocalDate());
                al.setEstado(rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return al;
    }

    public ArrayList<Alumno> listarAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno al = null;
        String sql = "SELECT * FROM alumno WHERE estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al = new Alumno();
                al.setIdAlumno(rs.getInt("idalumno"));
                al.setDni(rs.getInt("dni"));
                al.setNombre(rs.getString("nombre"));
                al.setApellido(rs.getString("apellido"));
                al.setFechaDeNacimiento(rs.getDate("fechaDeNacimiento").toLocalDate());
                al.setEstado(rs.getBoolean("estado"));
                alumnos.add(al);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alumnos;
    }

    public void actualizarAlumno(Alumno al) {
        String query = "UPDATE alumno SET dni = ?, nombre = ?, apellido = ?, fechaDeNacimiento = ?, estado= ? WHERE idAlumno = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, al.getDni());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getApellido());
            ps.setDate(4, Date.valueOf(al.getFechaDeNacimiento()));
            ps.setBoolean(5, al.getEstado());
            ps.setInt(6, al.getIdAlumno());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El alumno fue actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno fue NO fue actualizado");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void borrarAlumno(Alumno al) {
        String query = "UPDATE alumno SET estado = 0 WHERE `idAlumno` = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, al.getIdAlumno());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El alumno fue Suspendido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El alumno NO fue Suspendido");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
