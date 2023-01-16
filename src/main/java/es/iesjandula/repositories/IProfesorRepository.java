package es.iesjandula.repositories;

import es.iesjandula.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepository extends JpaRepository<Profesor,Long>
{
}
