package es.iesjandula.repositories;

import es.iesjandula.QueryResponse.AlumnoResponse;
import es.iesjandula.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAlumnoRepository extends JpaRepository<Alumno,Long>
{
    Alumno findByNombre(String nombre);

    AlumnoResponse findNombreByNombreAndApellido1(String nombre, String apellido1);



    List<Alumno> findAllByOrderByApellido1Asc();
}
