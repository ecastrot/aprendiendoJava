/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.poo.estudiante;

import com.mintic.poo.academia.Materia;
import java.util.Date;

/**
 *
 * @author ecastrot
 */
public class Asistencia {
    private Date fecha;
    private Estudiante estudiante; 
    private Materia materia;

    public Asistencia(Date fecha, Estudiante estudiante, Materia materia) {
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

}
