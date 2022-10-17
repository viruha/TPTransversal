package tptransversal.modelo;

import java.time.LocalDate;

public class Alumno {

    private int idAlumno;

    private int dni;

    private String nombre;

    private String apellido;

    private LocalDate fechaDeNacimiento;

    private Boolean estado;

    public Alumno(int idAlumno, int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, Boolean estado) {
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fechaDeNacimiento, Boolean estado) {
    }

    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.idAlumno;
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
        final Alumno other = (Alumno) obj;
        return this.idAlumno == other.idAlumno;
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
