package tptransversal.modelo;

public class Inscripcion {

    private int idInscripcion;

    private Alumno idAlumno;

    private Materia idMateria;

    private float nota;

    public Inscripcion(int idInscripcion, Alumno idAlumno, Materia idMateria, float nota) {
    }

    public Inscripcion(Alumno idAlumno, Materia idMateria, float nota) {
    }

    public Inscripcion() {
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.idInscripcion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscripcion other = (Inscripcion) obj;
        return this.idInscripcion == other.idInscripcion;
    }


    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
