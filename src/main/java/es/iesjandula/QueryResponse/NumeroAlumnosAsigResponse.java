package es.iesjandula.QueryResponse;

public class NumeroAlumnosAsigResponse
{

    Long numAsignaturas;

    public NumeroAlumnosAsigResponse()
    {
    }

    public NumeroAlumnosAsigResponse(Long numAsignaturas)
    {
        this.numAsignaturas = numAsignaturas;
    }

    public Long getNumAsignaturas()
    {
        return numAsignaturas;
    }

    public void setNumAsignaturas(Long numAsignaturas)
    {
        this.numAsignaturas = numAsignaturas;
    }

    @Override
    public String toString()
    {
        return
                "Cantidad Asignaturas : " + numAsignaturas;
    }
}
