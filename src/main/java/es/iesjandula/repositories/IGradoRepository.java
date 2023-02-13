package es.iesjandula.repositories;

import es.iesjandula.models.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IGradoRepository extends JpaRepository<Grado,Long>
{
    List<Grado> findAllByNombreContaining(String grado);


}
