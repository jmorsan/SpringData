package es.iesjandula.repositories;

import es.iesjandula.models.Matricula;
import es.iesjandula.models.MatriculaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatriculaRepository extends JpaRepository<Matricula, MatriculaId>
{
}
