package tptransversal.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tptransversal.modelo.Materia;

public class MateriaData {

    private Connection con = null;

    public MateriaData(Conexion con) {
        this.con = con.conectar();
    }

    public void guardarMateria(Materia ma) {
        String query = "INSERT INTO `materia`(`nombreMateria`, `anio`, `estado`) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ma.getNombreMateria());
            ps.setString(2, ma.getAnio());
            ps.setBoolean(3, ma.getEstado());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se agrego la Materia");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar en la bd");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ma.setIdMateria(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID de la materia");
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia buscarMateria(int id) {
        Materia ma = null;
        String sql = "SELECT * FROM `materia` WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ma = new Materia();
                ma.setIdMateria(rs.getInt("idMateria"));
                ma.setNombreMateria(rs.getString("nombreMateria"));
                ma.setAnio(rs.getString("anio"));
                ma.setEstado(rs.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ma;
    }

    public ArrayList<Materia> listarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
        Materia ma = null;
        String sql = "SELECT * FROM `materia`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ma = new Materia();
                ma.setIdMateria(rs.getInt("idMateria"));
                ma.setNombreMateria(rs.getString("nombreMateria"));
                ma.setAnio(rs.getString("anio"));
                ma.setEstado(rs.getBoolean("estado"));
                materias.add(ma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }

    public void actualizarMateria(Materia ma) {
        String query = "UPDATE `materia` SET `nombreMateria`=?,`anio`=?,`estado`=? WHERE `idMateria` = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ma.getNombreMateria());
            ps.setString(2, ma.getAnio());
            ps.setBoolean(3, ma.getEstado());
            ps.setInt(4, ma.getIdMateria());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Materia fue actualizado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Materia fue NO fue actualizado");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarMateria(Materia ma) {
        String query = "UPDATE `materia` SET `estado`= 0 WHERE `idMateria` = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            //ps.setBoolean(3, ma.getEstado());
            ps.setInt(1, ma.getIdMateria());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Materia fue suspendida");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Materia NO fue Suspendida");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*utiliza int id como parametro
        String sql = "DELETE FROM `materia` WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La materia fue borrada");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La materia NO pudo ser borrada");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }
}
