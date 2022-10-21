package tptransversal;

import java.time.LocalDate;
import java.util.ArrayList;
import tptransversal.data.AlumnoData;
import tptransversal.data.Conexion;
import tptransversal.modelo.Alumno;


public class TPTransversal {


    public static void main(String[] args) {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad","root","");
        conexion.conectar();
        AlumnoData alD = new AlumnoData(conexion);
 
 //guardarAlumno
        //Alumno al = new Alumno(26694777, "Mauro", "Castro",LocalDate.of(1978,11,1) , true);
        //alD.guardarAlumno(al);
 
  //buscarAlumno       
        //Alumno al = alD.buscarAlumno(4);
       

//listaalumnos
         ArrayList listaalumnos = alD.listarAlumnos();
        for (Object al : listaalumnos) {
            System.out.println(al);
        }
       
  //actualizarAlumno
   //    Alumno al = alD.buscarAlumno(4);
   //    al.setApellido("CASTRO2");
   //    alD.actualizarAlumno(al);
   //     System.out.println(al);
        
        

    }
    
}
