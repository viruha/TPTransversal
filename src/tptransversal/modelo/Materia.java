package tptransversal.modelo;

public class Materia {

    private int idMateria;

    private String nombreMateria;

    private String anio;

    private Boolean estado;

    public Materia(int idMateria, String nombreMateria, String anio, Boolean estado) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(String nombreMateria, String anio, Boolean estado) {
        this.nombreMateria = nombreMateria;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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
        hash = 71 * hash + this.idMateria;
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
        final Materia other = (Materia) obj;
        return this.idMateria == other.idMateria;
    }

    @Override
    public String toString() {
        return  idMateria + " " + nombreMateria + " anio= " + anio;
    }

}
