package es.iesjandula.QueryResponse;

import es.iesjandula.models.Asignatura;

public class AsignaturaResponse extends Asignatura
{
    String nombre;

    Integer curso;

    String tipo;

    @Override
    public String getNombre()
    {
        return nombre;
    }

    @Override
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public Integer getCurso()
    {
        return curso;
    }

    public void setCurso(int curso)
    {
        this.curso = curso;
    }

    @Override
    public String getTipo()
    {
        return tipo;
    }

    @Override
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    @Override
    public String toString()
    {
        return "AsignaturaResponse{" +
                "nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
