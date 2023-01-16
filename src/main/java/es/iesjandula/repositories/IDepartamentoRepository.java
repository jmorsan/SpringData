package es.iesjandula.repositories;

import es.iesjandula.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentoRepository extends JpaRepository<Departamento,Long>
{
}
