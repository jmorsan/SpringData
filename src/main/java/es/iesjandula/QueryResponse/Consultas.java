package es.iesjandula.QueryResponse;

import es.iesjandula.models.Alumno;
import es.iesjandula.models.Asignatura;
import es.iesjandula.models.Departamento;
import es.iesjandula.models.Grado;
import es.iesjandula.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.List;

@Service
public class Consultas
{
    @Autowired
    private IAlumnoRepository alumnoRepository;

    @Autowired
    private IAsignaturaRepository asignaturaRepository;

    @Autowired
    private ICursoRepository cursoRepository;

    @Autowired
    private IDepartamentoRepository departamentoRepository;

    @Autowired
    private IGradoRepository gradoRepository;

    @Autowired
    private IMatriculaRepository matriculaRepository;

    @Autowired
    private IProfesorRepository profesorRepository;


    public void hacerConsultas()
    {
        System.out.println();
        System.out.println("Alumno con Nombre 'Juan' :");
        for(Alumno alumno:alumnoRepository.findAllByNombre("Juan"))
        {
            System.out.println(alumno);
        }

        System.out.println();
        System.out.println("Grados que contengan la palabra 'Ingenieria' :");
        for(Grado grado: gradoRepository.findAllByNombreContaining("Ingenieria"))
        {
            System.out.println(grado);
        }

        System.out.println();
        System.out.println("Asignatura que tienen mas de 7 creditos :");
        for(Asignatura asignatura: asignaturaRepository.findAllByCreditosGreaterThan(7))
        {
            System.out.println(asignatura);
        }

        System.out.println();
        System.out.println("Departamentos que empiezan por la letra 'E' ignorando mayusculas  :");
        for(Departamento departamento: departamentoRepository.findAllByNombreIgnoreCaseIsStartingWith("E"))
        {
            System.out.println(departamento);
        }

        System.out.println();
        System.out.println("Departamentos que empiezan por la letra 'E' ignorando mayusculas  :");
        for(Departamento departamento: departamentoRepository.findAllByNombreIgnoreCaseIsStartingWith("E"))
        {
            System.out.println(departamento);
        }

        System.out.println();
        System.out.println("Top 10 Asignaturas ordenadas desc por creditos (Los 10 Asignaturas que menos creditos tienen) :");
        for(Asignatura asignatura: asignaturaRepository.findTop10ByOrderByCreditosAsc())
        {
            System.out.println(asignatura);
        }

        /*
        System.out.println();
        System.out.println("Asignaturas obligatoria pertenecientes al primer curso :");
        for(AsignaturaResponse asignaturaResponse: asignaturaRepository.findAllByTipoAndCurso("obligatoria",1))
        {
            System.out.println(asignaturaResponse);
        }
        */

        System.out.println();
        System.out.println("Contar el numero de asignaturas tipo basica :");

        System.out.println(asignaturaRepository.countAllByTipo("básica"));

        System.out.println();
        System.out.println("Asignatura que imparte el profesor Fahey(id 9) :");
        for(Asignatura asignatura: asignaturaRepository.findAllByProfesorIdId(9L))
        {
            System.out.println(asignatura);
        }

        System.out.println();
        System.out.println("Asignaturas pertenecientes al segundo cuatrimestre del tercer curso :");
        for(Asignatura asignatura: asignaturaRepository.findAllByCuatrimestreAndCurso(2,3))
        {
            System.out.println(asignatura);
        }

        System.out.println();
        System.out.println("Alumnos que no han registrado el telefono :");
        for(Alumno alumno:alumnoRepository.findAllByTelefono(" "))
        {
            System.out.println(alumno);
        }
















    }



}
