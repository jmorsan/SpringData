package es.iesjandula.QueryResponse;

import es.iesjandula.models.Asignatura;

public class AsignaturaResponse
{
     private String nombre;


    public AsignaturaResponse()
    {
    }

    public AsignaturaResponse(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }



    @Override
    public String toString()
    {
        return "AsignaturaResponse{" +
                "nombre='" + nombre + '\'' +

                '}';
    }
}
