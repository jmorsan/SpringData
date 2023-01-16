package es.iesjandula.repositories;

import es.iesjandula.models.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaRepository extends JpaRepository<Asignatura,Long>
{
}
