package es.iesjandula.repositories;

import es.iesjandula.QueryResponse.AlumnoResponse;
import es.iesjandula.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAlumnoRepository extends JpaRepository<Alumno,Long>
{
    List<Alumno> findAllByNombre(String nombre);

    List<Alumno> findAllByTelefono(String telefono);
}
