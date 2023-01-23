package es.iesjandula.models;

import jakarta.persistence.*;

@Entity
@Table(name="asignatura")
public class Asignatura
{
    @Id
    @Column(length = 10)
    private Long id;

    @Column(length = 10, nullable = false)
    private Double creditos;

    @Column(length = 10, nullable = false)
    private Integer cuatrimestre;

    @Column(length = 10, nullable = false)
    private Integer curso;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(length = 25, nullable = false)
    private String tipo;

    @ManyToOne
    private Grado gradoId;

    @ManyToOne
    private Profesor profesorId;

    public Asignatura()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Double getCreditos()
    {
        return creditos;
    }

    public void setCreditos(Double creditos)
    {
        this.creditos = creditos;
    }

    public Integer getCuatrimestre()
    {
        return cuatrimestre;
    }

    public void setCuatrimestre(Integer cuatrimestre)
    {
        this.cuatrimestre = cuatrimestre;
    }

    public Integer getCurso()
    {
        return curso;
    }

    public void setCurso(Integer curso)
    {
        this.curso = curso;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public Grado getGradoId()
    {
        return gradoId;
    }

    public void setGradoId(Grado gradoId)
    {
        this.gradoId = gradoId;
    }

    public Profesor getProfesorId()
    {
        return profesorId;
    }

    public void setProfesorId(Profesor profesor)
    {
        this.profesorId = profesor;
    }
}
