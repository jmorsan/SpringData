package es.iesjandula;

import es.iesjandula.models.Alumno;
import es.iesjandula.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Consultas
{
    @Autowired
    private IAlumnoRepository alumnoRepository;

    private List<Alumno> obtenerAlumnosOrdenadosApellido1()
    {
        return alumnoRepository.findAllByOrderByApellido1Asc();
    }



    public void hacerConsultas()
    {

        System.out.println(alumnoRepository.findAllByOrderByApellido1Asc());

    }



}
