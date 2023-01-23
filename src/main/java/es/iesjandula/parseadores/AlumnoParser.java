package es.iesjandula.parseadores;

import es.iesjandula.models.Alumno;
import es.iesjandula.models.Asignatura;
import es.iesjandula.models.Grado;
import es.iesjandula.models.Profesor;
import es.iesjandula.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Service
public class AlumnoParser
{
    @Autowired
    private IAlumnoRepository iAlumnoRepository;

    public void mostrarAlumnosPro()
    {
        String alumnos = "src/main/resources/SCV/alumno.csv";
        List<Alumno> listaAlumnos = new ArrayList<>();
        File file = new File(alumnos);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Alumno alumno = new Alumno();

                alumno.setId(Long.valueOf(stLineaFichero[0]));
                alumno.setNif(stLineaFichero[1]);
                alumno.setNombre(stLineaFichero[2]);
                alumno.setApellido1(stLineaFichero[3]);
                alumno.setApellido2(stLineaFichero[4]);
                alumno.setCiudad(stLineaFichero[5]);
                alumno.setDireccion(stLineaFichero[6]);
                alumno.setTelefono(stLineaFichero[7]);
                alumno.setFechaNacimiento(convertStringToDateFormatddMMyyyy(stLineaFichero[8]));
                alumno.setSexo(stLineaFichero[9]);

                listaAlumnos.add(alumno);


            }

            this.iAlumnoRepository.saveAllAndFlush(listaAlumnos);

            /**
            for(Alumno alumno : listaAlumnos)
            {
                System.out.println(alumno);
            }
             **/

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }

    public Date convertStringToDateFormatddMMyyyy(final String dateString)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try
        {
            date = simpleDateFormat.parse(dateString);
        }
        catch (ParseException parseException)
        {
            parseException.printStackTrace();
        }

        return date;
    }
}
