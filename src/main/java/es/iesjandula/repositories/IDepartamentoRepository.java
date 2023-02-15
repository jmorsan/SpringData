package es.iesjandula.repositories;

import es.iesjandula.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDepartamentoRepository extends JpaRepository<Departamento,Long>
{
    List<Departamento>findByNombreIgnoreCaseIsStartingWith(String letra);
}
