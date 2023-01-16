package es.iesjandula.repositories;

import es.iesjandula.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnoRepository extends JpaRepository<Alumno,Long>
{
}
