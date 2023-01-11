package es.iesjandula.models;

import jakarta.persistence.*;

@Entity
@Table(name = "matricula")
public class Matricula
{
    @EmbeddedId
    private MatriculaId matriculaID;

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    @MapsId("idAlumno")
    private Alumno idAlumno;

    @ManyToOne
    @JoinColumn(name = "id_asignatura")
    @MapsId("idAsignatura")
    private Asignatura idAsignatura;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    @MapsId("idCurso")
    private Curso idCurso;

    public Matricula()
    {
    }

    public MatriculaId getMatriculaID()
    {
        return matriculaID;
    }

    public void setMatriculaID(MatriculaId matriculaID)
    {
        this.matriculaID = matriculaID;
    }

    public Alumno getIdAlumno()
    {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno)
    {
        this.idAlumno = idAlumno;
    }

    public Asignatura getIdAsignatura()
    {
        return idAsignatura;
    }

    public void setIdAsignatura(Asignatura idAsignatura)
    {
        this.idAsignatura = idAsignatura;
    }

    public Curso getIdCurso()
    {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso)
    {
        this.idCurso = idCurso;
    }
}
