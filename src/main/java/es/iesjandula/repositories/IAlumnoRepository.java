package es.iesjandula.repositories;

import es.iesjandula.QueryResponse.AlumnoResponse;
import es.iesjandula.models.Alumno;
import es.iesjandula.models.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAlumnoRepository extends JpaRepository<Alumno,Long>
{
    List<Alumno> findByNombre(String nombre);

    List<Alumno> findByTelefono(String telefono);

    List<Alumno> findByNifEndsWith(String letra);
}
