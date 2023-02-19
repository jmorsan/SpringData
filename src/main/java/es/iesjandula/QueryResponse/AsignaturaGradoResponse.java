package es.iesjandula.QueryResponse;

public class AsignaturaGradoResponse
{
     private String nombreAsig;

     private String nombreGrado;




    public AsignaturaGradoResponse()
    {
    }

    public AsignaturaGradoResponse(String nombreAsig, String nombreGrado)
    {
        this.nombreAsig = nombreAsig;
        this.nombreGrado = nombreGrado;
    }

    public String getNombreAsig()
    {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig)
    {
        this.nombreAsig = nombreAsig;
    }

    public String getNombreGrado()
    {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado)
    {
        this.nombreGrado = nombreGrado;
    }

    @Override
    public String toString()
    {
        return
                "Asignatura : " + nombreAsig +
                " --> Grado: " + nombreGrado;
    }
}
