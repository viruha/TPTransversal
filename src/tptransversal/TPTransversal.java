package tptransversal;

import java.time.LocalDate;
import java.util.ArrayList;
import tptransversal.data.AlumnoData;
import tptransversal.data.Conexion;
import tptransversal.data.MateriaData;
import tptransversal.modelo.Alumno;
import tptransversal.modelo.Materia;

public class TPTransversal {

    public static void main(String[] args) {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
        conexion.conectar();
        AlumnoData alD = new AlumnoData(conexion);
        MateriaData maD = new MateriaData(conexion);

        //GUARDAR ALUMNO
        //Alumno al = new Alumno(26694777, "Mauro", "Castro",LocalDate.of(1978,11,1) , true);
        //alD.guardarAlumno(al);
        //BUSCAR ALUMNO       
        //Alumno al = alD.buscarAlumno(4);
        //LISTAR ALUMNO
        //     ArrayList listaalumnos = alD.listarAlumnos();
        //    for (Object al : listaalumnos) {
        //        System.out.println(al);
        //    }
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
        //LISTAR MATERIAS
        ArrayList<Materia> listaMaterias = maD.listarMaterias();
        for (Object ma : listaMaterias) {
            System.out.println(ma);
        }

        //GUARDAR ALUMNO
        // Materia mat = new Materia("EDA","Primero", true);
        // maD.guardarMateria(mat);
    }

}
