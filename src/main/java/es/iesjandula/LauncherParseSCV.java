package es.iesjandula;

import es.iesjandula.models.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LauncherParseSCV
{
    public static void main(String[] args)
    {

        LauncherParseSCV launcherParseSCV = new LauncherParseSCV();

        launcherParseSCV.mostrarAlumnosPro();
        launcherParseSCV.mostrarAsignaturas();
        launcherParseSCV.mostrarCursos();
        launcherParseSCV.mostrarGrados();
        launcherParseSCV.mostrarDepartamentos();
        launcherParseSCV.mostrarMatriculas();
        launcherParseSCV.mostrarProfesores();

    }

    private void mostrarAlumnosPro()
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
            for(Alumno alumno : listaAlumnos)
            {
                System.out.println(alumno);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }

    private void mostrarAsignaturas()
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
                Grado grado = new Grado();
                grado.setId(Long.valueOf(stLineaFichero[7]));
                asignatura.setGradoId(grado);
                Profesor profesor = new Profesor();
                profesor.setId(Long.valueOf(stLineaFichero[6]));
                asignatura.setProfesorId(profesor);



                listaAsignatura.add(asignatura);

            }
            for(Asignatura asignatura : listaAsignatura)
            {
                System.out.println(asignatura);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    private void mostrarCursos()
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
            for(Curso curso : listaCurso)
            {
                System.out.println(curso);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    private void mostrarDepartamentos()
    {
        String departamentos = "src/main/resources/SCV/departamento.csv";

        List<Departamento> listaDepartamento = new ArrayList<>();

        File file = new File(departamentos);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Departamento departamento = new Departamento();

                departamento.setId(Long.valueOf(stLineaFichero[0]));
                departamento.setNombre(stLineaFichero[1]);

                listaDepartamento.add(departamento);

            }
            for(Departamento departamento : listaDepartamento)
            {
                System.out.println(departamento);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    private void mostrarGrados()
    {
        String grados = "src/main/resources/SCV/grado.csv";

        List<Grado> listaGrado = new ArrayList<>();

        File file = new File(grados);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Grado grado = new Grado();

                grado.setId(Long.valueOf(stLineaFichero[0]));
                grado.setNombre(stLineaFichero[1]);

                listaGrado.add(grado);

            }
            for(Grado grado : listaGrado)
            {
                System.out.println(grado);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    private void mostrarMatriculas()
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

                Alumno alumno = new Alumno();
                alumno.setId(Long.valueOf(stLineaFichero[0]));
                matricula.setIdAlumno(alumno);

                Asignatura asignatura = new Asignatura();
                asignatura.setId(Long.valueOf(stLineaFichero[1]));
                matricula.setIdAsignatura(asignatura);

                Curso curso = new Curso();
                curso.setId(Long.valueOf(stLineaFichero[2]));
                matricula.setIdCurso(curso);


                listaMatricula.add(matricula);

            }
            for(Matricula matricula : listaMatricula)
            {
                System.out.println(matricula);
            }

        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    private void mostrarProfesores()
    {
        String profesores = "src/main/resources/SCV/profesor.csv";

        List<Profesor> listaProfesores = new ArrayList<>();
        File file = new File(profesores);

        try
        {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while(scanner.hasNextLine())
            {
                String lineaFichero = scanner.nextLine();
                String[] stLineaFichero = lineaFichero.split(",");

                Profesor profesor = new Profesor();

                profesor.setId(Long.valueOf(stLineaFichero[0]));
                profesor.setNif(stLineaFichero[1]);
                profesor.setNombre(stLineaFichero[2]);
                profesor.setApellido1(stLineaFichero[3]);
                profesor.setApellido2(stLineaFichero[4]);
                profesor.setCiudad(stLineaFichero[5]);
                profesor.setDireccion(stLineaFichero[6]);
                profesor.setTelefono(stLineaFichero[7]);
                profesor.setFechaNacimiento(convertStringToDateFormatddMMyyyy(stLineaFichero[8]));
                profesor.setSexo(stLineaFichero[9]);

                Departamento departamento = new Departamento();
                departamento.setId(Long.valueOf(stLineaFichero[10]));
                profesor.setIdDepartamento(departamento);

                listaProfesores.add(profesor);


            }
            for(Profesor profesor : listaProfesores)
            {
                System.out.println(profesor);
            }

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
