package es.iesjandula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
public class Curso
{
    @Id
    @Column(length = 10)
    private Long id;

    @Column(length = 10, nullable = false)
    private Integer anyoFin;

    @Column(length = 10, nullable = false)
    private Integer anyoInicio;

    public Curso()
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

    public Integer getAnyoFin()
    {
        return anyoFin;
    }

    public void setAnyoFin(Integer anyoFin)
    {
        this.anyoFin = anyoFin;
    }

    public Integer getAnyoInicio()
    {
        return anyoInicio;
    }

    public void setAnyoInicio(Integer anyoInicio)
    {
        this.anyoInicio = anyoInicio;
    }
}
