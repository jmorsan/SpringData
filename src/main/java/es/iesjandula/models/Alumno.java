package es.iesjandula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="alumno")
public class Alumno
{
    @Id
    @Column(length = 10)
    private Long id;

    @Column(length = 9, unique = true)
    private String nif;

    @Column(length = 25, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido1;

    @Column (length = 50)
    private String apellido2;

    @Column(length = 50, nullable = false)
    private String ciudad;

    @Column(length = 50, nullable = false)
    private String direccion;

    @Column(length = 9)
    private String telefono;

    @Column(nullable = false)
    private Date fechaNacimiento;

    @Column(length = 1, nullable = false)
    private String sexo;



}
