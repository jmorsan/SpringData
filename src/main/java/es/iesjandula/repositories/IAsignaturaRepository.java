package es.iesjandula.repositories;

import es.iesjandula.QueryResponse.AlumnoResponse;
import es.iesjandula.QueryResponse.AsignaturaResponse;
import es.iesjandula.models.Alumno;
import es.iesjandula.models.Asignatura;
import es.iesjandula.models.Grado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAsignaturaRepository extends JpaRepository<Asignatura,Long>
{
    List<Asignatura> findAllByCreditosGreaterThan(int creditos);

    List<Asignatura> findTop10ByOrderByCreditosAsc();

    //List<AsignaturaResponse> findAllByTipoAndCurso(String tipo, int curso );

    Integer countAllByTipo(String tipo);

    List<Asignatura> findAllByProfesorIdId(long id);

    List<Asignatura> findAllByCuatrimestreAndCurso(int cuatrimestre,int curso);



}
