package es.iesjandula.repositories;

import es.iesjandula.models.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGradoRepository extends JpaRepository<Grado,Long>
{
}
