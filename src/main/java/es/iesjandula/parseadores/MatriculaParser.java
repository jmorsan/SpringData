package es.iesjandula.parseadores;

import es.iesjandula.models.*;
import es.iesjandula.repositories.IAlumnoRepository;
import es.iesjandula.repositories.IAsignaturaRepository;
import es.iesjandula.repositories.ICursoRepository;
import es.iesjandula.repositories.IMatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class MatriculaParser
{
    @Autowired
    private IMatriculaRepository iMatriculaRepository;

    @Autowired
    private IAlumnoRepository iAlumnoRepository;

    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;

    @Autowired
    private ICursoRepository icursoRepository;

    public void mostrarMatriculas()
    {
        String matriculas = "src/main/resources/SCV/matricula.csv";

        List<Matricula> listaMatricula = new ArrayList<>();

        File file = new File(matriculas);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Matricula matricula = new Matricula();

                Optional<Alumno> optionalAlumno = this.iAlumnoRepository.findById(Long.valueOf(stLineaFichero[0]));
                matricula.setIdAlumno(optionalAlumno.get());

                Optional<Asignatura> optionalAsignatura = this.iAsignaturaRepository.findById(Long.valueOf(stLineaFichero[1]));
                matricula.setIdAsignatura(optionalAsignatura.get());

                Optional<Curso> optionalCurso = this.icursoRepository.findById(Long.valueOf(stLineaFichero[2]));
                matricula.setIdCurso(optionalCurso.get());

                //++++++++++IMPORTANTE+++++++++++++-->Añadimos instancia de matriculaID
                MatriculaId matriculaId = new MatriculaId();
                matriculaId.setIdAlumno(optionalAlumno.get().getId());
                matriculaId.setIdCurso(optionalCurso.get().getId());
                matriculaId.setIdAsignatura(optionalAsignatura.get().getId());

                matricula.setMatriculaID(matriculaId);


                listaMatricula.add(matricula);

            }

            this.iMatriculaRepository.saveAllAndFlush(listaMatricula);

            /**
            for(Matricula matricula : listaMatricula)
            {
                System.out.println(matricula);
            }
             **/

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }

}
