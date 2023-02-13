package es.iesjandula;


import es.iesjandula.QueryResponse.Consultas;
import es.iesjandula.parseadores.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner
{
    @Autowired
    private AlumnoParser alumnoParser;

    @Autowired
    private AsignaturaParser asignaturaParser;

    @Autowired
    private CursoParser cursoParser ;

    @Autowired
    private DepartamentoParser departamentoParser ;

    @Autowired
    private GradoParser gradoParser ;

    @Autowired
    private MatriculaParser matriculaParser ;

    @Autowired
    private ProfesorParser profesorParser ;

    @Autowired
    private Consultas consultas;




    public static void main(String[] args)
    {
        SpringApplication.run(SpringDataApplication.class, args);



    }


    @Transactional(readOnly=false)
    public void run(String... args) throws Exception
    {
        /*
        this.alumnoParser.mostrarAlumnosPro();
        this.cursoParser.mostrarCursos();
        this.departamentoParser.mostrarDepartamentos();
        this.gradoParser.mostrarGrados();
        this.profesorParser.mostrarProfesores();
        this.asignaturaParser.mostrarAsignaturas();
        this.matriculaParser.mostrarMatriculas();
        */


        consultas.hacerConsultas();

    }



}
