package es.iesjandula.parseadores;

import es.iesjandula.models.Curso;
import es.iesjandula.repositories.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CursoParser
{
    @Autowired
    private ICursoRepository iCursoRepository;

    public void mostrarCursos()
    {
        String cursos = "src/main/resources/SCV/curso.csv";

        List<Curso> listaCurso = new ArrayList<>();

        File file = new File(cursos);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Curso curso = new Curso();

                curso.setId(Long.valueOf(stLineaFichero[0]));
                curso.setAnyoFin(Integer.valueOf(stLineaFichero[1]));
                curso.setAnyoInicio(Integer.valueOf(stLineaFichero[2]));



                listaCurso.add(curso);

            }

            this.iCursoRepository.saveAllAndFlush(listaCurso);

            /**
            for(Curso curso : listaCurso)
            {
                System.out.println(curso);
            }
             **/

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }

}
