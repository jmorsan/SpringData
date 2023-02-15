package es.iesjandula.repositories;

import es.iesjandula.QueryResponse.AlumnoResponse;
import es.iesjandula.QueryResponse.AsignaturaResponse;
import es.iesjandula.models.Alumno;
import es.iesjandula.models.Asignatura;
import es.iesjandula.models.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAsignaturaRepository extends JpaRepository<Asignatura,Long>
{
    List<Asignatura> findByCreditosGreaterThan(int creditos);

    List<Asignatura> findTop10ByOrderByCreditosAsc();

    AsignaturaResponse findTop1ByTipoAndCurso(String tipo, int curso );

    Integer countByTipo(String tipo);

    List<Asignatura> findByProfesorIdId(long id);

    List<Asignatura> findByCuatrimestreAndCurso(int cuatrimestre,int curso);

    //Los alumnos y sus asignaturas matriculadas
    @Query("select alum.nombre, asig.nombre from alumno alum join matricula mat on alum.id = mat.id_alumno join asignatura asig on asig.id = mat.id_asignatura")
    List<MyResponse>listaAlumnoAsignatura();

    //Alumnos que menos asignaturas está matriculado
    @Query(value = "select alum.nombre, COUNT(mat.id_asignatura) AS cantidadAsignaturas from alumno alum join matricula mat on alum.id = mat.id_alumno join asignatura asig on asig.id = mat.id_asignatura GROUP BY  mat.id_alumno HAVING  COUNT(mat.id_asignatura) = ( select COUNT(mat.id_asignatura) AS cantidadAsignaturas from alumno alum join matricula mat on alum.id = mat.id_alumno join asignatura asig on asig.id = mat.id_asignatura GROUP BY  mat.id_alumno ORDER BY mat.id_alumno DESC LIMIT 1)", nativeQuery = true)
    List<MyResponse>listaAlumnoNumAsignatura();

    //Cantidad de alumnos matriculados en cada asignatura
    @Query(value = "select asig.nombre, COUNT(mat.id_asignatura) AS cantidadAlumnosMatriculados from alumno alum join matricula mat on alum.id = mat.id_alumno join asignatura asig on asig.id = mat.id_asignatura GROUP BY  mat.id_asignatura ORDER BY cantidadAlumnosMatriculados", nativeQuery = true)
    List<MyResponse>listaAlumnoNumAsignatura();





}
