package tptransversal;

import java.time.LocalDate;
import java.util.ArrayList;
import tptransversal.data.AlumnoData;
import tptransversal.data.ConexionS;
import tptransversal.data.InscripcionData;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Inscripcion;
import tptransversal.modelo.Materia;

public class TPTransversal {

    public static void main(String[] args) {
        AlumnoData alD = new AlumnoData();
        MateriaData maD = new MateriaData();
        InscripcionData insD = new InscripcionData();

        //GUARDAR ALUMNO
        //Alumno al = new Alumno(26694777, "Mauro", "Castro",LocalDate.of(1978,11,1) , true);
        //alD.guardarAlumno(al);
        
        //BUSCAR ALUMNO       
        //Alumno al = alD.buscarAlumno(4);
        
        //LISTAR ALUMNO
             ArrayList listaalumnos = alD.listarAlumnos();
            for (Object al : listaalumnos) {
                System.out.println(al);
            }
        
        //ACTUALIZAR ALUMNO
        //    Alumno al = alD.buscarAlumno(4);
        //    al.setApellido("CASTRO2");
        //    alD.actualizarAlumno(al);
        //     System.out.println(al);
        
        //BORRAR ALUMNO
        //     Alumno al = alD.buscarAlumno(4);
        //     alD.borrarAlumno(al);
        //
        
        //-----------------------------------------------------------
      
        //GUARDAR MATERIA
        // Materia mat = new Materia("EDA","Primero", true);
        // maD.guardarMateria(mat);
        
        //BUSCAR MATERIA
        //Materia mat = maD.buscarMateria(1);
        //System.out.println(mat);
        
        //ACTUALIZAR MATERIA
        // Materia mat = maD.buscarMateria(1);
        // mat.setNombreMateria("MATEMATICA 2");
        // maD.actualizarMateria(mat);
        // System.out.println(mat);
        
        //BORRAR MATERIA
        //     Materia mat = maD.buscarMateria(1);
        //     maD.borrarMateria(mat);
        
        //LISTAR MATERIAS
        ArrayList<Materia> listaMaterias = maD.listarMaterias();
        for (Object ma : listaMaterias) {
           System.out.println(ma);
        }
        
        //-----------------------------------------------------------
        
        //GUARDAR INSCRIPCION
        // Inscripcion ins = new Inscripcion();
        //ins.setIdAlumno(alD.buscarAlumno(1));
        //ins.setIdMateria(maD.buscarMateria(2));
        //ins.setNota(9);
        //insD.guardarInscripcion(ins);
        
        //BUSCAR INSCRIPCION
        //Inscripcion ins = insD.buscarInscripcion(9);
        //System.out.println(ins);
        
        //BORRAR INSCRIPCION
        //insD.borrarInscripcion(1);
        
        //LISTAR INSCRIPCIONES
         ArrayList<Inscripcion> listains = insD.listarInscripcion();
        for (Object ins : listains) {
            System.out.println(ins);
        }
        
        //ACTUALIZAR INSCRIPCION
        //    Inscripcion ins = insD.buscarInscripcion(9);
        //    ins.setNota(5);
        //    insD.actualizaInscripcion(ins);
        
        //OBTENER MATERIAS INSCRIPTAS DE UN ALUMNO
        // Alumno al = alD.buscarAlumno(2);
        // ArrayList<Materia> listaMaterias = insD.obtenerMateriasInscriptas(al);
        // for (Object ma : listaMaterias) {
        //   System.out.println(ma);
        // }
        
        // OBTENER MATERIAS NO INSCRIPTAS DE UN ALUMNO
        // Alumno al = alD.buscarAlumno(2);
        //ArrayList<Materia> listaMaterias = insD.obtenerMateriasNoInscriptas(al);
        //for (Object ma : listaMaterias) {
        //    System.out.println(ma);
        //}
        
        // OBTENER ALUMNOS INSCRIPTOS A UNA MATERIA
        // Materia mat = maD.buscarMateria(2);
        //ArrayList<Alumno> listaAlumnos = insD.obtenerAlumnosInscriptos(mat);
        //for (Object al : listaAlumnos) {
        //    System.out.println(al);
       // }
    }

}
