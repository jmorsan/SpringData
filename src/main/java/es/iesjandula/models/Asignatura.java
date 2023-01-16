package es.iesjandula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="asignatura")
public class Asignatura
{
    @Id
    @Column(length = 10)
    private Long id;

    @Column(length = 10)
    private Double creditos;

    @Column(length = 10)
    private int cuatrimestre;

    @Column(length = 10)
    private Double creditos;


}
