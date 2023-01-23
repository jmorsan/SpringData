package es.iesjandula.parseadores;

import es.iesjandula.models.Asignatura;
import es.iesjandula.models.Grado;
import es.iesjandula.models.Profesor;
import es.iesjandula.repositories.IAsignaturaRepository;
import es.iesjandula.repositories.IGradoRepository;
import es.iesjandula.repositories.IProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class AsignaturaParser
{
    @Autowired
    private IAsignaturaRepository iAsignaturaRepository;

    @Autowired
    private IProfesorRepository iProfesorRepository;

    @Autowired
    private IGradoRepository iGradoRepository;

    public void mostrarAsignaturas()
    {
        String asignaturas = "src/main/resources/SCV/asignatura.csv";

        List<Asignatura> listaAsignatura = new ArrayList<>();

        File file = new File(asignaturas);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Asignatura asignatura= new Asignatura();

                asignatura.setId(Long.valueOf(stLineaFichero[0]));
                asignatura.setCreditos(Double.valueOf(stLineaFichero[2]));
                asignatura.setCuatrimestre(Integer.valueOf(stLineaFichero[5]));
                asignatura.setCurso(Integer.valueOf(stLineaFichero[4]));
                asignatura.setNombre(stLineaFichero[1]);
                asignatura.setTipo(stLineaFichero[3]);

                Optional<Grado> optionalGrado = this.iGradoRepository.findById(Long.valueOf(stLineaFichero[7]));
                asignatura.setGradoId(optionalGrado.get());

                Optional<Profesor>optionalProfesor = this.iProfesorRepository.findById(Long.valueOf(stLineaFichero[6]));
                asignatura.setProfesorId(optionalProfesor.get());

                listaAsignatura.add(asignatura);

            }

            this.iAsignaturaRepository.saveAllAndFlush(listaAsignatura);

            /**
            for(Asignatura asignatura : listaAsignatura)
            {
                System.out.println(asignatura);
            }
             **/

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
}
