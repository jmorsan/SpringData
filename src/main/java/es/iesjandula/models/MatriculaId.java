package es.iesjandula.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MatriculaId implements Serializable
{
    private static final long serialVersionUID = -3143967472594707221L;

    private Long idAlumno;

    private Long idAsignatura;

    private Long idCurso;

    public MatriculaId()
    {

    }

    public Long getIdAlumno()
    {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno)
    {
        this.idAlumno = idAlumno;
    }

    public Long getIdAsignatura()
    {
        return idAsignatura;
    }

    public void setIdAsignatura(Long idAsignatura)
    {
        this.idAsignatura = idAsignatura;
    }

    public Long getIdCurso()
    {
        return idCurso;
    }

    public void setIdCurso(Long idCurso)
    {
        this.idCurso = idCurso;
    }
}
