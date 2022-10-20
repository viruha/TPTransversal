package tptransversal;

import java.time.LocalDate;
import tptransversal.data.AlumnoData;
import tptransversal.data.Conexion;
import tptransversal.modelo.Alumno;


public class TPTransversal {


    public static void main(String[] args) {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad","root","");
        conexion.conectar();
        Alumno al = new Alumno(26694777, "Mauro", "Castro",LocalDate.of(1978,11,1) , true);
        AlumnoData alD = new AlumnoData(conexion);
        alD.guardarAlumno(al);
        

    }
    
}
