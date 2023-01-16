package es.iesjandula.repositories;

import es.iesjandula.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso,Long>
{
}
