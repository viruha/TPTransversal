package tptransversal.data;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import tptransversal.modelo.Inscripcion;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Materia;

public class InscripcionData {

    private Connection con = null;

    public InscripcionData(Conexion con) {
        this.con = con.conectar();
    }

    
    
    public void guardarInscripcion(Inscripcion ins) {
        String query = "INSERT INTO `inscripcion`(`idAlumno`, `idMateria`, `nota`) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getIdAlumno().getIdAlumno());
            ps.setInt(2, ins.getIdMateria().getIdMateria());
            ps.setFloat(3, ins.getNota());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se registro la Inscripcion");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar en la bd");
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripcion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo recuperar el ID de la inscripcion");
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Inscripcion buscarInscripcion(int id) {  //(idalumno, idmateria)?
        //BORRAR buscar otra forma de conectarse
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        //-------
        Inscripcion ins = new Inscripcion();
        String sql = "SELECT * FROM `inscripcion` WHERE `idInscripcion` = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AlumnoData aluD = new AlumnoData(conexion);
                MateriaData matD = new MateriaData(conexion);
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setIdAlumno(aluD.buscarAlumno(rs.getInt("idAlumno")));
                ins.setIdMateria(matD.buscarMaeria(rs.getInt("idMateria")));
                ins.setNota(rs.getFloat("nota"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ins;
    }

    public ArrayList<Inscripcion> listarInscripcion() { //queda
        //BORRAR buscar otra forma de conectarse
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        //-------
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        Inscripcion ins = null;
        String sql = "SELECT * FROM `inscripcion`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ins = new Inscripcion();
                AlumnoData aluD = new AlumnoData(conexion);
                MateriaData matD = new MateriaData(conexion);
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                ins.setIdAlumno(aluD.buscarAlumno(rs.getInt("idAlumno")));
                ins.setIdMateria(matD.buscarMaeria(rs.getInt("idMateria")));
                ins.setNota(rs.getFloat("nota"));
                inscripciones.add(ins);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inscripciones;
    }

    public void actualizaInscripcion(Inscripcion ins) { //O actualizar nota?
        String query = "UPDATE `inscripcion` SET `idAlumno`=?,`idMateria`=?,`nota`=? WHERE `idInscripcion`=?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ins.getIdAlumno().getIdAlumno());
            ps.setInt(2, ins.getIdMateria().getIdMateria());
            ps.setFloat(3, ins.getNota());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Inscricpion fue actualizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Inscripcion NO fue actualizada");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarInscripcion(int id) { //(idalumno, idmateria)?
        String sql = "DELETE FROM `inscripcion` WHERE idInscripcion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La Inscripcion fue borrada");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Inscripcion NO pudo ser borrada");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Materia> obtenerMateriasInscriptas(Alumno al ) { //revisar metodo
        //BORRAR buscar otra forma de conectarse
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        //-------
        ArrayList<Materia> materias = new ArrayList<>();
        Materia mat = null;
        String sql = "SELECT * FROM `inscripcion`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mat = new Materia();
              //  AlumnoData aluD = new AlumnoData(conexion);
              //  MateriaData matD = new MateriaData(conexion);
              //  ins.setIdInscripcion(rs.getInt("idInscripcion"));
              //  ins.setIdAlumno(aluD.buscarAlumno(rs.getInt("idAlumno")));
               // ins.setIdMateria(matD.buscarMaeria(rs.getInt("idMateria")));
               // ins.setNota(rs.getFloat("nota"));
                materias.add(mat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }
    
    public ArrayList<Materia> obtenerMateriasNoInscriptas(Alumno al ) { //revisar metodo
        //BORRAR buscar otra forma de conectarse
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        //-------
        ArrayList<Materia> materias = new ArrayList<>();
        Materia mat = null;
        String sql = "SELECT * FROM `inscripcion`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mat = new Materia();
              //  AlumnoData aluD = new AlumnoData(conexion);
              //  MateriaData matD = new MateriaData(conexion);
              //  ins.setIdInscripcion(rs.getInt("idInscripcion"));
              //  ins.setIdAlumno(aluD.buscarAlumno(rs.getInt("idAlumno")));
               // ins.setIdMateria(matD.buscarMaeria(rs.getInt("idMateria")));
               // ins.setNota(rs.getFloat("nota"));
                materias.add(mat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }
    
    public ArrayList<Alumno> obtenerAlumnosInscriptos(Materia mat ) { //revisar metodo
        //BORRAR buscar otra forma de conectarse
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        //-------
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno al = null;
        String sql = "SELECT * FROM `inscripcion`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al = new Alumno();
              //  AlumnoData aluD = new AlumnoData(conexion);
              //  MateriaData matD = new MateriaData(conexion);
              //  ins.setIdInscripcion(rs.getInt("idInscripcion"));
              //  ins.setIdAlumno(aluD.buscarAlumno(rs.getInt("idAlumno")));
               // ins.setIdMateria(matD.buscarMaeria(rs.getInt("idMateria")));
               // ins.setNota(rs.getFloat("nota"));
                alumnos.add(al);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos;
    }
}
