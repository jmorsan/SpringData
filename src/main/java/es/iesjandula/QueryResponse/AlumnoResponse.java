package es.iesjandula.QueryResponse;

public class AlumnoResponse
{
    private String nombre;

    private String apellido1;

    private String apellido2;

    private String nif;

    public AlumnoResponse()
    {
    }

    public AlumnoResponse(String nombre, String apellido1, String apellido2, String nif)
    {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido1()
    {
        return apellido1;
    }

    public void setApellido1(String apellido1)
    {
        this.apellido1 = apellido1;
    }

    public String getApellido2()
    {
        return apellido2;
    }

    public void setApellido2(String apellido2)
    {
        this.apellido2 = apellido2;
    }

    public String getNif()
    {
        return nif;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    @Override
    public String toString()
    {
        return
                "Alumno : " + nombre +
                " " + apellido1 + " " +
                 apellido2 + " " +
                " NIF : " + nif;
    }
}
